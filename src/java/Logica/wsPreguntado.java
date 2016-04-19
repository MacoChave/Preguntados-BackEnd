/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.QueryGet;
import Datos.QueryInsert;
import Datos.QuerySelect;
import Datos.QueryUpdate;
import Datos.SelectPregunta;
import Datos.selectInventario;
import Datos.selectItem;
import Datos.selectRespuesta;
import Datos.selectUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author u
 */
@WebService(serviceName = "wsPreguntado")
public class wsPreguntado {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iniciarSesion")
    public String iniciarSesion(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass) {
        QueryGet qg = new QueryGet();
        return qg.getRolUser(usuario, pass);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registro")
    public boolean Registro(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass, @WebParam(name = "email") String email) {
        QueryInsert qi = new QueryInsert();
        try {
            return qi.agregarUsuario("Jugador", usuario, pass, email);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editRolUsuario")
    public boolean editRolUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "rol") String rol) {
        QueryUpdate qu = new QueryUpdate();
        try {
            return qu.editarRolUser(rol, usuario);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarUsuario")
    public List<String> mostrarUsuario(@WebParam(name = "usuario") String usuario) {
        selectUsuario su = new selectUsuario();
        return su.obtenerUsuario(usuario);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarAllUsuario")
    public List<String> mostrarAllUsuario() {
        selectUsuario su = new selectUsuario();
        return su.obtenerAllUsuario();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarRol")
    public List<String> mostrarRol(@WebParam(name = "usuario") String usuario) {
        selectUsuario su = new selectUsuario();
        return su.obtenerRol(usuario);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarEmail")
    public List<String> mostrarEmail(@WebParam(name = "usuario") String usuario) {
        selectUsuario su = new selectUsuario();
        return su.obtenerEmail(usuario);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarExp")
    public List<Integer> mostrarExp(@WebParam(name = "usuario") String usuario) {
        selectUsuario su = new selectUsuario();
        return su.obtenerExp(usuario);
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarEstadoUsuario")
    public List<Boolean> mostrarEstadoUsuario(@WebParam(name = "usuario") String usuario) {
        selectUsuario su = new selectUsuario();
        return su.obtenerEstado(usuario);
    }
    
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarPregunta")
    public List<String> mostrarPregunta() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerPregunta();
    }
        
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarCursoPregunta")
    public List<String> mostrarCursoPregunta() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerCursoPregunta();
    }
        
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarCarreraPregunta")
    public List<String> mostrarCarreraPregunta() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerCarreraPregunta();
    }
        
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarNivelPregunta")
    public List<String> mostrarNivelPregunta() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerNivelPregunta();
    }
        
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarEstadoPregunta")
    public List<Boolean> mostrarEstadoPregunta() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerEstadoPregunta();
    }
        
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "mostrarPreguntaPendiente")
    public List<String> mostrarPreguntaPendiente() {
        SelectPregunta sp = new SelectPregunta();
        return sp.obtenerPreguntaPendiente(false);
    }
            
    /**
     * Web service mostrarPregunta
     */
    @WebMethod(operationName = "listaPregunta")
    public ArrayList<Pregunta> listaPregunta() {
        QuerySelect qs = new QuerySelect();
        return qs.listaPregunta();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearPregunta")
    public boolean crearPregunta(@WebParam(name = "curso") String curso, @WebParam(name = "nivel") String nivel, @WebParam(name = "pregunta") String pregunta) {
        QueryInsert qi = new QueryInsert();
        try {
            return qi.agregarPregunta(curso, nivel, pregunta);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearRespuesta")
    public boolean crearRespuesta(@WebParam(name = "pregunta") String pregunta, @WebParam(name = "opcion") String opcion, @WebParam(name = "correcta") boolean correcta) {
        QueryInsert qi = new QueryInsert();
        try {
            return qi.agregarRespuesta(pregunta, opcion, correcta);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editEstadoPregunta")
    public boolean editEstadoPregunta(@WebParam(name = "estado") boolean estado, @WebParam(name = "pregunta") String pregunta) {
        QueryUpdate qu = new QueryUpdate();
        try {
            return qu.editarEstadoPregunta(estado, pregunta);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editNivelPregunta")
    public boolean editNivelPregunta(@WebParam(name = "nivel") String nivel, @WebParam(name = "pregunta") String pregunta) {
        QueryUpdate qu = new QueryUpdate();
        try {
            return qu.editarNivelPregunta(nivel, pregunta);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editPassUsuario")
    public boolean editPassUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass) {
        QueryUpdate qu = new QueryUpdate();
        try {
            return qu.editarPassUser(usuario, pass);
        } catch (SQLException ex) {
            Logger.getLogger(wsPreguntado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bajaUsuario")
    public boolean bajaUsuario(@WebParam(name = "usuario") String usuario) {
        QueryUpdate qu = new QueryUpdate();
        try {
            qu.editarEstUser(usuario, false);
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCarrera")
    public boolean addCarrera(@WebParam(name = "carrera") String carrera) {
        QueryInsert qi = new QueryInsert();
        try {
            qi.agregarCarrera(carrera);
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCurso")
    public boolean addCurso(@WebParam(name = "carrera") String carrera, @WebParam(name = "curso") String curso) {
        QueryInsert qi = new QueryInsert();
        try {
            qi.agregarCurso(carrera, curso, true);
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addItem")
    public boolean addItem(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "rareza") int rareza, @WebParam(name = "efectividad") int efectividad, @WebParam(name = "bGana") int bGana, @WebParam(name = "bPierde") int bPierde, @WebParam(name = "tipo") String tipo) {
        QueryInsert qi = new QueryInsert();
        try {
            qi.agregarItem(nombre, descripcion, rareza, efectividad, bGana, bGana, tipo);
            return true;
        } catch (SQLException ex) {
            return false;
        }    
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarRespuesta")
    public List<String> mostrarRespuesta(@WebParam(name = "pregunta") String pregunta) {
        selectRespuesta sr = new selectRespuesta();
        return sr.obtenerOpcion(pregunta);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarOpcionRespuesta")
    public List<Boolean> mostrarOpcionRespuesta(@WebParam(name = "pregunta") String pregunta) {
        selectRespuesta sr = new selectRespuesta();
        return sr.obtenerCorrecta(pregunta);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarInventario")
    public List<Integer> mostrarInventario(@WebParam(name = "usuario") String usuario) {
        selectInventario si = new selectInventario();
        return si.cod_item(usuario);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarItem")
    public List<String> mostrarItem(@WebParam(name = "tipo") String tipo) {
        selectItem si = new selectItem();
        return si.nombre(tipo);
    }
    
}
