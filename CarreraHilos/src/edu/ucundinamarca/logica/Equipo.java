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

    private String descripcion;
    private String color;

    public Equipo(String descripcion, String color) {
        this.descripcion = descripcion;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
