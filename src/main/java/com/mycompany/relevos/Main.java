/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relevos;

import Utilitarios.Random;

/**
 *
 * @author fetec
 */
public class Main {
    
    public static void main(String[] args) {
        
        Random r=new Random();
        for(int i=0;i<10;i++){
            System.out.println(r.random());
        }
        
    }
    
}
