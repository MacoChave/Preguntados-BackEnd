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

/**
 *
 * @author u
 */
public class QueryGet {

    
    public int getCodUser(String u){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_usuario"
                + " FROM usuario"
                + " WHERE username = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod_user;
            
            rs.next();
            cod_user = rs.getInt("cod_usuario");
            
            return cod_user;
        } catch (SQLException ex) {
            return 0;
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
    
    public String getRolUser(String u, String p){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT rol"
                + " FROM usuario"
                + " WHERE username = ?"
                + " AND pass = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, u);
            estado.setString(2, p);
            
            ResultSet rs;
            rs = estado.executeQuery();
            String rol;
            
            rs.next();
            rol = rs.getString("rol");
            
            return rol;
        } catch (SQLException ex) {
            System.out.println("QueryGet: " + ex.getMessage());
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
    
    public int getCodCarrera(String c){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_carrera"
                + " FROM carrera"
                + " WHERE carrera = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, c);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod_carrera;
            
            rs.next();
            cod_carrera = rs.getInt("cod_carrera");
            
            return cod_carrera;
        } catch (SQLException ex) {
            
        return 0;
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
    
    public int getCodCurso(String n){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_curso"
                + " FROM curso"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, n);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod_curso;
            
            rs.next();
            cod_curso = rs.getInt("cod_curso");
            
            return cod_curso;
        } catch (SQLException ex) {
        return 0;
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
    
    public int getCodNivel(String n){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_nivel"
                + " FROM nivel"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, n);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod_nivel;
            
            rs.next();
            cod_nivel = rs.getInt("cod_nivel");
            
            return cod_nivel;
        } catch (SQLException ex) {return 0;
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
    
    public int getCodPregunta(String p){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_pregunta"
                + " FROM pregunta"
                + " WHERE pregunta = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, p);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod_pregunta = 0;
            
            while(rs.next()){
            cod_pregunta = rs.getInt("cod_pregunta");
            }
            
            return cod_pregunta;
        } catch (SQLException ex) {
            return 0;
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
    
    public boolean getRespCorrecta(String r){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT correcta"
                + " FROM respuesta"
                + " WHERE opcion = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, r);
            
            ResultSet rs;
            rs = estado.executeQuery();
            boolean correcta;
            
            rs.next();
            correcta = rs.getBoolean("correcta");
            
            return correcta;
        } catch (SQLException ex) {
            return false;
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
    
    public int getCodItem(String n){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "cod_item"
                + " FROM item"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, n);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod;
            
            rs.next();
            cod = rs.getInt("cod_item");
            
            return cod;
        } catch (SQLException ex) {return 0;
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
    
    public String getTipoItem(String n){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT tipo"
                + " FROM item"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, n);
            
            ResultSet rs;
            rs = estado.executeQuery();
            String tipo;
            
            rs.next();
            tipo = rs.getString("tipo");
            
            return tipo;
        } catch (SQLException ex) {
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
    
    public int getCodAvatar(String a){
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_avatar"
                + " FROM avatar"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setString(1, a);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod;
            
            rs.next();
            cod = rs.getInt("cod_avatar");
            
            return cod;
        } catch (SQLException ex) {
            return 0;
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
    
    public int getCodInventario(String u, String i){
        
        int codUser = getCodUser(u);
        int codItem = getCodItem(i);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        
        String select = "SELECT cod_inventario"
                + " FROM inventario"
                + " WHERE cod_usuario = ?"
                + " AND cod_item = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(select);
            estado.setInt(1, codUser);
            estado.setInt(2, codItem);
            
            ResultSet rs;
            rs = estado.executeQuery();
            int cod;
            
            rs.next();
            cod = rs.getInt("cod_inventario");
            
            return cod;
        } catch (SQLException ex) {
            return 0;
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
