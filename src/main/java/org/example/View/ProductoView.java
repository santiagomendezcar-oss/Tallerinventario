package org.example.View;

import org.example.Model.Producto;

import java.util.List;

public class ProductoView {

    public void mostrarProducto(Producto producto) {
        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public void mostrarProductos(List<Producto> productos) {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
