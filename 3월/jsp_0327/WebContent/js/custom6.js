/*
 */

$("document").ready(function(){

	$("#btn01").mouseenter(function() {
		
		$("#d01").stop().animate({
			"background-color":"#efefef",
			"border-radius":"150px",
			});
		
		/*$("#d01").animate({"backgroud":"blue"})*/
		
	})
	
	$("#btn02").click(function() {
		/*$("img").stop().animate({"right" : "300px","width" : "200px"});*/
		$("img").stop().fadeTo("fast",0.2); 
		//0에 가까울수록 흐려짐^^
	})
	
	$("#btn03").click(function() {
		$("img").stop().animate({
			"width" : "300px",
			"top":"300px"
				});
	})
	
	/*$("#btn02").click(function(){
		$("img").animate({"width":"200px"});
	})*/

})