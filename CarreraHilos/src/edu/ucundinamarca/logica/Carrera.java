/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que ejecuta la carrera
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Carrera {

    /**
     * Lista que almacena los equipos de la carrera
     */
    private List<Equipo> equipos = new ArrayList<>();

    /**
     * Lista que almacena todos los corredores
     */
    private List<Corredor> corredores = new ArrayList<>();

    /**
     * Hilo que imprime el transcurrso de la carrera
     */
    private ImpresionCorredores imprimir;

    /**
     * Metodo que levanta todos los hilos de la carrera
     */
    public void correr() {
        Ganador ganador = new Ganador();

        equipos.add(new Equipo("EQUIPO1", "\u001B[31m")); //rojo
        equipos.add(new Equipo("EQUIPO2", "\u001B[32m")); //verde
        equipos.add(new Equipo("EQUIPO3", "\u001B[34m")); //azul

        corredores.add(new Corredor('x', (byte) 1, equipos.get(0), 0, 20, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(0), 20, 40, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(0), 40, 60, ganador));
        corredores.add(new Corredor('x', (byte) 1, equipos.get(1), 0, 20, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(1), 20, 40, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(1), 40, 60, ganador));
        corredores.add(new Corredor('x', (byte) 1, equipos.get(2), 0, 20, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(2), 20, 40, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(2), 40, 60, ganador));

        imprimir = new ImpresionCorredores(corredores, ganador);

        corredores.get(0).start();
        corredores.get(1).start();
        corredores.get(2).start();

        corredores.get(3).start();
        corredores.get(4).start();
        corredores.get(5).start();

        corredores.get(6).start();
        corredores.get(7).start();
        corredores.get(8).start();

        imprimir.start();

    }
}
