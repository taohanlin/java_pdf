package com.taohanlin.util.bean;

import java.util.Map;

/**
 * @Description: 生成合同动态参数
 * @author taohanlin
 * @date 2018年8月27日 下午6:04:56
 */
public class ContractDynamicParam {
	private String templatePath;// 模版路径
	private String templateName;// 模板文件名(.ftl结尾)
	private String contractPath;// 合同生成路径
	private String contractName;// 合同生成文件名(.pdf结尾)
	private Map<String, Object> contractParam;// 合同所需参数

	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getContractPath() {
		return contractPath;
	}

	public void setContractPath(String contractPath) {
		this.contractPath = contractPath;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Map<String, Object> getContractParam() {
		return contractParam;
	}

	public void setContractParam(Map<String, Object> contractParam) {
		this.contractParam = contractParam;
	}

	public ContractDynamicParam(String templatePath, String templateName, String contractPath, String contractName, Map<String, Object> contractParam) {
		this.templatePath = templatePath;
		this.templateName = templateName;
		this.contractPath = contractPath;
		this.contractName = contractName;
		this.contractParam = contractParam;
	}

}
