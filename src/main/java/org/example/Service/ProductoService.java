package org.example.Service;

import org.example.Model.EstadoPedido;
import org.example.Model.Producto;
import java.util.List;

public interface ProductoService {

    Producto registrar(String nombre, double precio, int cantidad);

    List<Producto> listar();

    void modificar(Producto producto, double precio, int cantidad);

    void cambiarEstado(Producto producto, EstadoPedido estado);

    void eliminar(Producto producto);
}
