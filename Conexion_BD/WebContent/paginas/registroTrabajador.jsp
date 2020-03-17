<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<fieldset style ="width: 300px">
		<legend>Registro Nuevo</legend>		
			<s:form action="RegistroNuevo">
				<s:textfield label="Código" name="txtCod"></s:textfield>
				<s:textfield label="Nombres" name="txtNom"></s:textfield>
				<s:textfield label="Apellidos" name="txtApe"></s:textfield>
				<s:textfield label="Edad" name="txtEdad"></s:textfield>
				<s:radio label="Género" name="rdGen"
							list="#{'1':'Masculino', '2':'Femenino' }"></s:radio>
				
				<s:select label="Departamento" name="cboDep"
							list="#{'1':'Lima','2':'Ancash','3':'Tacna','4':'Arequipa','5':'Piura' }"
							headerkey="-1" headerValue="---Seleccionar---"></s:select>
				
				<s:submit value="Registrar"></s:submit>
			</s:form>
		</fieldset>
	
	</center>
</body>
</html>