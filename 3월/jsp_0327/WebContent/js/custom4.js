/*
 */

$("document").ready(function(){
	
	$("#btn01").click(function(){
		$("#img01").fadeToggle();
		$("ul li").toggleClass("on");
		//toggle : 한번 누르면 실행, 또 누르면 취소
		$("p").text("밑줄이 들어갔습니다");
	})
	
	
	$("ul li").mouseenter(function(){
		$(this).addClass("on");
		/*$(this).animate({
			"background-color":"#efefef"
		});*/
		$("p").text("밑줄이 들어갔습니다");
		
	})
	
	$("ul li").mouseleave(function(){
		$(this).removeClass("on");
		$("p").text("밑줄이 사라졌습니다");
		
	})

})