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
    private Ganador ganador;

    public Equipo(String color, Ganador ganador) {
        this.color = color;
        this.ganador = ganador;
    }

    public String getColor() {
        return color;
    }

    public Ganador getGanador() {
        return ganador;
    }
}
