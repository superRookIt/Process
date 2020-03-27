/*	$("p"), 
	$("#name") id
	$(".name") class
	$(this) 자기자신
 */


$(document).ready(function() {
	
	$("#tt1").hide();
	$("#tt2").hide();
	$("#tt3").hide();
	$("#tt4").hide();
	$("#tt5").hide();
	
	$("#product1").click(function(){
		if($(this).is(":checked")){
			$("#tt1").show(); //eq(0): li의 첫번째 
		}else{
			$("#tt1").hide();
		}
	})
	
	$("#product2").click(function(){
		if($(this).is(":checked")){
			$("#tt2").show(); //eq(0): li의 첫번째 
		}else{
			$("#tt2").hide();
		}
	})
	
	$("#product3").click(function(){
		if($(this).is(":checked")){
			$("#tt3").show(); //eq(0): li의 첫번째 
		}else{
			$("#tt3").hide();
		}
	})
	
	$("#product4").click(function(){
		if($(this).is(":checked")){
			$("#tt4").show(); //eq(0): li의 첫번째 
		}else{
			$("#tt4").hide();
		}
	})
	
	$("#product5").click(function(){
		if($(this).is(":checked")){
			$("#tt5").show(); //eq(0): li의 첫번째 
		}else{
			$("#tt5").hide();
		}
	})
	
	
	

	
	

}); // 제이쿼리 시작할때 필수구문!

