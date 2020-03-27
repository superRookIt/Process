/*
 */

$("document").ready(function(){

	$("#btn01").click(function() {
		$("img").css("border", "2px dashed black ")
		$("img").attr({"alt" : "도시이미지","src" : "img/i01.jpg"}); 
		// attr 이미지의 속성값을 바꿈
		$("p").text("도시이미지입니다"); 
	})

	$("#btn02").click(function() {
		$("img").css({"border" : "solid 2px red"})
		$("img").attr({"alt" : "벚꽃이미지","src" : "img/i02.jpg"});
		$("p").text("벚꽃이미지입니다");

	})

})