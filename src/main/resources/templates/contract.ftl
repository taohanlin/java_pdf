<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>合同打印</title>
<meta name="viewport" content="width=device-width, initial-scale=0.5"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">body {font-family: SimSun;}</style>
  </head>
  <body >
 <table>
<tr><td><h1 style="font-size:16px;font-weight:700;margin:6px 0;">三、合同金额</h1></td></tr>
<tr><td>合同金额：</td></tr>
<tr><td>人民币  ${capitalMoney}  大写</td></tr>
<tr><td>人民币 ${lowercaseMoney}  小写</td></tr>
<tr><td style="width:400px;height:50px;">电  话：${phone}</td><td style="width:400px;height:50px;"> 电  话：${mobilePhone}</td></tr>
<tr><td style="width:400px;height:50px;">签订时间：${signingTime} </td><td style="width:400px;height:50px;"> 合同结束时间：${endTime}</td></tr>
  </table>
      <p style="margin: 60px 0;">此处加盖代理机构合同审核章，并签署日期（同时甲方、乙方、代理机构加盖骑缝章）</p>
      <h1 style="font-size:16px;font-weight:700;margin:6px 0;text-align: center;">成 交 货 物 清 单</h1>
 
 <table style="border-collapse:collapse;margin:10px 0;borderColor:#000000;height:40;cellPadding:1;width:100%;" align="center" border="1" >
        <tr>
          <td>序号</td><td>品目</td><td>品牌</td><td>产品型号</td><td>单价</td><td>数量</td><td>金额（元）</td>
        </tr>
        ###ordersList###
  </table>
  </body>
</html>