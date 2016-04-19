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
public class selectRespuesta {
    
    public List<String> obtenerOpcion(String pregunta){
        QueryGet qg = new QueryGet();
        int cod_pregunta = qg.getCodPregunta(pregunta);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> opcion = new ArrayList<String>();
        
        String select = "SELECT opcion FROM respuesta WHERE cod_pregunta = ? AND correcta = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setInt(1, cod_pregunta);
            estado.setBoolean(2, true);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                opcion.add(rs.getString("opcion"));
            }
            return opcion;
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
    
    public List<Boolean> obtenerCorrecta(String pregunta){
        QueryGet qg = new QueryGet();
        int cod_pregunta = qg.getCodPregunta(pregunta);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        List<Boolean> correcta = new ArrayList<Boolean>();
        
        String select = "SELECT correcta FROM respuesta WHERE cod_pregunta = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setInt(1, cod_pregunta);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                correcta.add(rs.getBoolean("correcta"));
            }
            return correcta;
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
