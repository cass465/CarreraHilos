/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

/**
 *
 * @author cass465
 */
public class Equipo {
    private String color;
    private boolean ganador = false;

    public Equipo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public void setGanador(boolean ganador){
        this.ganador = ganador;
    }
}
