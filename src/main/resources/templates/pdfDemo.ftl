<!DOCTYPE HTML>
<html>
	<head>
	
	</head>
	<body style="font-family: SimSun;line-height:1">
		<div style="width:100%;">
			
			<p align="center">
				<span style="font-size:20px;font-weight:bolder;"><b>${FYMC!"　　　"}</b></span><br/>
				<span style="font-size:25px;font-weight:bolder;"><b>协助执行通知书</b></span><br/>
				<span style="font-size:14px;font-weight:bolder;"><b>(回执)</b></span><br/>
			</p>
				
			<p style="line-height:32px;text-indent:2em">
				<div>${FYMC!"　　　"}：</div>
			</p>
			<p style="text-indent:2em;word-break:break-all">
			           <div style="padding-left:30px">你院${CKWH}执行裁定书、${AH!"　　　"}协助执行通知书收悉，我行处理结果如下：</div>
			</p>
			<#if  KZZT == "1">
				<p style="text-indent:2em">
				   
					<div style="padding-left:30px">
					     被执行人（或其他法律地位）${XM!"　　　　"}在我行${KHZH}账户内的
						${LCZH}金融资产
						${SKSE}份（计量单位）已被冻结，冻结期限自
					       ${CSKSRQ}至
					       ${CSJSRQ}，该金融资产交易限制将于 ${CSJSRQ}解除。
					</div>
				</p>
			</#if> 
			<#if  KZZT == "2">
				<p style="text-indent:2em">
				     
					<div style="padding-left:30px">
					        因${WNKZYY}原因，被执行人（或其他法律地位）${XM!"　　　　"}在我行
					                ${KHZH}账户内的
					                ${LCZH}金融资产未能冻结。
					  </div>
				     
				</p>
			</#if>
			<div style="background:url(${KHWD!"0"});background-repeat: no-repeat;background-position: center;background-position:top;width:250px;height:250px;margin-right: 10px;margin-top: 100px;float: right;padding-top: 150px;padding-left: 100px;padding-right: 10px">
			     <div style="margin-top: -70px;padding-top: 0px">${DATE!"　　　　"}</div>			
			</div>	
		</div>
	</body>
</html>



