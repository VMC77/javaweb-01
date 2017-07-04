<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cl.accesodato.Conexion"%>
<% 
    HttpSession sesion=request.getSession();
    if(sesion.getAttribute("conectado")==null || sesion.getAttribute("conectado").equals("false")  ){
        response.sendRedirect("index.jsp");
    }else{
    
    }
 %>   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <form method="post" action="ServletUsuario?accion=cerrar">
            <input type="submit" value="Cerrar Sesion">
        </form>
        
        <h1>Bienvenido!!</h1>
        <a href="cursos/index.jsp">Modulo Cursos</a>
        <br>
        <a href="usuarios/index.jsp">Modulo Usuarios</a>          
    </body>
</html>
