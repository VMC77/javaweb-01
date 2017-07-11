<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="cl.accesodato.Conexion"%>
<%
    String id = request.getParameter("edit");
    out.println("EL VALOR DEL ID ES: " + id);
    Conexion con = new Conexion();
    con.setSql("select * from users where id='" + id + "'");
    while (con.getRs().next()) {


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <h1>Editar Usuario</h1>
        <br>
        <form method="post" action="../ServletUser?accion=actualizar">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value=<% out.println("" + id);%> readonly></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="name" value=<% out.println(con.getRs().getString("name")); %>></td>
                </tr>
                <tr>
                    <td>1er Apellido</td>
                    <td><input type="text" name="apepat" value=<% out.println(con.getRs().getString("apepat")); %>></td>
                </tr>
                <tr>
                    <td>2do Apellido</td>
                    <td><input type="text" name="apemat" value=<% out.println(con.getRs().getString("apemat")); %>></td>
                </tr>
                <tr>
                    <td>Nombre Cuenta</td>
                    <td><input type="text" name="username" value=<% out.println(con.getRs().getString("username")); %>></td>
                </tr>
                <tr>
                    <td>Clave</td>
                    <td><input type="password" name="password" value=<% out.println(con.getRs().getString("password")); %>></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Crear Cuenta"></td>
                </tr>
            </table>
        </form>
        <%}%>
    </body>
</html>
