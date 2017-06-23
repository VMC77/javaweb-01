<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cl.accesodato.Conexion"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
    </head>
    <body>
        <h1>Registrar mi cuenta</h1>
    </body>
    <br>
    <form method="post" action="ServletUsuario">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>1er Apellido</td>
                <td><input type="text" name="apepat"></td>
            </tr>
            <tr>
                <td>2do Apellido</td>
                <td><input type="text" name="apemat"></td>
            </tr>
            <tr>
                <td>Nombre Cuenta</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Clave</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Crear Cuenta"></td>
            </tr>
        </table>
    </form>
</html>
