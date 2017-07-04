<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Usuario</title>
    </head>
    <body>
        <h1>Crear nuevo Usuario</h1>
        <br>
        <form method="post" action="../ServletUser?accion=registrar">
            <table>
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
    </body>
</html>
