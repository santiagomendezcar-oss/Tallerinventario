package org.example.Controller;

import org.example.Model.Producto;
import org.example.Service.ProductoService;
import org.example.View.ProductoView;

public class ProductoController {

    private final ProductoService service;
    private final ProductoView view;

    public ProductoController(ProductoService service, ProductoView view) {
        this.service = service;
        this.view = view;
    }

    public void registrar(String nombre, double precio, int cantidad) {
        Producto producto = service.registrar(nombre, precio, cantidad);
        view.mostrarMensaje("Producto registrado con ID: " + producto.getId());
        view.mostrarProducto(producto);
    }

    public void listar() {
        view.mostrarProductos(service.listar());
    }

    public void buscar(long id) {
        Producto producto = service.buscar(id);
        view.mostrarProducto(producto);
    }

    public void modificar(long id, double precio, int cantidad) {
        service.modificar(id, precio, cantidad);
        view.mostrarMensaje("Producto actualizado");
    }

    public void eliminar(long id) {
        service.eliminar(id);
        view.mostrarMensaje("Producto eliminado");
    }
}
