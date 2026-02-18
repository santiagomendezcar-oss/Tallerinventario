package org.example.Service;

import org.example.Model.Producto;

import java.util.List;

public interface ProductoService {

    Producto registrar(String nombre, double precio, int cantidad);

    List<Producto> listar();

    Producto buscar(long id);

    void modificar(long id, double precio, int cantidad);

    void eliminar(long id);
}
