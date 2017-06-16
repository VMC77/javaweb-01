package cl.accesodato;

import java.sql.*;
import java.sql.Statement;


public class Conexion {

    Connection con = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/inacap";
    private String user = "root";
    private String pass = "";
    private Statement stmt = null;

    public Conexion() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Establecida!!");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
    
    public void setInsertar (String sql){
           try {
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }
    }

}

//statement: permite hacer consultas de insert, update