/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que genera todos los corredores los cuales son hilos
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Corredor extends Thread {

    /**
     * Almacena el caracter que representa al corredor
     */
    private char avatar;

    /**
     * Define el turno del corredor respecto al equipo
     */
    private byte estado;

    /**
     * Almacena el equipo al que pertenece el corredor
     */
    private Equipo equipo;

    /**
     * Cadena que guarda el paso del corredor en el instante de tiempo
     */
    private String paso;

    /**
     * Posicion inicial del corredor
     */
    private int posicionInicio;

    /**
     * Posicion final del corredor
     */
    private int posicionFinal;

    /**
     * Posicion actual en la que se encuentra el corredor en el instante de
     * tiempo
     */
    private int posicionActual;

    /**
     * Objeto que se define cuando hay un ganador
     */
    private Ganador ganador;

    /**
     * Constructor de clase
     *
     * @param avatar Caracter que define al corredor
     * @param estado Turno del corredor respecto a su equipo
     * @param equipo Equipo al que pertenece el corredor
     * @param posicionInicio Posicion numerica de inicio del corredor
     * @param posicionFinal Posicion numerica de fin del corredor
     * @param ganador Objeto que se define cuando hay un ganador
     */
    public Corredor(char avatar, byte estado, Equipo equipo, int posicionInicio, int posicionFinal, Ganador ganador) {
        this.avatar = avatar;
        this.estado = estado;
        this.equipo = equipo;
        this.posicionInicio = posicionInicio;
        this.posicionFinal = posicionFinal;
        this.posicionActual = this.posicionInicio;
        this.ganador = ganador;
    }

    /**
     * Metodo que define la manera de correr
     */
    @Override
    public void run() {

        if (this.estado == 1) {
            correr();
            synchronized (this.equipo) {
                this.equipo.notify();
            }
        } else if (this.estado == 2) {
            synchronized (this.equipo) {
                try {
                    this.equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            correr();
            synchronized (this.equipo) {
                this.equipo.notify();
            }
        } else if (this.estado == 3) {
            synchronized (this.equipo) {
                try {
                    this.equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            correr();
        }
    }

    /**
     * Metodo que contiene el algoritmo al momento de dar los pasos
     */
    public void correr() {
        byte nPasos = 0;
        for (int i = 0; i <= 20; i = nPasos + i) {

            if (this.ganador.getEstadoSincronizado() == 0) {
                switch (i) {
                    case 3:
                        nPasos = (byte) (Math.random() * 2 + 1);
                        break;
                    case 4:
                        nPasos = 1;
                        break;
                    default:
                        nPasos = (byte) (Math.random() * 3 + 1);
                        break;
                }
                switch (nPasos) {
                    case 1:
                        this.paso = (this.equipo.getColor() + "-" + this.avatar);
                        this.posicionActual += 1;

                        break;
                    case 2:
                        this.paso = (this.equipo.getColor() + "--" + this.avatar);
                        this.posicionActual += 2;

                        break;
                    case 3:
                        this.paso = (this.equipo.getColor() + "---" + this.avatar);
                        this.posicionActual += 3;

                        break;

                }
                if ((this.avatar == 'z') && (i + nPasos == 20)) {
                    this.ganador.setEstadoSincronizado(1);
                }

                if (i + nPasos == 20) {
                    if (this.avatar == 'z') {
                        this.paso += (" " + this.equipo.getColor() + this.equipo.getDescripcion() + " GANA");
                    }
                    dormirHilo();
                    //Se desborda la posicion final, con el fin de validar
                    this.posicionActual += 100;
                    return;

                } else {
                    dormirHilo();
                }

            } else {

                return;
            }

        }

    }

    /**
     * Metodo que pausa el hilo un segundo
     */
    public void dormirHilo() {
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
    }

    /**
     * Obtiene el valor de paso del corredor
     *
     * @return Paso del corredor en el instante de tiempo
     */
    public String getPaso() {
        return paso;
    }

    /**
     * Obtiene la posicion inicial del corredor
     *
     * @return Posicion inicial del corredor
     */
    public int getPosicionInicio() {
        return posicionInicio;
    }

    /**
     * Obtiene la posicion actual del corredor
     *
     * @return Posicion actual del corredor
     */
    public int getPosicionActual() {
        return posicionActual;
    }

    /**
     * Obtiene la posicion final del corredor
     *
     * @return Posicion final del corredor
     */
    public int getPosicionFinal() {
        return posicionFinal;
    }

}
