$(function() {
	
	// for adding a loader
	$(window).load(function(){
		setTimeout(function() {
			$(".se-pre-con").fadeOut("slow");
		}, 500);			
	});	
	
	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');
	
	if((token!=undefined && header !=undefined) && (token.length > 0 && header.length > 0)) {		
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {			
			xhr.setRequestHeader(header,token);			
		});				
	}
	
	// solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Gallery Us':
		$('#gallery').addClass('active');
		break;
//	case 'All Productos':
//		$('#listaProducto').addClass('active');
//		break;
//	case 'Login Us':
//		$('#login').addClass('active');
//		break;
	default:
		if (menu == "Home")
			break;
//		$('#listaProducto').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
	
	var $table = $('#listaProductoTabla');

	// execute the below code only where we have this table
	if ($table.length) {
		// console.log('Inside the table!');

		var jsonUrl = '';
		if (window.categoriaId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/productos';
		} else {
			jsonUrl = window.contextRoot + '/json/data/categoria/'
					+ window.categoriaId + '/productos';
		}

		$table
				.DataTable({
					
					lengthMenu : [ [ 12, 24, 36, -1 ],
							[ '12 PROD', '24 PROD', '36 PROD', 'ALL' ] ],
					pageLength : 12,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								
								
								data : 'imagen',
								bSortable : false,
								mRender : function(data, type, row) {
									$('table thead').remove();
//									$('tr td').remove();
									return '<img src="' + window.contextRoot
											+ '/resources/images/productos/' + data
											+ '" class="dataTableImg"/>';

								}
							},
							{
								data : 'nombre',
								mRender : function(data, type, row) {
									return '<span class="nombretd">' + data + '</span>';
								}
							},
							{
								data : 'audio',
								mRender : function(data, type, row) {
									return '<small class="preciotd">S/.' + data + '</small>'
								}
							},
							{
								data : 'id',
								mRender : function(data, type, row) {

									if (data < 1) {
										return '<span style="color:red">Out of Stock!</span>';
									}

									return '<small class="cantidadtd"> Stock:' + data + '</small>';

								}
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {
									return '<a href="'+ window.contextRoot+ '/ver/'+ data +'/pelicula" alt="Ver detalle" class="claseroro"></a>';
								}

							} 
							]
				});
	}
	
	function errorPlacement(error, element) {
		// Add the 'help-block' class to the error element
		error.addClass("help-block");
		
		// add the error label after the input element
		error.insertAfter(element);
		
		
		// add the has-feedback class to the
		// parent div.validate in order to add icons to inputs
		element.parents(".validate").addClass("has-feedback");	

	}
	
	
	/*------*/
	/* for fading out the alert message after 3 seconds */
	$alert = $('.alert');
	if($alert.length) {
		setTimeout(function() {
	    	$alert.fadeOut('slow');
		   }, 3000
		);		
	}
	
});