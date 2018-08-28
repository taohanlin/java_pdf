package com.taohanlin.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.pdf.BaseFont;
import com.taohanlin.util.bean.ContractDynamicParam;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @Description: 生成PDF合同工具类
 * @author taohanlin
 * @date 2018年8月27日 下午5:19:32
 */
public class GeneratePdfUtil {

	private static final String TEMPORARY_CONTRACT_HTML = "src/main/resources/contract/temporary.html";// 临时HTML合同，用于转PDF格式

	private static final String SIMSUM_FILE = "src/main/resources/common/simsun.ttc";// 添加字体，解决中文支持问题


	/**
	 * @Description 生成合同
	 * @author taohanlin
	 * @date 2018年8月27日 下午6:06:46
	 * @action GenerateContract
	 * @return String
	 * @throws Exception
	 */
	public static String GenerateContract(ContractDynamicParam param) throws Exception {
		// 生成html合同
		generateHTML(param.getTemplatePath(), param.getTemplateName(), param.getContractParam());
		// 根据html合同生成pdf合同
		generatePDF(param.getContractPath() + param.getContractName());
		// 删除临时html格式合同
		removeFile(TEMPORARY_CONTRACT_HTML);
		return null;
	}

	/**
	 * @Description 生成html格式合同
	 */
	private static void generateHTML(String templatePath, String templateName, Map<String, Object> paramMap) throws Exception {

		Configuration cfg = new Configuration();
		cfg.setDefaultEncoding("UTF-8");
		/**
		 * 1.setClassForTemplateLoading(this.getClass(), "/HttpWeb");
		 * 基于类路径，HttpWeb包下的framemaker.ftl文件
		 * 2.setDirectoryForTemplateLoading(new File("/template"));
		 * 基于文件系统,template目录下的文件
		 * 3.setServletContextForTemplateLoading(request.getSession().getServletContext(), "/template");
		 * 基于Servlet Context，指的是基于WebRoot下的template下的framemaker.ftl文件
		 */
		cfg.setDirectoryForTemplateLoading(new File(templatePath));

		// templateName.ftl为要装载的模板
		Template template = cfg.getTemplate(templateName);

		File outHtmFile = new File(TEMPORARY_CONTRACT_HTML);

		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outHtmFile)));
		// 将参数输出到模版，并操作到HTML上
		template.process(paramMap, out);
		out.close();
	}

	/**
	 * @Description 根据html生成pdf格式合同
	 */
	private static void generatePDF(String pdfUrl) throws Exception {
		File htmFile = new File(TEMPORARY_CONTRACT_HTML);
		File pdfFile = new File(pdfUrl);

		String url = htmFile.toURI().toURL().toString();

		OutputStream os = new FileOutputStream(pdfFile);
		org.xhtmlrenderer.pdf.ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(url);
		org.xhtmlrenderer.pdf.ITextFontResolver fontResolver = renderer.getFontResolver();
		// 解决中文支持问题
		fontResolver.addFont(SIMSUM_FILE, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		renderer.layout();
		renderer.createPDF(os);
		os.close();
	}

	/**
	 * @Description 移除文件
	 */
	private static void removeFile(String fileUrl) {
		File file = new File(fileUrl);
		file.delete();
	}

}
