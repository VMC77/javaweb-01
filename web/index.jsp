<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cl.accesodato.Conexion"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba Bdd</title>
    </head>
    <body>
        <%
               Conexion con=new Conexion();
               con.setInsertar("insert into courses(name,description,created_at,state) values ('Sistemas 2', 'Sin Descripcion',now(),'active')");
               con.setInsertar("insert into users (name,apepat,apemat,username,password,created_at,state) values ('Victor', 'Moraga','C', 'vmoraga','secret',now(),'active')");
        %>
           
    </body>
</html>
