<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#subForm").click(function() {  
            var params = $("#highfreForm").serialize();  
            $.ajax( {  
                type : "POST",  
                url : "calYoyAvgn",  
                data : params,  
                success : function(msg) {  
                    alert("success: " + msg);  
                }  
            });  
        })  
		
	});
</script> -->

</head>
<body>
<h2 align="center">高频预估值和移动平均计算</h2>

<center>
	<form action="/calYoyAvg" method="post" name="highfreForm" id="highfreForm">
		<table border="0">
			<tr>
				<td>选择指标</td>
				<td><select name="selectIndex">
						<option value="2">PPI</option>
						<option value="9">VA</option>
						<option value="13">GFP</option>
						<option value="8">OPI</option>
						<option value="1">IPI</option>
						<option value="17">IC</option>
						<option value="14">EXP</option>
						<option value="15">IMP</option>
						<option value="12">PROF</option>
						<option value="24">RCU</option>
						<option value="22">AS</option>
						<option value="23">AD</option>
				</select></td>
			</tr>
			<tr>
				<td>选择行业</td>
				<td><select id="selectIndus" name="selectIndus">
						<option value="2">煤炭开采和洗选业</option>
						<option value="1">农林牧渔业</option>
						<option value="3">石油和天然气开采业</option>
						<option value="4">黑色金属矿采选业</option>
						<option value="5">有色金属矿采选业</option>
						<option value="6">非金属矿及其他矿采选业</option>
						<option value="7">农副食品加工业</option>
						<option value="8">食品制造业</option>
						<option value="9">酒、饮料和精制茶制造业</option>
						<option value="10">烟草制品业</option>
						<option value="11">纺织业</option>
						<option value="12">纺织服装、鞋、帽制造业</option>
						<option value="13">皮革、毛皮、羽毛（绒）及其制品业</option>
						<option value="14">木材加工及木、竹、藤、棕、草制品业</option>
						<option value="15">家具制造业</option>
						<option value="16">造纸及纸制品业</option>
						<option value="17">印刷业和记录媒介的复制业</option>
						<option value="18">文教体育用品制造业</option>
						<option value="19">石油加工、炼焦及核燃料加工业</option>
						<option value="20">化学原料及化学制品制造业</option>
						<option value="21">医药制造业</option>
						<option value="22">化学纤维制造业</option>
						<option value="23">橡胶和塑料制品业</option>
						<option value="24">非金属矿物制品业</option>
						<option value="25">黑色金属冶炼及压延加工业</option>
						<option value="26">有色金属冶炼及压延加工业</option>
						<option value="27">金属制品业</option>
						<option value="28">通用设备制造业</option>
						<option value="29">专用设备制造业</option>
						<option value="30">汽车制造业</option>
						<option value="31">铁路船舶及其他交通运输设备制造业</option>
						<option value="32">电气机械及器材制造业</option>
						<option value="33">计算机、通信和其他电子设备制造业</option>
						<option value="34">仪器仪表制造业</option>
						<option value="35">其他制造业</option>
						<option value="36">废品废料</option>
						<option value="37">电力、热力的生产和供应业</option>
						<option value="38">燃气生产和供应业</option>
						<option value="39">水的生产和供应业</option>
						<option value="40">建筑业</option>
						<option value="130">第三产业</option>
						<option value="41">铁路运输业</option>
						<option value="42">道路运输业</option>
						<option value="43">水上运输业</option>
						<option value="44">航空运输业</option>
						<option value="45">管道运输业</option>
						<option value="46">装卸搬运和其他运输服务业</option>
						<option value="47">仓储业</option>
						<option value="48">信息传输、软件和信息技术服务业</option>
						<option value="49">批发零售业</option>
						<option value="50">住宿业</option>
						<option value="51">餐饮业</option>
						<option value="52">银行业、证券业和其他金融活动</option>
						<option value="53">保险业</option>
						<option value="54">房地产业</option>
						<option value="55">租赁业</option>
						<option value="56">商务服务业</option>
						<option value="57">科学研究、技术服务和地质勘查业</option>
						<option value="58">水利管理业</option>
						<option value="59">环境管理业</option>
						<option value="60">公共设施管理业</option>
						<option value="61">居民服务、修理和其他服务业</option>
						<option value="62">教育</option>
						<option value="63">卫生</option>
						<option value="64">社会保障和福利</option>
						<option value="65">新闻出版业</option>
						<option value="66">广播、电视、电影和音像业</option>
						<option value="67">文化艺术业</option>
						<option value="68">体育</option>
						<option value="69">娱乐业</option>
						<option value="70">公共管理和社会组织</option>
				</select></td>
			</tr>
			<tr>
				<td><input id="subForm" type="submit" value="提交"/></td>
			</tr>

		</table>


	</form>
</center>
</body>

</html>