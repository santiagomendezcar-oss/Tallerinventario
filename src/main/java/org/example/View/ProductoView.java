package org.example.View;

import org.example.Model.Producto;
import java.util.List;

public class ProductoView {

    public void mostrarProducto(Producto producto) {
        System.out.println(producto);
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
