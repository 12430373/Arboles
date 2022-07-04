package Abb;

public class Nodo {
    private Nodo izquierdda;
    private int dato;
    private Nodo derecha;

    public Nodo(Nodo izquierdda, int dato, Nodo derecha) {
        this.setIzquierdda(izquierdda);
        this.setDato(dato);
        this.setDerecha(derecha);
    }

    public Nodo getIzquierdda() {
        return izquierdda;
    }

    public void setIzquierdda(Nodo izquierdda) {
        this.izquierdda = izquierdda;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
