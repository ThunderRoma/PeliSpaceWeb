<%@include file="../flows-shared/header.jsp" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
	<div style="padding: 70px;">
        <div id="logo"> 
			<h1><i> BILLING </i></h1>
		</div>
    </div>			
	<div class="fondo">
		<div class="wrapperDireccion">
			<h2> Registrar Direccion </h2>
				<sf:form
					method="POST"
					modelAttribute="recibo"
					class="form"
					id="reciboForm"
				>
		
					<div class="form-body">
						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="direccionLineaUno" class="inputRegister"
									placeholder="Ingrese su dirección" />
								<sf:errors path="direccionLineaUno" cssClass="help-block" element="em"/> 
							</div>
							<span class="help-block" id="error"></span>
						</div>

						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="distrito" class="inputRegister"
									placeholder="Ingrese nombre Distrito" />
								<sf:errors path="distrito" cssClass="help-block" element="em"/>
							</div>
							<span class="help-block" id="error"></span>
						</div>
							
						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="codigoPostal" class="inputRegister"
									placeholder="Ingrese Codigo Postal" />
								<sf:errors path="codigoPostal" cssClass="help-block" element="em"/> 
							</div>
							<span class="help-block" id="error"></span>
						</div>	
						
						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="provincia" class="inputRegister"
									placeholder="Ingrese la provincia" />
								<sf:errors path="provincia" cssClass="help-block" element="em"/> 
							</div>
							<span class="help-block" id="error"></span>
						</div>						
						
						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="departamento" class="inputRegister"
									placeholder="Ingrese el Departamento" />
								<sf:errors path="departamento" cssClass="help-block" element="em"/>
							</div> 
							<span class="help-block" id="error"></span>
						</div>

						<div class="form-group">
							<div class="input-group">
								<sf:input type="text" path="pais" class="inputRegister"
									placeholder="Ingrese el pais" />
								<sf:errors path="pais" cssClass="help-block" element="em"/> 
							</div>
							<span class="help-block" id="error"></span>
						</div>
							
						<div class="form-group">					
								<button type="submit" name="_eventId_confirm" class="submitDireccion">
									Next - Confirm<span class="glyphicon glyphicon-chevron-right"></span>
								</button>
						</div>
					</div>
				</sf:form>
						
			</div>
		</div>

		<%@include file="../flows-shared/footer.jsp" %>			
