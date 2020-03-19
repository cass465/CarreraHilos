/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que imprime el transcurso de la carrera y es un hilo
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class ImpresionCorredores extends Thread {

    /**
     * Lista que almacena todos los corredores de la carrera
     */
    private List<Corredor> corredores;

    /**
     * Objeto que define en que momento dejar de imprimir
     */
    private Ganador ganador;

    /**
     * Cadena que almacena todos los pasos del equipo 1
     */
    private StringBuffer pasosEquipo1 = new StringBuffer();

    /**
     * Cadena que almacena todos los pasos del equipo 2
     */
    private StringBuffer pasosEquipo2 = new StringBuffer();

    /**
     * Cadena que almacena todos los pasos del equipo 3
     */
    private StringBuffer pasosEquipo3 = new StringBuffer();

    /**
     * Constructor de clase
     *
     * @param corredores Lista que almacena todos los corredores
     * @param ganador Objeto que controla la impresion
     */
    public ImpresionCorredores(List<Corredor> corredores, Ganador ganador) {
        this.corredores = corredores;
        this.ganador = ganador;
    }

    /**
     * Metodo que imprime el transcurso de la carrera
     */
    @Override
    public void run() {

        try {
            //Permite esperar que empiecen los corredores antes de imprimir sus posiciones
            sleep(10);

        } catch (InterruptedException ex) {
            Logger.getLogger(ImpresionCorredores.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (ganador.getEstadoSincronizado() != 2) {

            if (ganador.getEstadoSincronizado() == 1) {
                ganador.setEstadoSincronizado(2);

            }
            System.out.println("---------------------------");

            if (corredores.get(0).getPosicionActual() <= corredores.get(0).getPosicionFinal()
                    && corredores.get(0).getPosicionActual() != corredores.get(0).getPosicionInicio()) {
                pasosEquipo1.append(corredores.get(0).getPaso());
                System.out.println(pasosEquipo1);
            }

            if (corredores.get(1).getPosicionActual() <= corredores.get(1).getPosicionFinal()
                    && corredores.get(1).getPosicionActual() != corredores.get(1).getPosicionInicio()) {
                pasosEquipo1.append(corredores.get(1).getPaso());
                System.out.println(pasosEquipo1);
            }
            if (corredores.get(2).getPosicionActual() <= corredores.get(2).getPosicionFinal()
                    && corredores.get(2).getPosicionActual() != corredores.get(2).getPosicionInicio()) {
                pasosEquipo1.append(corredores.get(2).getPaso());
                System.out.println(pasosEquipo1);
            }

            if (corredores.get(3).getPosicionActual() <= corredores.get(3).getPosicionFinal()
                    && corredores.get(3).getPosicionActual() != corredores.get(3).getPosicionInicio()) {
                pasosEquipo2.append(corredores.get(3).getPaso());
                System.out.println(pasosEquipo2);
            }

            if (corredores.get(4).getPosicionActual() <= corredores.get(4).getPosicionFinal()
                    && corredores.get(4).getPosicionActual() != corredores.get(4).getPosicionInicio()) {
                pasosEquipo2.append(corredores.get(4).getPaso());
                System.out.println(pasosEquipo2);
            }
            if (corredores.get(5).getPosicionActual() <= corredores.get(5).getPosicionFinal()
                    && corredores.get(5).getPosicionActual() != corredores.get(5).getPosicionInicio()) {
                pasosEquipo2.append(corredores.get(5).getPaso());
                System.out.println(pasosEquipo2);
            }

            if (corredores.get(6).getPosicionActual() <= corredores.get(6).getPosicionFinal()
                    && corredores.get(6).getPosicionActual() != corredores.get(6).getPosicionInicio()) {
                pasosEquipo3.append(corredores.get(6).getPaso());
                System.out.println(pasosEquipo3);
            }

            if (corredores.get(7).getPosicionActual() <= corredores.get(7).getPosicionFinal()
                    && corredores.get(7).getPosicionActual() != corredores.get(7).getPosicionInicio()) {
                pasosEquipo3.append(corredores.get(7).getPaso());
                System.out.println(pasosEquipo3);
            }
            if (corredores.get(8).getPosicionActual() <= corredores.get(8).getPosicionFinal()
                    && corredores.get(8).getPosicionActual() != corredores.get(8).getPosicionInicio()) {
                pasosEquipo3.append(corredores.get(8).getPaso());
                System.out.println(pasosEquipo3);
            }

            System.out.println("---------------------------");
            System.out.println("");
            System.out.println("");

            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImpresionCorredores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
