/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u
 */
public class selectItem {
    
        public List<String> nombre(String t){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> nombre = new ArrayList<String>();
        
        String select = "SELECT nombre FROM item WHERE tipo = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, t);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                nombre.add(rs.getString("nombre"));
            }
            return nombre;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("ERROR QuerySelect: " + e.getMessage());
            return null;
        } finally{
            try{
                if(estado != null){
                    conexion.close();
                }
            } catch(SQLException se){
            }
            try{
                if(conexion != null){
                    conexion.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
    }
}
