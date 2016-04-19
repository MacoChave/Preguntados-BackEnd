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
public class Item {
    private String nombre;
    private String descripcion;
    private int rareza;
    private int efectividad;
    private int bonus_gana;
    private int bonus_pierde;
    private int tipo;

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the rareza
     */
    public int getRareza() {
        return rareza;
    }

    /**
     * @param rareza the rareza to set
     */
    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    /**
     * @return the efectividad
     */
    public int getEfectividad() {
        return efectividad;
    }

    /**
     * @param efectividad the efectividad to set
     */
    public void setEfectividad(int efectividad) {
        this.efectividad = efectividad;
    }

    /**
     * @return the bonus_gana
     */
    public int getBonus_gana() {
        return bonus_gana;
    }

    /**
     * @param bonus_gana the bonus_gana to set
     */
    public void setBonus_gana(int bonus_gana) {
        this.bonus_gana = bonus_gana;
    }

    /**
     * @return the bonus_pierde
     */
    public int getBonus_pierde() {
        return bonus_pierde;
    }

    /**
     * @param bonus_pierde the bonus_pierde to set
     */
    public void setBonus_pierde(int bonus_pierde) {
        this.bonus_pierde = bonus_pierde;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
