
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author u
 */
public class Conexion {
    
    public String DB_DRIVER = "org.postgresql.Driver";
    
    public String HOST = "localhost";
    public String PORT = "5432";
    public String DATABASE = "dbpreguntados";
    
    public String USER = "postgres";
    public String PASS = "totitoSQL";
    
    public String CADENA = "jdbc:postgresql://" +HOST+ ":" +PORT+ "/" +DATABASE;
    
    public Connection getDBConection(){
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(CADENA, USER, PASS);
            return dbConnection;
        } catch (SQLException ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return dbConnection;
    }
}