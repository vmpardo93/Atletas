/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 *
 * @author fetec
 */
public class Equipo extends Thread {

    private String nombre;
    private int inicio;
    private int fin;
    private int posicionA1;
    private int posicionA2;
    private int posicionA3;

    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA1 = 0;
        this.posicionA2 = 33;
        this.posicionA3 = 66;
    }

    public synchronized String imprimir() {
        String tramo = "Equipo: "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA1) {
                tramo += "+";
            } else if (i == posicionA2) {
                tramo += "*";
            } else if (i == posicionA3) {
                tramo += "$";
            } else {
                tramo += "_";
            }
        }
        //System.out.println(tramo);
        return tramo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getPosicionA1() {
        return posicionA1;
    }

    public void setPosicionA1(int posicionA1) {
        this.posicionA1 = posicionA1;
    }

    public int getPosicionA2() {
        return posicionA2;
    }

    public void setPosicionA2(int posicionA2) {
        this.posicionA2 = posicionA2;
    }

    public int getPosicionA3() {
        return posicionA3;
    }

    public void setPosicionA3(int posicionA3) {
        this.posicionA3 = posicionA3;
    }
    
    

}
