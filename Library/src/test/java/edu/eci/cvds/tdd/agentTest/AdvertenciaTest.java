package edu.eci.cvds.tdd.agentTest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import edu.eci.cvds.tdd.agent.Advertencia;
import edu.eci.cvds.tdd.producto.Producto;

public class AdvertenciaTest {

    private Advertencia advertencia;
    private Producto productoBajoStock;
    private Producto productoSuficienteStock;

    @Before
    public void setUp() {
        advertencia = new Advertencia();
        productoBajoStock = new Producto("Play 2", 300, 3, "videojuegos");
        productoSuficienteStock = new Producto("Play 3", 400, 15, "videojuegos");
    }

    @Test
    public void testNotificarBajoStock() {
        String mensaje = advertencia.notificar(1, productoBajoStock);
        assertEquals("ALERTA!!! El stock del Producto: Producto Bajo Stock es muy bajo, solo quedan 3 unidades.", mensaje);
    }

    @Test
    public void testNotificarStockSuficiente() {
        String mensaje = advertencia.notificar(1, productoSuficienteStock);
        assertEquals("Stock suficiente", mensaje);
    }
}
