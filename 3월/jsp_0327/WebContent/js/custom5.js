/*
 */

$("document").ready(function(){

		$(window).scroll(function() {
		var sc = $(this).scrollTop();
		$("p").eq(0).text("스크롤 높이 : " + sc);

	})

	var x1=0;
	$("#btn01").click(function() {
       x1 = $("div").eq(1).width()-10;
       $("div").eq(1).width(x1);
	})
	
	var y1=0;
	$("#btn01").click(function() {
       y1 = $("div").eq(1).height()-10;
       $("div").eq(1).height(y1);
	})
	
	$(window).mousemove(function(e){
		// e : 좌표값
		var x = e.pageX;
		var y = e.pageY;
		// document 화면은 window
		$("p").eq(1).text("x 좌표 : "+x);
		$("p").eq(2).text("y 좌표 : "+y);
		
	    //x
		
		 if (x<300) {
			 $("#d01").css("background","green")
			 //$("div").eq(1).css("background","green") } 
		 }
		  else if (x<800) {
		 $("#d01").css("background", "purple") 
		 } 
		 
		 else if (x<1200) {
		 $("#d01").css("background", "blue") 
		 }
		
		//y
		 
		 if (y < 300) { 
			 $("#d02").css("background","url('img/d02.png')")
			 //$("div").eq(2).css("background","green") } 
		}
  		 else if (y < 700) {
		 $("#d02").css("background", "url('img/d03.jpg')")
		} 
		 
		 else if (y < 1000) {
		 $("#d02").css("background", "url('img/d04.jpg')")
		}
		
	})

})