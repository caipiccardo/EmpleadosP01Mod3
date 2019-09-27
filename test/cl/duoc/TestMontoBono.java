
package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMontoBono {

        
            @Test
        public void testBuscar() {
        System.out.println("Buscar");
        String rut = "22222222";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Buscar(rut).montoBono()==250000);
    }
}
