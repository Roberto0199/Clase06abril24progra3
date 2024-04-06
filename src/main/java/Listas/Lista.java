package Listas;

import java.util.Scanner;

public class Lista {
    public Nodo primero;

    public Lista() {
        primero = null;
    }

    private String leerNombre() {
        System.out.println("Ingrese un nombre, escriba 'fin' para terminar:");
        return new Scanner(System.in).nextLine();
    }

    public Lista crearLista() {
        String nombre;
        primero = null;
        do {
            nombre = leerNombre();
            if (!nombre.equalsIgnoreCase("fin")) {
                primero = new Nodo(nombre, primero);
            }
        } while (!nombre.equalsIgnoreCase("fin"));
        return this;
    }

    public Lista insertarCabeza(String entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar() {
        Nodo n = primero;
        int k = 0;
        while (n != null) {
            System.out.println(n.dato);
            n = n.enlace;
            k++;
            // Cada 15 elementos, hace un salto de línea para imprimir
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }
}
