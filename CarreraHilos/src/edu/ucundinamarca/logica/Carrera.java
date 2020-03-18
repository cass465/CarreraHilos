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

    public void correr() {
        Ganador ganador = new Ganador();
        
        Equipo equipo1 = new Equipo("Equipo1", "\u001B[31m"); //rojo
        Equipo equipo2 = new Equipo("Equipo2", "\u001B[32m"); //verde
        Equipo equipo3 = new Equipo("Equipo3", "\u001B[34m"); //azul
        
        Corredor c1 = new Corredor('x', (byte) 1, equipo1, ganador);
        Corredor c2 = new Corredor('y', (byte) 2, equipo1, ganador);
        Corredor c3 = new Corredor('z', (byte) 3, equipo1, ganador);
        Corredor c4 = new Corredor('x', (byte) 1, equipo2, ganador);
        Corredor c5 = new Corredor('y', (byte) 2, equipo2, ganador);
        Corredor c6 = new Corredor('z', (byte) 3, equipo2, ganador);
        Corredor c7 = new Corredor('x', (byte) 1, equipo3, ganador);
        Corredor c8 = new Corredor('y', (byte) 2, equipo3, ganador);
        Corredor c9 = new Corredor('z', (byte) 3, equipo3, ganador);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
    }
}
