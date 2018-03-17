$(function () {
    $('form2').bootstrapValidator({
	message: 'This value is not valid',
       feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
           },
           
        fields: {
        	inputPhone: {
                message: '手机号验证失败',
                validators: {
                	notEmpty: {
                        message: '手机号不能为空'
                    },
                    
                }
            },
   
  
            }
        
    });
});