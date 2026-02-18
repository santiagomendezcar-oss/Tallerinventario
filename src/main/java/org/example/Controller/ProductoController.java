package org.example.Controller;

import org.example.Model.EstadoPedido;
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

    public Producto registrarProducto(String nombre, double precio, int cantidad) {
        Producto producto = service.registrar(nombre, precio, cantidad);
        view.mostrarMensaje("Producto Registrado");
        return producto;
    }

    public void mostrarProducto(Producto producto) {
        view.mostrarProducto(producto);
    }

    public void mostrarTodos() {
        view.mostrarProductos(service.listar());
    }

    public void modificarProducto(Producto producto, double precio, int cantidad) {
        service.modificar(producto, precio, cantidad);
        view.mostrarMensaje("Producto Modificado");
    }

    public void cambiarEstado(Producto producto, EstadoPedido estado) {
        service.cambiarEstado(producto, estado);
        view.mostrarMensaje("Estado Cambiado");
    }

    public void eliminarProducto(Producto producto) {
        service.eliminar(producto);
        view.mostrarMensaje("Producto eliminado");
    }
}
