/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cass465
 */
public class Corredor extends Thread {

    private char avatar;
    private byte estado;
    private Equipo equipo;
    private String paso;

    public Corredor(char avatar, byte estado, Equipo equipo) {
        this.avatar = avatar;
        this.estado = estado;
        this.equipo = equipo;
    }

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

    public void correr() {
        byte nPasos = 0;
        for (int i = 0; i <= 20; i = nPasos + i) {
            switch (i) {
                case 18:
                    nPasos = (byte) (Math.random() * 2 + 1);
                    break;
                case 19:
                    nPasos = 1;
                    break;
                default:
                    nPasos = (byte) (Math.random() * 3 + 1);
                    break;
            }

            switch (nPasos) {
                case 1:
                    System.out.print(this.equipo.getColor() + this.avatar);
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 2:
                    System.out.print(this.equipo.getColor() + "-" + this.avatar);
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 3:
                    System.out.print(this.equipo.getColor() + "--" + this.avatar);
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
            }
            if (i + nPasos == 20) {
                return;
            }
        }
    }
}
