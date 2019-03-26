<%@include file="../flows-shared/header.jsp" %>
<div style="padding: 70px;">
   	<div id="logo"> 
		<h1><i> Confirm Acount </i></h1>
	</div>
</div>

<div class="wraperConfirm">
	<div class="row">
		<div class="col-sm-6">
			<section>
				<div class="screen">
					<h2>Detalle Personal</h2>
					<div class="side1">
							<a>Nombre : <span>${registerModel.user.nombre} ${registerModel.user.apellidos}</span></a>
							<a>Email : <span>${registerModel.user.email}</span></a>
							<a>Contacto : <span>${registerModel.user.numeroContacto}</span></a>
							<a>Rol : <span>${registerModel.user.rol}</span></a>
					</div>
					<p>
						<a href="${flowExecutionUrl}&_eventId_personal" class="botonEditar">Editar</a>
					</p>
				</div>
			</section>
		</div>
		
		<div class="col-sm-6">
			<section>
				<div class="screen">
					<h2>Detalle Direccion</h2>
			
				<div class="side1">
					<a>Direccion : <span>${registerModel.recibo.direccionLineaUno} </span></a>
					<a>Distrito : <span>${registerModel.recibo.distrito} -  ${registerModel.recibo.codigoPostal} </span></a>
					<a>Provincia : <span>${registerModel.recibo.provincia} </span></a>
					<a>Departamento : <span>${registerModel.recibo.departamento} </span></a>
					<a>Pais : <span>${registerModel.recibo.pais} </span></a>
				</div>
				<p>
					<a href="${flowExecutionUrl}&_eventId_recibo" class="botonEditar">Editar</a>
				</p>
			</div>
			</section>
		</div>
	</div>
	<a href="${flowExecutionUrl}&_eventId_submit" class="botonConfirmar">Confirmar</a>
</div>
<%@include file="../flows-shared/footer.jsp" %>