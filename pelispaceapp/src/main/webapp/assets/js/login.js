 $(".name").focus(function(){
				  $(".name-help").slideDown(500);
				}).blur(function(){
				  $(".name-help").slideUp(500);
				});
	
				$(".email").focus(function(){
				  $(".email-help").slideDown(500);
				}).blur(function(){
				  $(".email-help").slideUp(500);
				});

		$('document').ready(function()
		{ 		 
		 // name validation
		  var phoneregex = /^[0-9]+$/;
		 
		 $.validator.addMethod("validphone", function( value, element ) {
		     return this.optional( element ) || phoneregex.test( value );
		 }); 
		 
		 // valid email pattern
		 var eregex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		 
		 $.validator.addMethod("validemail", function( value, element ) {
		     return this.optional( element ) || eregex.test( value );
		 });
		 
		 $("#registerForm").validate({
					
		  rules:
		  {
				nombre: {
					required: true,
//					validname: true,
					minlength: 4
				},
				apellidos: {
					required: true,
//					validname: true,
					minlength: 4
				},
				email: {
					required: true,
					validemail: true
				},
				numeroContacto: {
					required: true,
					validphone: true
				},
				password: {
					required: true,
					minlength: 8,
					maxlength: 15
				},
				cpassword: {
					required: true,
					equalTo: '#password'
				},
		   },
		   messages:
		   {
				nombre: {
					required: "Porfavor ingrese su nombre!",
//					validname: "El nombre debe contener sólo alfabetos y espacio!",
					minlength: "Su nombre es demaciado corto!"
					  },
				apellidos: {
					required: "Porfavor ingrese sus apellidos",
//					validname: "El apellido debe contener sólo alfabetos y espacio!",
					minlength: "Su apellido es demaciado corto"
					  },
			    email: {
					  required: "Porfavor ingrese su correo electronico!",
					  validemail: "Ingrese su correo electronico valido!"
					   },
				numeroContacto: {
					  required: "Porfavor ingrese su numero de telefono!",
					  validphone: "El contacto debe ingresar solo numeros!"
					   },
				password:{
					required: "Porfavor ingrese su clave!",
					minlength: "La contraseña debe tener almenos 8 caracteres!"
					},
				cpassword:{
					required: "Porfavor ingrese denuevo su contraseña!",
					equalTo: "La contraseña no concuerda!"
					},
		   },
		   errorPlacement : function(error, element) {
			  $(element).closest('.form-group').find('.help-block').html(error.html());
		   },
		   highlight : function(element) {
			  $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		   },
		   unhighlight: function(element, errorClass, validClass) {
			  $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
			  $(element).closest('.form-group').find('.help-block').html('');
		   },
		   }); 
		 
		 $("#reciboForm").validate({
				
			  rules:
			  {
				  direccionLineaUno: {
						required: true,
//						validname: true,
						minlength: 4
					},
				  provincia: {
						required: true
//						validname: true,
					},
				  distrito: {
						required: true
					},
				  codigoPostal: {
						required: true
					},
				  departamento: {
						required: true
					},
				  pais: {
						required: true
					},
			   },
			   messages:
			   {
				   direccionLineaUno: {
						required: "Porfavor ingrese su direccion!",
//						validname: "El nombre debe contener sólo alfabetos y espacio!",
						minlength: "La direcion es demaciado corto!"
						  },
				   provincia: {
						required: "Porfavor ingrese la provincia"
//						validname: "El apellido debe contener sólo alfabetos y espacio!",
						  },
				   distrito: {
						  required: "Porfavor ingrese el distrito!"
						   },
				   codigoPostal: {
						  required: "Porfavor ingrese el codigo postal!"
						   },
				   departamento:{
						required: "Porfavor ingrese el departamento!"
						},
				   pais:{
						required: "Porfavor ingrese el pais!"
						},
			   },
			   errorPlacement : function(error, element) {
				  $(element).closest('.form-group').find('.help-block').html(error.html());
			   },
			   highlight : function(element) {
				  $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
			   },
			   unhighlight: function(element, errorClass, validClass) {
				  $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
				  $(element).closest('.form-group').find('.help-block').html('');
			   },
			   }); 
	})
	