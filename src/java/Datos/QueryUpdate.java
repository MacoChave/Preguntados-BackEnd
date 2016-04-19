/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author u
 */
public class QueryUpdate {
    
    public boolean editarRolUser(String r, String u) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE usuario SET rol = ?"
                + " WHERE username = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setString(1, r);
            estado.setString(2, u);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean editarPassUser(String u, String p) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE usuario SET pass = ?"
                + " WHERE username = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setString(1, p);
            estado.setString(2, u);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean editarEstUser(String u, boolean e) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE usuario SET estado = ?"
                + " WHERE username = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setBoolean(1, e);
            estado.setString(2, u);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean editarExpNivel(String n, int e) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE nivel SET exp = ?"
                + " WHERE nombre = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setInt(1, e);
            estado.setString(2, n);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean editarNivelPregunta(String n, String p) throws SQLException{
               
        QueryGet qg = new QueryGet();
        int cod_nivel = qg.getCodNivel(n);
        int cod_pregunta = qg.getCodPregunta(p);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE pregunta SET cod_nivel = ?"
                + " WHERE pregunta = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setInt(1, cod_nivel);
            estado.setString(2, p);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean editarEstadoPregunta(boolean e, String p) throws SQLException{
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE pregunta SET estado = ?"
                + " WHERE pregunta = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setBoolean(1, e);
            estado.setString(2, p);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }  
    
    public boolean cambiarNombreAvatar(String u, String n) throws SQLException{
        QueryGet qg = new QueryGet();
        int codUser = qg.getCodUser(u);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE avatar SET nombre = ?"
                + " WHERE cod_user = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setInt(1, codUser);
            estado.setString(2, n);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
    
    public boolean cambiarEstadoInventario(String u, String i) throws SQLException{
        QueryGet qg = new QueryGet();
        int codUser = qg.getCodUser(u);
        int codItem = qg.getCodItem(i);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String update = "UPDATE inventario SET estado = ?"
                + " WHERE cod_user = ?"
                + " AND cod_item = ?";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(update);
            
            estado.setString(1, "desactivado");
            estado.setInt(2, codUser);
            estado.setInt(3, codItem);
            
            estado.executeUpdate();
            conexion.close();
            
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(QueryInsert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        } finally{
            if(estado != null){
                estado.close();
            }
            if(conexion != null){
                conexion.close();
            }
        }
    }
}
