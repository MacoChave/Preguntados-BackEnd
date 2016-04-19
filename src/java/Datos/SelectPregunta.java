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
public class SelectPregunta {
    
    public List<String> obtenerPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> pregunta = new ArrayList<String>();
        
        String select = "SELECT pregunta FROM pregunta";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                pregunta.add(rs.getString("pregunta"));
            }
            return pregunta;
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
    
    public List<String> obtenerPreguntaPendiente(boolean e){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> pregunta = new ArrayList<String>();
        
        String select = "SELECT pregunta FROM pregunta WHERE estado = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setBoolean(1, e);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                pregunta.add(rs.getString("pregunta"));
            }
            return pregunta;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR QuerySelect SQL: " + ex.getMessage());
            return null;
        }
        finally{
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
    
    public List<String> obtenerCursoPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> cursoPregunta = new ArrayList<String>();
        
        String select = "SELECT C.nombre FROM curso C, pregunta P"
                + " WHERE c.cod_curso = P.cod_curso";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                cursoPregunta.add(rs.getString(1));
            }
            return cursoPregunta;
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
    
    public List<String> obtenerNivelPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> nivelPregunta = new ArrayList<String>();
        
        String select = "SELECT N.nombre FROM nivel N, pregunta P"
                + " WHERE N.cod_nivel = P.cod_nivel";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                nivelPregunta.add(rs.getString(1));
            }
            return nivelPregunta;
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
    
    public List<Boolean> obtenerEstadoPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<Boolean> nivelPregunta = new ArrayList<Boolean>();
        
        String select = "SELECT estado FROM pregunta";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                nivelPregunta.add(rs.getBoolean("estado"));
            }
            return nivelPregunta;
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
    
    public List<String> obtenerCarreraPregunta(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> carrera = new ArrayList<String>();
        
        String select = "SELECT carrera FROM carrera";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                carrera.add(rs.getString("carrera"));
            }
            return carrera;
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
