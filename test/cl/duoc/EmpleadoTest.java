/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kame
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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

    /**
     * Test of getRut method, of class Empleado.
     */
    @org.junit.Test
    public void testGetRut() {
        System.out.println("getRut");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRut method, of class Empleado.
     */
    @org.junit.Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Empleado instance = new Empleado();
        instance.setRut(rut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @org.junit.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @org.junit.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Empleado.
     */
    @org.junit.Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Empleado.
     */
    @org.junit.Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Empleado instance = new Empleado();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntiguedad method, of class Empleado.
     */
    @org.junit.Test
    public void testGetAntiguedad() {
        System.out.println("getAntiguedad");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getAntiguedad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAntiguedad method, of class Empleado.
     */
    @org.junit.Test
    public void testSetAntiguedad() {
        System.out.println("setAntiguedad");
        int antiguedad = 0;
        Empleado instance = new Empleado();
        instance.setAntiguedad(antiguedad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of montoBono method, of class Empleado.
     */
    @org.junit.Test
    public void testMontoBono() {
        System.out.println("montoBono");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.montoBono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
