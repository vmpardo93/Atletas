/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.*;

/**
 *
 * @author Darkgrey93
 */
public class Core {

    Equipo equipo1 = new Equipo("Azul", 0, 100);
    Equipo equipo2 = new Equipo("Verde", 0, 100);
    Equipo equipo3 = new Equipo("Rojo", 0, 100);

    Atleta at1 = new Atleta(equipo1, 0, 33);
    Atleta at2 = new Atleta(equipo1, 33, 66);
    Atleta at3 = new Atleta(equipo1, 66, 100);
    Atleta at4 = new Atleta(equipo2, 0, 33);
    Atleta at5 = new Atleta(equipo2, 33, 66);
    Atleta at6 = new Atleta(equipo2, 66, 100);
    Atleta at7 = new Atleta(equipo3, 0, 33);
    Atleta at8 = new Atleta(equipo3, 33, 66);
    Atleta at9 = new Atleta(equipo3, 66, 100);

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
