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
public class Pregunta {
    private int cod_curso;
    private int cod_nivel;
    private String pregunta;
    private boolean estado;

    /**
     * @return the cod_curso
     */
    public int getCod_curso() {
        return cod_curso;
    }

    /**
     * @param cod_curso the cod_curso to set
     */
    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    /**
     * @return the cod_nivel
     */
    public int getCod_nivel() {
        return cod_nivel;
    }

    /**
     * @param cod_nivel the cod_nivel to set
     */
    public void setCod_nivel(int cod_nivel) {
        this.cod_nivel = cod_nivel;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
