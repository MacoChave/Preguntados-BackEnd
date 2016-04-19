/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author u
 */
public class Curso {
    private int cod_carrera;
    private String nombre;
    private boolean activo;

    /**
     * @return the cod_carrera
     */
    public int getCod_carrera() {
        return cod_carrera;
    }

    /**
     * @param cod_carrera the cod_carrera to set
     */
    public void setCod_carrera(int cod_carrera) {
        this.cod_carrera = cod_carrera;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
