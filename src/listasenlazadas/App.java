package listasenlazadas;

public class App {

    public static void main(String[] args) {
        listaEnlazada mi_lista = new listaEnlazada();
        mi_lista.insert(1);
        mi_lista.insert(2);
        mi_lista.insert(3);
        mi_lista.insert(4);
        mi_lista.insert(5);
        mi_lista.insert(6);
        mi_lista.insert(98);
        mi_lista.insert(15);
//        ordenInserción(mi_lista);

        System.out.println(mi_lista);
        mi_lista.eliminarNodo(4);

        mi_lista.buscarDato(5);

    }

    public static void ordenInserción(listaEnlazada lis) {
        if (!lis.isEmpty()) {

            int i = 1, j;
            Nodo aux = lis.getUltimoNodo();
            Nodo clave;
            do {
                clave = aux.getSiguiente();
                j = i - 1;
                while (aux != clave) {
                    if (aux.getDato() > clave.getDato()) {
                        Nodo s = aux;
                        aux.setSiguiente(s);

                    }
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(clave);
                aux=aux.getSiguiente();
            } while (aux.getSiguiente() != null);
        }
    }

}
//implementat metodos siguientes
//eliminar (valor)
//buscar(valor)
