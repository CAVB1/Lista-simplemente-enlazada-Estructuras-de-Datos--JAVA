/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana4ed42;

/**
 *
 * @author lambda
 */
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
