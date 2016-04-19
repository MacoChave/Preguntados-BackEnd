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
public class Respuesta {
    private int cod_pregunta;
    private String opcion;
    private boolean correcta;

    /**
     * @return the cod_pregunta
     */
    public int getCod_pregunta() {
        return cod_pregunta;
    }

    /**
     * @param cod_pregunta the cod_pregunta to set
     */
    public void setCod_pregunta(int cod_pregunta) {
        this.cod_pregunta = cod_pregunta;
    }

    /**
     * @return the opcion
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    /**
     * @return the correcta
     */
    public boolean isCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
}
