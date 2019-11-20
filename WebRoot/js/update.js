//// JavaScript Document
$(document).ready(function(){  

	$('.post').blur(function(){
		var value=$(this).val();	
		var reg=new RegExp("^[0-9]{6}$");
		if(!reg.test(value)){
			alert("只能输入6个数字");
		}		
		
	});
	
	$('.name').blur(function(){
		var value=$(this).val();
		if(value.equals("")){
			alert("输入不能为空！");
		}
		
		
	});
});




