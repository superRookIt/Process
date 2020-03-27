/*	$("p"), 
	$("#name") id
	$(".name") class
	$(this) 자기자신
 */

$(document).ready(function() {

	
	$("li").click(function() {
//		$(this).css("color","red");
//		$(this).css({"color": "red"});
		$(this).hide();
	})
	
	/*$("#l02").click(function(){
		$("#l02").css("color","green");
	})
	
	$("#l03").click(function(){
		$("#l03").css("color","blue");
	})

	$("#l04").click(function(){
		$("#l04").css("color","yellow")
	})
	
	$("#l05").click(function(){
		$("#l05").css("color","purple")
	})*/
	

	$("#btn01").click(function() {
		$("p").hide(); //hide ()괄호!

	});
	
	$("#btn02").click(function(){
		
		$("p").show(); //show () 괄호!
	})
	
	
	$("#img01").click(function(){
		//아이디면 #붙여야
		
		$("img").hide();
		
	}) //; 안붙여도 됨 ^^..
	
	$("#img02").click(function(){
		
		$("img").show();
	})
	
	

}); // 제이쿼리 시작할때 필수구문!

