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
	
	
	$("#btn01").click(function(){
		
		$("div img").eq(0).stop().animate({
			"width":"600px",
			"border-radius":"300px"
		})
	})
	
	
	$("#btn02").click(function(){
		
		$("div img").eq(1).stop().animate({
			"left":"300px",
			"border-radius":"30px"
		})
		
		$("div img").eq(1).fadeTo("fast",0.9)
	})
	

})