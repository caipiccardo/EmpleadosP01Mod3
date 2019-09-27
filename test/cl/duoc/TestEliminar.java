
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author kame
 */
public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "123-5";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Eliminar(rut));
       
    }
}
