<%@include file="../flows-shared/header.jsp" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>			
	 <div style="padding: 70px;">
        	<div id="logo"> 
			  <h1><i> SIGNUP </i></h1>
			</div>
        </div>
	<div class="fondo">
					<div class="wrapperRegister">
					<h2> CREAR CUENTA </h2>		
						<sf:form
							method="POST"
							role="form"
							autocomplete="off"
							modelAttribute="user"
							class="form"
							id="registerForm" >
							
							<div class="form-body">
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
										<sf:input type="text" path="nombre" class="inputRegister" placeholder="Nombres" />
										<sf:errors path="nombre" cssClass="help-block" element="em"/> 
									</div>
									<span class="help-block" id="error"></span>
								</div>
								
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
										<sf:input type="text" path="apellidos" class="inputRegister"
											placeholder="Apellidos" />
										<sf:errors path="apellidos" cssClass="help-block" element="em"/>
									</div>
									<span class="help-block" id="error"></span>
								</div>
						
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></div>
											<sf:input type="text" path="email" class="inputRegister"
												placeholder="abc@zyx.com" />
											<sf:errors path="email" cssClass="help-block" element="em"/> 									
										</div>
									<span class="help-block" id="error"></span> 
								</div>
	
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon"><span class="glyphicon glyphicon-phone"></span></div>
										<sf:input type="text" path="numeroContacto" class="inputRegister"
											placeholder="XXXXXXXXXX" maxlength="9" />
										<sf:errors path="numeroContacto" cssClass="help-block" element="em"/> 
									</div>
									<span class="help-block" id="error"></span>
								</div>
								
								<div class="form-group">
									<div class="input-group">
                        				<div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
										<sf:input type="password" id="password" path="password" class="inputRegister"
											placeholder="Password" />
										<sf:errors path="password" cssClass="help-block" element="em"/> 
									</div>
									<span class="help-block" id="error"></span>
								</div>
								
								<div class="form-group">
									<div class="input-group">
                        				<div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
										<sf:input type="password" path="confirmPassword" class="inputRegister"
											placeholder="Confirmar password" />
										<sf:errors path="confirmPassword" cssClass="help-block" element="em"/>										 
									</div>
									<span class="help-block" id="error"></span>
								</div>
								
								<div class="form-group">
									<label class="radio-inline">
										<sf:radiobutton path="rol" value="USER" checked="checked"/> User 				
									</label>
									<label class="radio-inline">
										<sf:radiobutton path="rol" value="SUPPLIER"/> Supplier
									</label>
								</div>
							</div>
							<button type="submit" name="_eventId_recibo" class="submitRegister">
								<span class="glyphicon glyphicon-log-in"> Registrarme!</span>
							</button>								
						</sf:form>	
					</div>
				</div>

<%@include file="../flows-shared/footer.jsp" %>			
