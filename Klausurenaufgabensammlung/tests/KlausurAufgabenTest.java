package Klausurenaufgabensammlung.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Klausurenaufgabensammlung.Aufgabe1;
import Klausurenaufgabensammlung.Aufgabe2;

public class KlausurAufgabenTest {
    Aufgabe1 t;
    @Before
    public void init(){
    }

    @Test
    public void testNRoot(){
        assertEquals(5.0, Aufgabe1.root(125,3), 0.000001);
    }
    
    @Test
    public void testNewton(){
        assertEquals(3.141592653589793, Aufgabe2.newton(3, 0.00020), 0.000001);
    }
}
