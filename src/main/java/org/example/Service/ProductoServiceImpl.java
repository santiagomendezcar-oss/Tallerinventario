package org.example.Service;

import org.example.Model.EstadoPedido;
import org.example.Model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    private List<Producto> productos = new ArrayList<>();
    private Long contadorId = 1L;

    @Override
    public Producto registrar(String nombre, double precio, int cantidad) {
        Producto producto = new Producto(contadorId++, nombre, precio, cantidad);
        productos.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listar() {
        return productos;
    }
    @Override
    public void modificar(Producto producto, double precio, int cantidad) {
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
    }
    @Override
    public void cambiarEstado(Producto producto, EstadoPedido estado) {
        producto.setEstado(estado);
    }
    @Override
    public void eliminar(Producto producto) {
        productos.remove(producto);
    }
}
