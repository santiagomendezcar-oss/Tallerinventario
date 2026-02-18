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

        // POST
        Producto p1 = controller.registrarProducto("borrador", 2000, 20);
        Producto p2 = controller.registrarProducto("Blog de hojas", 5000, 15);

        // GET
        controller.mostrarTodos();
        // PUT
        controller.modificarProducto(p1, 3000, 10);
        // PUT
        controller.cambiarEstado(p1, EstadoPedido.ACTIVO);
        // GET
        controller.mostrarProducto(p1);
        // DELETE
        controller.eliminarProducto(p2);
        // GET
        controller.mostrarTodos();
    }
}
