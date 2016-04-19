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
public class selectUsuario {
    
    public List<String> obtenerUsuario(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> username = new ArrayList<String>();
        
        String select = "SELECT username"
                + " FROM usuario"
                + " WHERE username = ?";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                username.add(rs.getString("username"));
            }
            return username;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
    
    public List<String> obtenerAllUsuario(){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> username = new ArrayList<String>();
        
        String select = "SELECT username"
                + " FROM usuario";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                username.add(rs.getString("username"));
            }
            return username;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
    
    public List<String> obtenerRol(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> rol = new ArrayList<String>();
        
        String select = "SELECT rol"
                + " FROM usuario"
                + " WHERE username = ? ";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                rol.add(rs.getString("rol"));
            }
            return rol;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
    
    public List<String> obtenerEmail(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<String> email = new ArrayList<String>();
        
        String select = "SELECT email"
                + " FROM usuario"
                + " WHERE username = ?";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                email.add(rs.getString("email"));
            }
            return email;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
    
    public List<Integer> obtenerExp(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<Integer> exp = new ArrayList<Integer>();
        
        String select = "SELECT exp"
                + " FROM usuario"
                + " WHERE username = ?";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                exp.add(rs.getInt("exp"));
            }
            return exp;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
    
    public List<Boolean> obtenerEstado(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        List<Boolean> estadoUsuario = new ArrayList<Boolean>();
        
        String select = "SELECT estado"
                + " FROM usuario"
                + " WHERE username = ?";
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            ResultSet rs;
            rs = estado.executeQuery();
            while(rs.next()){
                estadoUsuario.add(rs.getBoolean("exp"));
            }
            return estadoUsuario;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("QuerySelect SQL: " + ex.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("QuerySelect: " +e.getMessage());
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
