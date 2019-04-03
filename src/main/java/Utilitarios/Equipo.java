/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 * Clase equipo que contiene la informacion general de la carrera de un equpo
 * especifico, como su duracion y las posiciones de los diferentes competidores.
 * @author fetec
 */
public class Equipo extends Thread {
    
    /**
     * Nombre del equipo.
     * @param nombre
     */
    private String nombre;
    /**
     * Punto inicial de la carrera.
     * @param inicio
     */
    private int inicio;
    /**
     * Punto final de la carrera.
     * @param fin
     */
    private int fin;
    /**
     * Posicion del competidor uno en la carrera
     * @param posicionA1
     */
    private int posicionA1;
    /**
     * Posicion del competidor dos en la carrera
     * @param posicionA2
     */
    private int posicionA2;
    /**
     * Posicion del competidor tres en la carrera
     * @param posicionA3
     */
    private int posicionA3;
    /**
     * El constructor recibe el nombre del equipo, el inicio y el fin de la carrera
     * y por defecto establece las posiciones de los competidores.
     * @param nombre
     * @param inicio
     * @param fin
     */
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA1 = 0;
        this.posicionA2 = 33;
        this.posicionA3 = 66;
    }
    /**
     * Metodo que devuelve el string de la carrera con las posiciones
     * especificas de los competidores del grupo en cuestion.
     * @return String
    */
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
    /**
     * Metodo que devuelve el nombre del equipo.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que establece el nombre del equipo.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que devuelve el valor del inicio de la carrera.
     * @return int
     */
    public int getInicio() {
        return inicio;
    }
    /**
     * Metodo que establece el valor del inicio de la carrera.
     * @param inicio 
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * Metodo que devuelve el valor del final de la carrera.
     * @return int
     */
    public int getFin() {
        return fin;
    }
    /**
     * Metodo que establece el valor final de la carrera.
     * @param fin 
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * Metodo que devuelve la posicion actual del competidor uno.
     * @return int
     */
    public int getPosicionA1() {
        return posicionA1;
    }
    /**
     * Metodo que establece la posicion del competidor uno.
     * @param posicionA1 
     */
    public void setPosicionA1(int posicionA1) {
        this.posicionA1 = posicionA1;
    }
    /**
     * Metodo que devuelve la posicion actual del competidor dos.
     * @return int
     */
    public int getPosicionA2() {
        return posicionA2;
    }
    /**
     * Metodo que establece la posicion del competidor dos.
     * @param posicionA2 
     */
    public void setPosicionA2(int posicionA2) {
        this.posicionA2 = posicionA2;
    }
    /**
     * Metodo que devuelve la posicion actual del competidor tres.
     * @return int
     */
    public int getPosicionA3() {
        return posicionA3;
    }
    /**
     * Metodo que establece la posicion del competidor tres.
     * @param posicionA3 
     */
    public void setPosicionA3(int posicionA3) {
        this.posicionA3 = posicionA3;
    }
    
    

}
