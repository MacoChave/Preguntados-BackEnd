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
public class selectInventario {
    
    public List<Integer> cod_item(String u){
        QueryGet qg = new QueryGet();
        int cod_usuario = qg.getCodUser(u);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        List<Integer> codItem = new ArrayList<Integer>();
        
        String select = "SELECT cod_item FROM inventario WHERE cod_usuario = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setInt(1, cod_usuario);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                codItem.add(rs.getInt("cod_item"));
            }
            return codItem;
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
