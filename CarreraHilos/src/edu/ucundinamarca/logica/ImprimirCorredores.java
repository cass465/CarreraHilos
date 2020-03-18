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
    private List<Equipo> equipos;

    public ImprimirCorredores(List<Corredor> corredores, List<Equipo> equipos) {
        this.corredores = corredores;
    }

    @Override
    public void run() {
        
        if (inicioCarrera) {
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImprimirCorredores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        while (corredores.get(0).getPosicionActual() <= corredores.get(0).getPosicionFinal()
                || corredores.get(1).getPosicionActual() <= corredores.get(1).getPosicionFinal()
                || corredores.get(2).getPosicionActual() <= corredores.get(2).getPosicionFinal()
                || corredores.get(3).getPosicionActual() <= corredores.get(3).getPosicionFinal()
                || corredores.get(4).getPosicionActual() <= corredores.get(4).getPosicionFinal()
                || corredores.get(5).getPosicionActual() <= corredores.get(5).getPosicionFinal()
                || corredores.get(6).getPosicionActual() <= corredores.get(6).getPosicionFinal()
                || corredores.get(7).getPosicionActual() <= corredores.get(7).getPosicionFinal()
                || corredores.get(8).getPosicionActual() <= corredores.get(8).getPosicionFinal()) {

            if (corredores.get(0).getPosicionActual() <= corredores.get(0).getPosicionFinal()
                    && corredores.get(0).getPosicionActual() != corredores.get(0).getPosicionInicio()) {
                System.out.print(corredores.get(0).getPaso());
            }

            if (corredores.get(1).getPosicionActual() <= corredores.get(1).getPosicionFinal()
                    && corredores.get(1).getPosicionActual() != corredores.get(1).getPosicionInicio()) {
                System.out.print(corredores.get(1).getPaso());
            }
            if (corredores.get(2).getPosicionActual() <= corredores.get(2).getPosicionFinal()
                    && corredores.get(2).getPosicionActual() != corredores.get(2).getPosicionInicio()) {
                System.out.print(corredores.get(2).getPaso());
            }
            
            if (corredores.get(3).getPosicionActual() <= corredores.get(3).getPosicionFinal()
                    && corredores.get(3).getPosicionActual() != corredores.get(3).getPosicionInicio()) {
                System.out.print(corredores.get(3).getPaso());
            }
            
            if (corredores.get(4).getPosicionActual() <= corredores.get(4).getPosicionFinal()
                    && corredores.get(4).getPosicionActual() != corredores.get(4).getPosicionInicio()) {
                System.out.print(corredores.get(4).getPaso());
            }
            if (corredores.get(5).getPosicionActual() <= corredores.get(5).getPosicionFinal()
                    && corredores.get(5).getPosicionActual() != corredores.get(5).getPosicionInicio()) {
                System.out.print(corredores.get(5).getPaso());
            }
            
            if (corredores.get(6).getPosicionActual() <= corredores.get(6).getPosicionFinal()
                    && corredores.get(6).getPosicionActual() != corredores.get(6).getPosicionInicio()) {
                System.out.print(corredores.get(6).getPaso());
            }
           
            if (corredores.get(7).getPosicionActual() <= corredores.get(7).getPosicionFinal()
                    && corredores.get(7).getPosicionActual() != corredores.get(7).getPosicionInicio()) {
                System.out.print(corredores.get(7).getPaso());
            }
            if (corredores.get(8).getPosicionActual() <= corredores.get(8).getPosicionFinal()
                    && corredores.get(8).getPosicionActual() != corredores.get(8).getPosicionInicio()) {
                System.out.print(corredores.get(8).getPaso());
            }

            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImprimirCorredores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
