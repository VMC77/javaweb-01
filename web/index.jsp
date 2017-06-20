<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cl.accesodato.Conexion"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRUEBA BDD</title>
    </head>
    <body>
        <form method="post" action="ServletUsuario">
            <table>
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Clave</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Ingresar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
