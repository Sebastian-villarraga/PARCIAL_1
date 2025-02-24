package edu.eci.cvds.tdd.agentTest;

import static org.junit.Assert.assertEquals;

import edu.eci.cvds.tdd.producto.Producto;
import org.junit.Before;
import org.junit.Test;
import edu.eci.cvds.tdd.agent.Log;

public class LogTest {

    private Log log;
    private Producto producto;

    @Before
    public void setUp() {
        log = new Log();
    }

    @Test
    public void testNotificarBajoStock() {
        String mensaje = log.notificar(3, producto);
        assertEquals("Producto: Producto Bajo Stock -> 3 unidades disponibles", mensaje);
    }

    @Test
    public void testNotificarStockSuficiente() {
        String mensaje = log.notificar(10, producto);
        assertEquals("Producto: Producto Suficiente Stock -> 10 unidades disponibles", mensaje);
    }
}
