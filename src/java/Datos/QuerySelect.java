/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Pregunta;
import Logica.Usuario;
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
public class QuerySelect {
    
    public ArrayList<Pregunta> listaPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        Pregunta preg = new Pregunta();
        ArrayList<Pregunta> listaPregunta = new ArrayList<Pregunta>();
                
        String select = "SELECT * FROM pregunta";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                preg.setCod_curso(rs.getInt("cod_curso"));
                preg.setCod_nivel(rs.getInt("cod_nivel"));
                preg.setPregunta(rs.getString("pregunta"));
                preg.setEstado(rs.getBoolean("estado"));
                
                listaPregunta.add(preg);
            }
            return listaPregunta;
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
