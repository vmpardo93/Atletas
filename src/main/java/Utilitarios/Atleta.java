/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que maneja la informacion y el movimiento de los atletas especificos.
 * @author fetec
 */
public class Atleta extends Thread {

    Equipo equipo;
    private int posicion;
    private int fin;
    private String strAzul;
    private String strRojo;
    private String strVerde;
    
    /**
     * Constuctor de la clase atleta que recible el equipo al que pertenece el 
     * atleta, su respectiva posicion inicial y final.
     * @param equipo
     * @param posicion
     * @param fin 
     */
    public Atleta(Equipo equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }
    public void posicionCero(){
        while (true) {
                int pasoActual = avanzar(1);
                if (pasoActual >= 33) {
                    equipo.setPosicionA1(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        posicion = 33;
                    }
                    break;
                }
            }
    }
    public void posicionTreintaytres(){
        while (true) {
                int pasoActual = avanzar(2);
                if (pasoActual >= 66) {
                    equipo.setPosicionA2(66);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
    }
    public void posicionSesentayseis(){
        while (true) {
                int pasoActual = avanzar(3);
                if (pasoActual >= 100) {
                    equipo.setPosicionA3(100);
                    System.out.println("Gano equipo: "+equipo.getNombre());
                    System.exit(0);
                    break;
                }
            }
    }
    @Override
    public void run() {
        if (posicion == 0) {
            posicionCero();
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 33) {
            posicionTreintaytres();
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 66) {
            posicionSesentayseis();
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public int avanceOne(int valorAvance){
        equipo.setPosicionA1(equipo.getPosicionA1() + valorAvance);
            if(equipo.imprimir().contains("Azul")){
                strAzul=equipo.imprimir();
            }else if(equipo.imprimir().contains("Verde")){
                strVerde=equipo.imprimir();
            }else if(equipo.imprimir().contains("Rojo")){
                strRojo=equipo.imprimir();
            }
            if(strAzul!=null){
                System.out.println(strAzul);
            }
            if(strRojo!=null){
                System.out.println(strRojo);
            }
            if(strVerde!=null){
                System.out.println(strVerde);
            }            
            return equipo.getPosicionA1();
    }
    public int avanceTwo(int valorAvance){
            equipo.setPosicionA2(equipo.getPosicionA2() + valorAvance);
            if(equipo.imprimir().contains("Azul")){
                strAzul=equipo.imprimir();
            }else if(equipo.imprimir().contains("Verde")){
                strVerde=equipo.imprimir();
            }else if(equipo.imprimir().contains("Rojo")){
                strRojo=equipo.imprimir();
            }
            if(strAzul!=null){
                System.out.println(strAzul);
            }
            if(strRojo!=null){
                System.out.println(strRojo);
            }
            if(strVerde!=null){
                System.out.println(strVerde);
            }
            return equipo.getPosicionA2();
    }
    public int avanceTree(int valorAvance){
            equipo.setPosicionA3(equipo.getPosicionA3() + valorAvance);
            if(equipo.imprimir().contains("Azul")){
                strAzul=equipo.imprimir();
            }else if(equipo.imprimir().contains("Verde")){
                strVerde=equipo.imprimir();
            }else if(equipo.imprimir().contains("Rojo")){
                strRojo=equipo.imprimir();
            }
            if(strAzul!=null){
                System.out.println(strAzul);
            }
            if(strRojo!=null){
                System.out.println(strRojo);
            }
            if(strVerde!=null){
                System.out.println(strVerde);
            }
            
            return equipo.getPosicionA3();
    }
    public int avanzar(int numAtleta) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        int valorAvance = Random.random();
        if (numAtleta == 1) {
            return avanceOne(valorAvance);
        }
        if (numAtleta == 2) {
            return avanceTwo(valorAvance);
        }
        if (numAtleta == 3) {
            return avanceTree(valorAvance);
        }
        return 0;
    }
}
