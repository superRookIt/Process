/*
 * 
 */

function move(obj,time){
	
	$(obj).stop().animate({
		"left":"-350px",
		"top":"0"
	},time)
}

function back(css){
	$(css).stop().animate({
		"left":"0",
		"top":"0"
	})
}

$("document").ready(function(){
	
	

	//# 붙이는거 주의하기!! 자꾸 빼먹음
	
	/*$("#p01").hide();
	
	$("#s01").click(function(){
		$("#p01").slideDown(1000);
	})
	
	$("#p01").click(function(){
		$("#p01").slideUp(1000);
	})
	
	$("#f01").click(function(){
		$("#p01").slideToggle(2000);
	})
	
	$("#s01").click(function(){
		$("#p01").stop();
	})*/
	
	
	
	
	

})