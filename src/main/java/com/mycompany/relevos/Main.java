/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

import Logica.Core;
import Utilitarios.Random;

/**
 * Clase que ejecuta los hilos contenidos en la clase core, no contiene ningun
 * metodo o atributos, solo la instancia de la clase y la ejecucion de su meto unico.
 * @author fetec
 */
public class Main {
    
    public static void main(String[] args) {
        
        Core c=new Core();
        c.inicio();
        
    }
    
}
