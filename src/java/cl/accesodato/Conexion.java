package cl.accesodato;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    private Connection con=null;
    private String driver="com.mysql.jdbc.Driver";
    private String user="root";
    private String pass="";
    private String url="jdbc:mysql://localhost:3306/inacap";
    private Statement stmt;
    private ResultSet rs;
    public Conexion(){
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion establecida!!");
        }catch(Exception ex){
            System.out.println("ERROR "+ex.getMessage());
        }
    }
    public void setInsertar(String sql){
        try {
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }
    public void setSql (String sql){
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
        }catch(Exception ex){
            System.out.println("ERROR");
        }
    }
    public ResultSet getRs(){
        return rs;
    }
}
