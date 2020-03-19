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

    private List<Equipo> equipos = new ArrayList<>();

    private List<Corredor> corredores = new ArrayList<>();

    private ImprimirCorredores imprimir;

    public void correr() {
        Ganador ganador = new Ganador();

        equipos.add(new Equipo("EQUIPO1", "\u001B[31m")); //rojo
        equipos.add(new Equipo("EQUIPO2", "\u001B[32m")); //verde
        equipos.add(new Equipo("EQUIPO3", "\u001B[34m")); //azul

        corredores.add(new Corredor('x', (byte) 1, equipos.get(0), 0, 5, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(0), 5, 10, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(0), 10, 15, ganador));
        corredores.add(new Corredor('x', (byte) 1, equipos.get(1), 0, 5, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(1), 5, 10, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(1), 10, 15, ganador));
        corredores.add(new Corredor('x', (byte) 1, equipos.get(2), 0, 5, ganador));
        corredores.add(new Corredor('y', (byte) 2, equipos.get(2), 5, 10, ganador));
        corredores.add(new Corredor('z', (byte) 3, equipos.get(2), 10, 15, ganador));

        imprimir = new ImprimirCorredores(corredores,ganador);

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
