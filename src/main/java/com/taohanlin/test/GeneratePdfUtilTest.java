package com.taohanlin.test;

import java.util.HashMap;
import java.util.Map;

import com.taohanlin.util.GeneratePdfUtil;
import com.taohanlin.util.bean.ContractDynamicParam;

public class GeneratePdfUtilTest {

	private static final String TEMPLATES_PATH = "src/main/resources/templates/";

	private static final String CONTRACT_PATH = "src/main/resources/contract/";

	public static void main2(String[] args) throws Exception {
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("capitalMoney", "一千万元整");
			paramMap.put("lowercaseMoney", "10000000.00");
			paramMap.put("phone", "027-123456");
			paramMap.put("mobilePhone", "185****5565");
			paramMap.put("signingTime", "2018.10.21");
			paramMap.put("endTime", "2020.10.21");
		ContractDynamicParam param = new ContractDynamicParam(TEMPLATES_PATH, "contract.ftl", CONTRACT_PATH, "contract.pdf", paramMap);
		GeneratePdfUtil.GenerateContract(param);
		System.out.println("====test2生成PDF合同成功====");
	}

	public static void main(String[] args) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("XM", "張三冯");
		paramMap.put("AH", "(2015)****字第0***0号");
		paramMap.put("CSKSRQ", "2016年10月31日00时00分");
		paramMap.put("KHZH", "271**********07279975");
		paramMap.put("FYMC", "****人民法院");
		paramMap.put("JSRQ", "2017-06-14");
		paramMap.put("KZZT", "1");
		paramMap.put("LCZH", "987234234");
		paramMap.put("DATE", "2017年03月24日09时39分");
		paramMap.put("CKWH", "(2015)*****字第0**20-1**0号裁定书");
		paramMap.put("SKSE", "100");
		paramMap.put("CSJSRQ", "2016年10月31日 00时00分");
		paramMap.put("KHWD", "images/stamp.jpg");
		ContractDynamicParam param = new ContractDynamicParam(TEMPLATES_PATH, "pdfDemo.ftl", CONTRACT_PATH, "pdfDemo5.pdf", paramMap);
		GeneratePdfUtil.GenerateContract(param);
		System.out.println("====test生成PDF合同成功====");
	}
}
