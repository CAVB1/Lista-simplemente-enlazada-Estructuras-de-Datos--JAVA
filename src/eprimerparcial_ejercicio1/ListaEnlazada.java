/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eprimerparcial_ejercicio1;

/**
 *
 * @author lambda
 */
public class ListaEnlazada <E extends Medicamento> {

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
        String cadena = "Inventario de medicamentos \n";
        if (!isEmpty()) {
            // hacemos algo
            Nodo <E> auxiliar = ultimo_nodo;
            do {
                cadena += auxiliar.getDato().getNombre() + "\n";
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != null);
        }

        return cadena;
    }
    
     public void buscarDato(E busqueda){
        if(!isEmpty()){
            Nodo auxiliar=ultimo_nodo;
            int cont=1;
            boolean found=false;
            do{
                if(auxiliar.getDato()==busqueda){
                    System.out.println( "Elemento "+busqueda+" encontrado en la posición "+cont);
                    
                    
                    found=true;
                }
                auxiliar=auxiliar.getSiguiente();
                cont++;
                
            }while(auxiliar!=null);
            if(!found){
                System.out.println("Dato no encontrado");
            }else{
                System.out.println(toString());
            }
        }
    }
    
     public void insertBefore(E busqueda, E dato){
        if(!isEmpty()){
            Nodo auxiliar=ultimo_nodo;
            Nodo auxiliar2=auxiliar.getSiguiente();
            int cont=1;
            boolean found=false;
            if(auxiliar.getDato()==busqueda){
                Nodo <E> nuevo= new Nodo <E> (dato, ultimo_nodo);
                ultimo_nodo = nuevo;
                found=true;
                
            }
            do{
                if(auxiliar2.getDato().equals(busqueda)){
                    Nodo <E> nuevo=new Nodo <E>(dato,auxiliar.getSiguiente());
                    auxiliar.setSiguiente(nuevo);
                    found=true;
                }
                auxiliar=auxiliar.getSiguiente();
                auxiliar2=auxiliar2.getSiguiente();
                cont++;
                
            }while(auxiliar2!=null);
            if(!found){
                System.out.println("Dato no encontrado");
            }else{
                System.out.println(toString());
            }
        }
    }
     
      public void insertAfter(E busqueda, E dato){
        if(!isEmpty()){
            Nodo auxiliar=ultimo_nodo;
            Nodo auxiliar2=auxiliar.getSiguiente();
            int cont=1;
            boolean found=false;
            if(auxiliar.getDato()==busqueda){
                Nodo <E> nuevo= new Nodo <E> (dato, auxiliar.getSiguiente());
                ultimo_nodo.setSiguiente(nuevo);
                found=true;
                
            }
            do{
                if(auxiliar2.getDato().equals(busqueda)){
                    Nodo <E> nuevo=new Nodo <E>(dato,auxiliar2.getSiguiente());
                    auxiliar2.setSiguiente(nuevo);
                    found=true;
                }
                auxiliar=auxiliar.getSiguiente();
                auxiliar2=auxiliar2.getSiguiente();
                cont++;
                
            }while(auxiliar2!=null);
            if(!found){
                System.out.println("Dato no encontrado");
            }else{
                System.out.println(toString());
            }
        }
    }
      
      public void delete(ListaEnlazada lista){
          
        if (!isEmpty()) {
            // hacemos algo
            Nodo <E> auxiliar = ultimo_nodo;
            Nodo <E> auxiliar2=auxiliar.getSiguiente();
            do {
                
               ultimo_nodo = auxiliar.getSiguiente();
               
               auxiliar.setSiguiente(null);
               auxiliar=auxiliar2;
               auxiliar2=auxiliar2.getSiguiente();
               if(auxiliar2==null){
                   ultimo_nodo=auxiliar2;
               } 
            } while (auxiliar2 != null);
        }
          System.out.println(toString());
      }
      
      public String printxPadecimiento(String parametro){
          String  cadena="Medicamentos para "+parametro+"\n";
           if(!isEmpty()){
            
            Nodo <E> auxiliar=ultimo_nodo;
            int cont=1;
            boolean found=false;
            do{
                if(auxiliar.getDato().getPadecimiento().equals(parametro)){
                    cadena+=auxiliar.getDato().getNombre()+"\n";
                    
                    
                    found=true;
                }
                auxiliar=auxiliar.getSiguiente();
                cont++;
                
            }while(auxiliar!=null);
            if(!found){
                cadena="Dato no encontrado";
            }
        }
           return cadena;
      }

}
