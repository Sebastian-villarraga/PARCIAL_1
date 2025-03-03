package edu.eci.cvds.tdd.producto;

import edu.eci.cvds.tdd.agente.Log;
import edu.eci.cvds.tdd.agente.Advertencia;
import java.util.ArrayList;
import java.util.List;

public class Producto {

        private String nombre;
        private Integer precio;
        private static Integer cantidadStock;
        private String categoria;
        private List<Object> agentes;

        public Producto(String nombre, Integer precio, Integer cantidadStock, String categoria) {
                this.nombre = nombre;
                this.precio = precio;
                this.cantidadStock = cantidadStock;
                this.categoria = categoria;
                this.agentes = new ArrayList<>();
        }

        public void añadirAgenteLog(String agente) {
                agentes.add(agente);
        }

        public void añadirAgenteAdvertencia(String agente) {
                agentes.add(agente);
        }

        public void modificarStock(Integer cantidad) {
                this.cantidadStock += cantidad;

                // Notificar a los agentes sobre el cambio de stock
                for (Object agente : agentes) {
                        if (agente instanceof Log) {
                                ((Log) agente).notificar(cantidadStock, this);
                        } else if (agente instanceof Advertencia) {
                                ((Advertencia) agente).notificar(cantidadStock, this);
                        }
                }
        }

        public String getNombre() {
                return nombre;
        }

        public static Integer getCantidadStock() {
                return cantidadStock;
        }

        public List<Object> getAgentes() {
                return agentes;
        }

}
