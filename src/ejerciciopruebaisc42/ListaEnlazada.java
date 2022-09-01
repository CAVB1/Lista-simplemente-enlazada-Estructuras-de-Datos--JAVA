/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopruebaisc42;

/**
 *
 * @author lambda
 */
public class ListaEnlazada <E extends Producto> {

    private Nodo <E> ultimo_nodo = null;

    public boolean isEmpty() { //metodo que evalua si hay nodos en la lista
        if (ultimo_nodo == null) { //esta vacía
            return true;
        } else {  // la lista no está vacía
            return false;
        }
    }

    public void insert(E dato) {
        if (isEmpty()) { //está vacia
            Nodo <E> auxiliar = new Nodo <E>(dato, null);
            ultimo_nodo = auxiliar;
        } else { //no esta vacia
            Nodo <E> auxiliar = new Nodo <E> (dato, ultimo_nodo);
            ultimo_nodo = auxiliar;
        }
    }

    //implementar  los siguientes métodos
    public E eliminar(E dato) {
        E dato_eliminado = null;

        if (!isEmpty()) {
            // hacemos algo
            Nodo <E> auxiliar = ultimo_nodo;
            // Primer caso el nodo que deseamos eliminar es el ultimo nodo que ingreso
            if (auxiliar.getDato().equals(dato)) {
                ultimo_nodo = auxiliar.getSiguiente();
                auxiliar.setSiguiente(null);
                dato_eliminado = auxiliar.getDato();
                return dato_eliminado;
            }
            do {
                // Segundo caso, el nodo es intermedio
                if (auxiliar.getSiguiente() != null) {
                    if (auxiliar.getSiguiente().getDato().equals(dato)) {
                        dato_eliminado = auxiliar.getSiguiente().getDato();
                        //auxiliar.getSiguiente().setSiguiente(null);
                        auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                        return dato_eliminado;
                    }
                }
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != null);
        }
        return dato_eliminado;
    }
    //buscar(buscar)

    @Override
    public String toString() {
        String cadena = "ListaEnlazada{";
        if (!isEmpty()) {
            // hacemos algo
            Nodo <E> auxiliar = ultimo_nodo;
            do {
                cadena += auxiliar.getDato() + ",";
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != null);
        }

        return cadena + '}';
    }
    
    public String imprimirProductosRangoPrecios(float minimo, float maximo) {
        String cadena = "ListaEnlazada{";
        if (!isEmpty()) {
            // hacemos algo
            Nodo <E> auxiliar = ultimo_nodo;
            do {
                if((auxiliar.getDato().getPrecio() >= minimo) && (auxiliar.getDato().getPrecio() <= maximo)){
                    cadena += auxiliar.getDato() + ",";
                }
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != null);
        }

        return cadena + '}';
    }

}
