package edu.eci.cvds.tdd.agent;

import edu.eci.cvds.tdd.producto.Producto;

public class Log {
    public String notificar(Integer amount, Producto producto) {
        if (amount < 5) {
            return "Producto: " + producto.getNombre() + " -> " + producto.getCantidadStock() + " unidades disponibles";
        }
        return "Stock suficiente";
    }
}
