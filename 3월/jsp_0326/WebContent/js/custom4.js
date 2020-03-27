/*	$("p"), 
	$("#name") id
	$(".name") class
	$(this) 자기자신
 */


$(document).ready(function() {
	
	$("li").hide();
	
	$("#reading").click(function(){
		if($(this).is(":checked")){
			$("li").eq(0).show(); //eq(0): li의 첫번째 
		}else{
			$("li").eq(0).hide();
		}
	})
	
	$("#bicycle").click(function(){
		if($(this).is(":checked")){
			$("li").eq(1).show();
		}else{
			$("li").eq(1).hide();
		}
	})
	
	$("#game").click(function(){
		if($(this).is(":checked")){
			$("li").eq(2).show();
		}else{
			$("li").eq(2).hide();
		}
	})
	
	

}); // 제이쿼리 시작할때 필수구문!

