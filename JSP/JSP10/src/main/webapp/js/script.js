//익명함수 window.onload 위치가 어디든지 마지막에 읽힌다.
window.onload=function(){
	var selects=document.getElementsByTagName("select");
	var hiddens=document.getElementsByTagName("input");
	var result=0;
		for(var i=0; i<selects.length; i++){
			console.log(selects[i]);
			selects[i].addEventListener("change", function(){
				var price1=selects[0].value*1000000;
				var price2=selects[1].value*1500000;
				result=price1+price2;
				hiddens[0].value=selects[0].value;
				hiddens[1].value=selects[1].value;
				
				document.getElementsByTagName("h1")[1].innerHTML=result.toLocaleString()+"원";
			});
		}
	};		