/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

/**
 * Clase que genera el ganador de la carrera con el fin de terminarla
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Ganador {

    /**
     * Estado que controla si ya existe un ganador
     */
    private int estadoSincronizado;

    /**
     * Obtiene el estado del ganador
     *
     * @return El estado del ganador
     */
    public int getEstadoSincronizado() {
        return estadoSincronizado;
    }

    /**
     * Establece el estado del ganador
     *
     * @param estadoSincronizado Valor que se asigna al estado
     */
    public void setEstadoSincronizado(int estadoSincronizado) {
        this.estadoSincronizado = estadoSincronizado;
    }

}
