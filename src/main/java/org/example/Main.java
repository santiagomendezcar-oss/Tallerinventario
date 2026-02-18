package org.example;

import org.example.Controller.ProductoController;
import org.example.Model.EstadoPedido;
import org.example.Model.Producto;
import org.example.Service.ProductoService;
import org.example.Service.ProductoServiceImpl;
import org.example.View.ProductoView;

public class Main {

    public static void main(String[] args) {

        ProductoService service = new ProductoServiceImpl();
        ProductoView view = new ProductoView();
        ProductoController controller = new ProductoController(service, view);

        // post
        Producto p1 = controller.registrarProducto("borrador", 2000, 20);
        Producto p2 = controller.registrarProducto("Blog de hojas", 5000, 15);

        // get
        controller.mostrarTodos();
        // put
        controller.modificarProducto(p1, 3000, 10);
        // put
        controller.cambiarEstado(p1, EstadoPedido.ACTIVO);
        // get
        controller.mostrarProducto(p1);
        // delete
        controller.eliminarProducto(p2);
        // get
        controller.mostrarTodos();
    }
}
