/*
 */

$("document").ready(function(){

	$("img").hide();
	
	$("div").click(function(){
		$("p").eq(0).text("div를 클릭했습니다");
	})
	
	$("div").mouseenter(function(){
		$("p").eq(0).text("div에 마우스가 올라갔습니다");
		$(this).css({"background" : "#efefef"});
		//$(this).css({"background-image" : "url('../블라블라ㅋㅋ')"});
		$(this).css({"border-bottom":"5px solid red"})
		// $("img").slideDown(1000);
        // $("img").fadeIn();
	})
	
	$("div").mouseleave(function(){
		$("p").eq(0).text("div에 마우스가 빠져나갔습니다");
		$(this).css({"background" : "yellow"});
		$(this).css({"border-bottom":"1px solid black"})
		//$("img").slideUp(1000);
        //$("img").fadeOut();
	})
	
	//브라우저 
	
	$(window).scroll(function(){
		
		var scroll = $(this).scrollTop();
     	$("div").css("position","fixed")
     	$("div").css("margin","0 auto")
     	$("div").css("left","0")
     	$("div").css("right","0")
		$("p").eq(0).text("스크롤 높이 : "+scroll);
		$("img").show();
		$("img").css("position","fixed");
		
		if(scroll<200){
			$("p").eq(1).text("200이하의 높이입니다");
			$("img").attr("src","img/d02.png");
			$("div").css({"background" : "purple"});
		}else if(scroll<800){
			$("p").eq(1).text("800이하의 높이입니다");
			$("img").attr("src","img/d03.jpg")
			$("div").css({"background" : "red"});
		}else if(scroll<1100){
			$("p").eq(1).text("1100이하의 높이입니다");
			$("img").attr("src","img/d04.jpg")
			$("div").css({"background" : "green"});
		}
		
	})
	
	$(window).resize(function(){
		$("p").eq(0).text("화면이 리사이즈 되었습니다");
		$("div").css("position","fixed")
	})
	

})