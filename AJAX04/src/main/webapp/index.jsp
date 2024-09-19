<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Dynamic parse</title>
	</head>
	<body>
		<h1>상품검색기</h1>
		<form action="#">
			가격대를 선택해 주세요
			<select>
				<option value="500000">500,000</option>
				<option value="1000000">1,000,000</option>
				<option value="1500000">1,500,000</option>
			</select>
			에서
			<select>
				<option value="1000000">1,000,000</option>
				<option value="2000000">2,000,000</option>
				<option value="3000000">3,000,000</option>
			</select>
			까지
			<input type="button" value="조회!" onclick="Search()">
			<span id="header"></span>
			<table id="resultTable">
				<tbody id=resultBody></tbody>
			</table>
		</form>
		
		<script>
			var XHR;
			function createXMLHttpRequest(){
				if(window.ActiveXObject){
					XHR=new ActiveXObject("Micosoft.XMLHTTP");
				}else if(window.XMLHttpRequest){
					XHR=new XMLHttpRequest();
				}
			}
			//createXMLHttpRequest();
			//console.log(XHR);
			
			//클릭되었을때 실행하는 함수
			function Search(){
				createXMLHttpRequest();
				//console.log(XHR);
			
				XHR.onreadystatechange=handleStateChange;
				XHR.open("GET","data.xml",true);
				XHR.send(null);
			}
			function handleStateChange(){
				if(XHR.readyState==4){
					if(XHR.status==200){
						clearResult();
						parseResult();
					}
				}
			}
			
			//결과물을 검색해줄 함수
			function parseResult(){
				var result=XHR.responseXML;
				var product=null;
				var name="";
				var price="";
				var comment="";
				//console.log(result);
				var products=result.getElementsByTagName("product");
				//console.log(products);
				for(var i=0; i<products.length; i++){
					product=products[i];
					name=product.getElementsByTagName("name")[0].innerHTML;
					//console.log(name);
					price=product.getElementsByTagName("price")[0].innerHTML;
					//console.log(price);
					comment=product.getElementsByTagName("comment")[0].innerHTML;
					//console.log(comment);
					addRow(name, price, comment);
				}
				
				//헤더처리
				var header=document.createElement("h2");
				var headerText=document.createTextNode("검색결과 : ");
				header.appendChild(headerText);
				document.getElementById("header").appendChild(header);
				
			}
			//테이블에 내용물을 추가해주는 함수 - tr - td - #text
			function addRow(nm, pr, co){
				var min=document.getElementsByTagName("select")[0].value;
				var max=document.getElementsByTagName("select")[1].value;
				//console.log(min+"에서 "+max+"까지");
				var int_price=parseInt(pr);
				/*console.log("최소검색가격 :"+min);
				console.log("최대검색가격 :"+max);
				console.log("현재 물건 가격 :"+int_price); 
				console.log("물건 조회 여부 :"+(min<=int_price && max>=int_price));*/
				if(min<=int_price && max>=int_price){
					var row=document.createElement("tr");
					
					var td=createTd(nm);
					row.appendChild(td);
					
					td=createTd(pr);
					row.appendChild(td);
					
					td=createTd(co);
					row.appendChild(td);
					
					/*console.log(nm);
					console.log(int_price);
					console.log(co);*/
					//console.log(row);
					
					
					document.getElementById("resultBody").appendChild(row);
				}
				
			
			}
			
			//내용이 들어가 있는 td를 제작해주는 함수
			function createTd(nm){
				var tag=document.createElement("td");
				var textNode=document.createTextNode(nm);
				tag.appendChild(textNode);
				/*document.getElementById("header").appendChild(tag);
				console.log(tag);
				console.log(textNode);*/
				return tag;
			}
			//기존에 작성되어 있던 내용을 화면에서 삭제하는 기능
			function clearResult(){
				var header=document.getElementById("header");
				if(header.hasChildNodes()){
					header.removeChild(header.childNodes[0]);
				}
				var tableBody=document.getElementById("resultBody");
				while(tableBody.childNodes.length>0){
					tableBody.removeChild(tableBody.childNodes[0]);
				}
			}
		</script>
	</body>
</html>