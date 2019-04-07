/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Logica.Core;
import Utilitarios.Atleta;
import Utilitarios.Equipo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darkgrey93
 */
public class Pruebas {
    Core core = new Core();
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void avanzar() {
        Equipo equipo1 = new Equipo("Azul", 0, 100);
        Atleta atleta = new Atleta(equipo1, 0, 33);

        int resultadoAvanzar = atleta.avanzar(1);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado, resultadoAvanzar);
    }
}
