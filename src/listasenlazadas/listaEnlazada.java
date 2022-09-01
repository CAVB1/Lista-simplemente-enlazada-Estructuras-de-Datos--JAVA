    
package listasenlazadas;

public class listaEnlazada {
    private Nodo ultimoNodo=null;
    
    public boolean isEmpty(){//metodo que evalua si hay nodos en la lista
        if(ultimoNodo==null){//vacio
            return true;
        }else{
            return false;//la lista no estpa vacía
        }     
    }
    
    public void insert(int dato){
        if(isEmpty()){
            Nodo auxiliar=new Nodo(dato, null);
            ultimoNodo=auxiliar;
        }else{
            Nodo auxiliar=new Nodo(dato, ultimoNodo);
            ultimoNodo=auxiliar;
        }
    }

    @Override
    public String toString() {
        String cadena="Lista enlazada {";
        if(!isEmpty()){
            Nodo auxiliar=ultimoNodo;
            do{
                cadena+=auxiliar.getDato()+" ,";
                auxiliar=auxiliar.getSiguiente();
            }while(auxiliar!=null);            
        }
        
        return cadena+" }";
    }
    
    
    public void eliminarNodo(int busqueda){
        if(!isEmpty()){
              Nodo auxiliar=ultimoNodo;
              Nodo otro=ultimoNodo;
              boolean found=false;
            do{
               
                if(auxiliar.getDato()==busqueda){
                    if(auxiliar==ultimoNodo){
                          System.out.println("Dato eliminado");
                          ultimoNodo=auxiliar.getSiguiente();
                          found=true;
                    }else{
                        System.out.println("Dato eliminado");
                        otro.setSiguiente(auxiliar.getSiguiente());
                        
                        
                        found=true;
                        
                    }
                }
                    otro=auxiliar;
                    auxiliar=otro.getSiguiente();
                
               
            }while(auxiliar!=null);
            if(!found){
                System.out.println("Dato no encontrado");
            }else{
                System.out.println(toString());
            }
        }else{
          
            System.out.println("Esta lista esta vacía");
            
        }
    }
    
    public void buscarDato(int busqueda){
        if(!isEmpty()){
            Nodo auxiliar=ultimoNodo;
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

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }
    
    
    
}
