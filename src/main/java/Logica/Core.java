/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.*;

/**
 * Clase la cual instancia los diferentes objetos para ejecutar los hilos y 
 * contienen su respectiva informacion.
 * @author Darkgrey93
 */
public class Core {
    /**
     * Objeto que contiene la informacion del primer equipo de competidores
     * @param Equipo
     */
    Equipo equipo1 = new Equipo("Azul", 0, 100);
    /**
     * Objeto que contiene la informacion del segundo equipo de competidores
     * @param Equipo
     */
    Equipo equipo2 = new Equipo("Verde", 0, 100);
    /**
     * Objeto que contiene la informacion del tercer equipo de competidores
     * @param Equipo
     */
    Equipo equipo3 = new Equipo("Rojo", 0, 100);
    /**
     * Objeto que contiene la informacion del primer atleta del primer equipo.
     * @param Atleta
     */
    Atleta at1 = new Atleta(equipo1, 0, 33);
    /**
     * Objeto que contiene la informacion del primer atleta del segundo equipo equipo.
     * @param Atleta
     */
    Atleta at4 = new Atleta(equipo2, 0, 33);
    /**
     * Objeto que contiene la informacion del primer atleta del tercer equipo equipo.
     * @param Atleta
     */
    Atleta at7 = new Atleta(equipo3, 0, 33);
    /**
     * Objeto que contiene la informacion del segundo atleta del primer equipo equipo.
     * @param Atleta
     */
    Atleta at2 = new Atleta(equipo1, 33, 66);
    /**
     * Objeto que contiene la informacion del segundo atleta del segundo equipo equipo.
     * @param Atleta
     */
    Atleta at5 = new Atleta(equipo2, 33, 66);
    /**
     * Objeto que contiene la informacion del segundo atleta del tercer equipo equipo.
     * @param Atleta
     */
    Atleta at8 = new Atleta(equipo3, 33, 66);
    /**
     * Objeto que contiene la informacion del tercer atleta del primer equipo equipo.
     * @param Atleta
     */
    Atleta at3 = new Atleta(equipo1, 66, 100);
    /**
     * Objeto que contiene la informacion del tercer atleta del segundo equipo equipo.
     * @param Atleta
     */
    Atleta at6 = new Atleta(equipo2, 66, 100);
    /**
     * Objeto que contiene la informacion del tercer atleta del tercer equipo equipo.
     * @param Atleta
     */
    Atleta at9 = new Atleta(equipo3, 66, 100);
    /**
     * Metodo de la clase Core que ejecuta los hilos previamente inicializados.
     */
    public void inicio(){
        at1.start ();

        at4.start ();

        at7.start ();

        at2.start ();

        at5.start ();

        at8.start ();

        at3.start ();

        at6.start ();

        at9.start ();
    }
}
