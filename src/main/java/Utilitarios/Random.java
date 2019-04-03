/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 * Clase que sirve para generar un numero random de 0 a 3, no contiene parametros.
 * @author fetec
 */
public class Random {
    
    /**
     * Devuelve un numero aleatorio de tipo integer del 0 al 3
     * @return int
     */
    public static int random(){
        double i=Math.random()*100;
        int j=(int) i;
        if(j<25){
            j=0;
        }
        else if(j>=25&&j<50){
            j=1;
        }
        else if(j>=50&&j<75){
            j=2;
        }
        else if(j>=75){
            j=3;
        }
        return j;
    }
    
}