<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cursos</title>
    </head>
    <body>
        <h1>MODULO DE CURSOS</h1>
        <br>
        <a href ="crear.jsp">CREAR NUEVO CURSO</a>
        <table border="1">
            <thead>
            <th>ID</th>
            <th>NOMBRE</th>
            <th>DESCRIPCION</th>
        </thead>
        <tbody>
            <%
                Conexion con = new Conexion();
                con.setSql("select * from courses");
                while (con.getRs().next()) {
                    out.println("<tr>");
                        out.println("<td>"+con.getRs().getString("id")+"</td>");
                            out.println("<td>"+con.getRs().getString("name")+"</td>");
                            out.println("<td>"+con.getRs().getString("description")+"</td>");
                        out.println("</tr>");   
                }
            %>
        </tbody>
    </table>
</body>
</html>