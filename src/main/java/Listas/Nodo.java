package Listas;
public class Nodo {
    public String dato;
    public Nodo enlace;

    public Nodo(String dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Nodo(String dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }
}



