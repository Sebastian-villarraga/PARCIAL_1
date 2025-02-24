package edu.eci.cvds.tdd.agent;

import edu.eci.cvds.tdd.producto.Producto;

public class Advertencia {

    public String notificar(Integer self, Producto producto) {
        if (Producto.getCantidadStock() < 5) {
            return "ALERTA!!! El stock del Producto: " + producto.getNombre() + " es muy bajo, solo quedan " + producto.getCantidadStock() + " unidades.";
        }
        return "Stock suficiente";
    }
}
