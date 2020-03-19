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
 *
 * @author YEISON
 */
public class ImprimirCorredores extends Thread {

    private boolean inicioCarrera = true;
    private List<Corredor> corredores;
    private Ganador ganador;
    private StringBuffer pasosEquipo1 = new StringBuffer();
    private StringBuffer pasosEquipo2 = new StringBuffer();
    private StringBuffer pasosEquipo3 = new StringBuffer();

    public ImprimirCorredores(List<Corredor> corredores, Ganador ganador ) {
        this.corredores = corredores;
        this.ganador=ganador;
    }

    @Override
    public void run() {

        if (inicioCarrera) {
            try {
                //Permite esperar que empiecen los corredores antes de imprimir sus posiciones
                sleep(10);

            } catch (InterruptedException ex) {
                Logger.getLogger(ImprimirCorredores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        while (ganador.getEstadoSincronizado()!= 2) {

            
            if(ganador.getEstadoSincronizado() == 1){
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
                Logger.getLogger(ImprimirCorredores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
