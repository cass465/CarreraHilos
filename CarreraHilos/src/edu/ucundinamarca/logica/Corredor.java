/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.logica;

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
    
    private int posicionInicio;
    private int posicionFinal;
    private int posicionActual;
    private Ganador ganador;

    public Corredor(char avatar, byte estado, Equipo equipo, int posicionInicio, int posicionFinal) {
    public Corredor(char avatar, byte estado, Equipo equipo, Ganador ganador) {
        this.avatar = avatar;
        this.estado = estado;
        this.equipo = equipo;
        this.posicionInicio=posicionInicio;
        this.posicionFinal=posicionFinal;
        this.posicionActual=this.posicionInicio;
        
        this.ganador = ganador;
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
        for (int i = 0; i <= 5; i = nPasos + i) {

                switch (nPasos) {
                    case 1:
                        this.paso = (this.equipo.getColor() + "-" + this.avatar);                       
                      // System.out.println(posicion);
                        //System.out.print(this.equipo.getColor() + "-" + this.avatar);
                         {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                            }
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
                    this.posicionActual+=1;
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        
                        }
                    }
                    break;
                case 2:
                    this.paso = (this.equipo.getColor() + "--" + this.avatar);
                    this.posicionActual+=2;
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        
                        }
                    }
                    break;
                case 3:
                    this.paso = (this.equipo.getColor() + "---" + this.avatar);
                    this.posicionActual+=3;
                     {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                        
                        }
                   
                    }
                    break;
                    
                    
                }
         

            if (i + nPasos == 5) {
                return;
            }

        }
    }

    public String getPaso() {
        return paso;
    }
     public int getPosicionInicio(){
        return posicionInicio;
    }
    public int getPosicionActual(){
        return posicionActual;
    }
    public int getPosicionFinal(){
        return posicionFinal;
    }
    
    
}
