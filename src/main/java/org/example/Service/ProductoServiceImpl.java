package org.example.Service;

import org.example.Model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    private List<Producto> productos = new ArrayList<>();
    private long contadorId = 1;

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
    public Producto buscar(long id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void modificar(long id, double precio, int cantidad) {
        Producto producto = buscar(id);
        if (producto != null) {
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
        }
    }

    @Override
    public void eliminar(long id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
