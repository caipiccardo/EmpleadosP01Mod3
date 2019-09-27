
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        String rut="123-5";
       
        BussEmpleado instance = new BussEmpleado();
        Empleado obj = new Empleado(rut, "holahola", 1, 1);
        assertTrue(instance.Modificar(obj));
        
    }
}
