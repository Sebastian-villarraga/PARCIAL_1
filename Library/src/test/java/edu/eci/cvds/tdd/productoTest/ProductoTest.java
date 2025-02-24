package edu.eci.cvds.tdd.productoTest;


import edu.eci.cvds.tdd.producto.Producto;
import edu.eci.cvds.tdd.agent.Log;
import edu.eci.cvds.tdd.agent.Advertencia;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class ProductoTest {

    private Producto producto;
    private Log log;
    private Advertencia advertencia;

    @Before
    public void setUp() {
        // Crear un producto con nombre, precio, cantidad de stock y categoría
        producto = new Producto("xbox series x", 100, 10, "Categoría Prueba");

        log = new Log();
        advertencia = new Advertencia();

        producto.añadirAgenteLog("Log");
        producto.añadirAgenteAdvertencia("Advertencia");
    }

    @Test
    public void testAñadirAgentes() {
        // Verificar que los agentes han sido añadidos correctamente
        producto.añadirAgenteLog("Log");
        producto.añadirAgenteAdvertencia("Advertencia");
        assertTrue(producto.getAgentes().contains("Log"));
        assertTrue(producto.getAgentes().contains("Advertencia"));
    }

    @Test
    public void testModificarStockYNotificarLog() {
        // Modificar el stock y verificar que se llama al método de Log
        producto.modificarStock(-6); // Stock baja a 4 unidades
        assertEquals("Producto: xbox -> 4 unidades disponibles", log.notificar(4, producto));
    }

    @Test
    public void testModificarStockYNotificarAdvertencia() {
        // Modificar el stock y verificar que se llama al método de Advertencia
        producto.modificarStock(-7); // Stock baja a 3 unidades
        assertEquals("ALERTA!!! El stock del Producto: Producto Prueba es muy bajo, solo quedan 3 unidades.", advertencia.notificar(3, producto));
    }
}
