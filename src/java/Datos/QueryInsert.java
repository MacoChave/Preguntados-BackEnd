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
public class QueryInsert {
    
    public boolean agregarUsuario(String r, String u, String p, String e) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO usuario(rol,username,pass,email)"
                + " VALUES(?,?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setString(1, r);
            estado.setString(2, u);
            estado.setString(3, p);
            estado.setString(4, e);
            
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
 
    public boolean agregarCarrera(String c) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO carrera(carrera)"
                + " VALUES(?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setString(1, c);
            
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
    
    public boolean agregarCurso(String c, String n, boolean a) throws SQLException{
        
        QueryGet qg = new QueryGet();
        int cod_carrera = qg.getCodCarrera(c);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO curso(cod_carrera,nombre,activo)"
                + " VALUES(?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setInt(1, cod_carrera);
            estado.setString(2, n);
            estado.setBoolean(3, a);
            
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
    
    public boolean agregarNivel(String n, int e) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO nivel(nombre, exp)"
                + " VALUES(?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setString(1, n);
            estado.setInt(2, e);
            
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
    
    public boolean agregarPregunta(String c, String n, String p) throws SQLException{
        QueryGet qg = new QueryGet();
        int cod_curso = qg.getCodCurso(c);
        int cod_nivel = qg.getCodNivel(n);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO pregunta(pregunta, cod_curso, cod_nivel, estado)"
                + " VALUES(?,?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            
            estado.setString(1, p);
            estado.setInt(2, cod_curso);
            estado.setInt(3, cod_nivel);
            estado.setBoolean(4, false);
            
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
    
    public boolean agregarRespuesta(String p, String o, boolean c) throws SQLException{
        QueryGet qg = new QueryGet();
        int cod_pregunta = qg.getCodPregunta(p);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO respuesta(cod_pregunta, opcion, correcta)"
                + " VALUES(?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setInt(1, cod_pregunta);
            estado.setString(2, o);
            estado.setBoolean(3, c);
            
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
    
    public boolean agregarItem(String n, String d, int r, int e, int bg, int bp, String t) throws SQLException{
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO item(nombre, descripcion, rareza, efectividad, bonus_gana, bonus_pierde, tipo)"
                + "VALUES(?,?,?,?,?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setString(1, n);
            estado.setString(2, d);
            estado.setInt(3, r);
            estado.setInt(4, e);
            estado.setInt(5, bg);
            estado.setInt(6, bp);
            estado.setString(7, t);
            
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
    
    public boolean agregarAvatar(String u, String n) throws SQLException{
        QueryGet qg = new QueryGet();
        int codUser = qg.getCodUser(u);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO avatar(cod_usuario, nombre)"
                + "VALUES(?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
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
    
    public boolean agregarInventario(String u, String i) throws SQLException{
        QueryGet qg = new QueryGet();
        int codUser = qg.getCodUser(u);
        int codItem = qg.getCodItem(i);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO item(cod_usuario, cod_item, estado)"
                + "VALUES(?,?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setInt(1, codUser);
            estado.setInt(2, codItem);
            estado.setString(3, "disponible");
            
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
    
    public boolean equiparAvatar(String a, String i) throws SQLException{
        QueryGet qg = new QueryGet();
        int codAvatar = qg.getCodAvatar(a);
        int codInventario = qg.getCodItem(i);
        
        Connection conexion = null;
        PreparedStatement estado = null;
        String insertar = "INSERT INTO miAvatar(cod_avatar, cod_inventario)"
                + "VALUES(?,?)";
        
        try {
            conexion = new Conexion().getDBConection();
            estado = conexion.prepareStatement(insertar);
            
            estado.setInt(1, codAvatar);
            estado.setInt(2, codInventario);
            
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