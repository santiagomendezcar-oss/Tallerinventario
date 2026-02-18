package org.example;

import org.example.Controller.ProductoController;
import org.example.Service.ProductoServiceImpl;
import org.example.View.ProductoView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductoController controller = new ProductoController(
                new ProductoServiceImpl(),
                new ProductoView()
        );

        int opcion;

        do {
            System.out.println();
            System.out.println("1 Registrar");
            System.out.println("2 Listar");
            System.out.println("3 Buscar");
            System.out.println("4 Modificar");
            System.out.println("5 Eliminar");
            System.out.println("6 Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    controller.registrar(nombre, precio, cantidad);
                }
                case 2 -> controller.listar();
                case 3 -> {
                    System.out.print("ID: ");
                    controller.buscar(sc.nextLong());
                }
                case 4 -> {
                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    System.out.print("Nuevo precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Nueva cantidad: ");
                    int cantidad = sc.nextInt();
                    controller.modificar(id, precio, cantidad);
                }
                case 5 -> {
                    System.out.print("ID: ");
                    controller.eliminar(sc.nextLong());
                }
            }

        } while (opcion != 6);
    }
}
