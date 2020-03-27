/*	$("p"), 
	$("#name") id
	$(".name") class
	$(this) 자기자신
 */


$(document).ready(function() {
	
	$(".pp").hide();
	
	$("#l01").mouseenter(function(){
	  $("#p01").show();	
	  $("#p01").css("background", "black");	
	  $("#p01").css("color", "white");
	})
	
	$("#l01").mouseleave(function(){
	  $("#p01").hide();	
	})
	
	$("#l02").mouseenter(function(){
	  $("#p02").show();	
	  $("#p02").css("background", "black");	
	  $("#p02").css("color", "white");
	})
	
	$("#l02").mouseleave(function(){
	  $("#p02").hide();	
	})
	
	$("#l03").mouseenter(function(){
	  $("#p03").show();	
	  $("#p03").css("background", "black");	
	  $("#p03").css("color", "white");
	})
	
	$("#l03").mouseleave(function(){
	  $("#p03").hide();	
	})
	
	$("#l04").mouseenter(function(){
	  $("#p04").show();	
	  $("#p04").css("background", "black");	
	  $("#p04").css("color", "white");
	})
	
	$("#l04").mouseleave(function(){
	  $("#p04").hide();	
	})
	
	
	

}); // 제이쿼리 시작할때 필수구문!

