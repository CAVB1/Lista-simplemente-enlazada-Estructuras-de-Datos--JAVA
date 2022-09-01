
package eprimerparcial_ejercicio1;

public class Nodo < E >{
    private E dato;
    private Nodo <E>  siguiente;

    public Nodo(E dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public Nodo <E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
