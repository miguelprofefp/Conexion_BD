<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	<center>
 		<h2>Resgistro grabado con éxito</h2>
 		<h4>Código: <s:property value="objTra.cod"/></h4>
 		<h4>Nombre y Apellido: <s:property value="objTra.nom"/> <s:property value="objTra.ape"/></h4>
  		<h4>Edad:<s:property value="objTra.edad"/></h4>	
  		<h4>Género:<s:property value="objTra.gen_cod"/></h4>	
  		<h4>Departamento:<s:property value="objTra.dep_cod"/></h4> 
  		
  		<a href='<s:url action="inicio"></s:url>'>Registro Nuevo</a>		
	</center>	 
		 
</body>
</html>