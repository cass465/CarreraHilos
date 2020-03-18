/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cass465
 */
public class Carrera {

    private List<Equipo> equipos;
    private List<Corredor> corredores;

    public void correr() {
        Ganador ganador = new Ganador();
        
        Equipo equipo1 = new Equipo("\u001B[31m", ganador); //rojo
        Equipo equipo2 = new Equipo("\u001B[32m", ganador); //verde
        Equipo equipo3 = new Equipo("\u001B[34m", ganador); //azul
        
        Corredor c1 = new Corredor('x', (byte) 1, equipo1);
        Corredor c2 = new Corredor('y', (byte) 2, equipo1);
        Corredor c3 = new Corredor('z', (byte) 3, equipo1);
        Corredor c4 = new Corredor('x', (byte) 1, equipo2);
        Corredor c5 = new Corredor('y', (byte) 2, equipo2);
        Corredor c6 = new Corredor('z', (byte) 3, equipo2);
        Corredor c7 = new Corredor('x', (byte) 1, equipo3);
        Corredor c8 = new Corredor('y', (byte) 2, equipo3);
        Corredor c9 = new Corredor('z', (byte) 3, equipo3);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        /*c7.start();
        c8.start();
        c9.start();*/
    }
}
