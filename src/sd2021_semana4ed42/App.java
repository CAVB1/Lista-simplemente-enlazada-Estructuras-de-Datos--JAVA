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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada <Integer> mi_lista = new ListaEnlazada <Integer>();
        
        mi_lista.insert(5);
        mi_lista.insert(8);//inserción de datos
        mi_lista.insert(3);
        mi_lista.insert(9);

        System.out.println(mi_lista);//imprime la lista con los valores insertados
        mi_lista.insertBefore(5, 1);//inserta un 1 antes del 5
        mi_lista.insertAfter(9, 4);//inserta un 4 después del 9
        mi_lista.delete(mi_lista);//elimina todos los datos de la lista
             

        
        
//        ListaEnlazada <String> nombres = new ListaEnlazada<String>();
//        nombres.insert("Uriel");
//        nombres.insert("Juan");
//        nombres.insert("Carlos");
//        nombres.insert("Miriam");
//        System.out.println(nombres);

//          ListaEnlazada <Libro> libros = new ListaEnlazada<Libro>();
//          libros.insert(new Libro("Harry Potter", "Rowling", 1));
//          Libro p = new Libro("Java", "Goldsling", 1);
//          libros.insert(p);
//          libros.insert(new Libro("Caballo de Troya 1", "J.J. Benitez", 2));
//          libros.insert(new Libro("Caballo de Troya 2", "J.J. Benitez", 1));
//          System.out.println(libros);
//          libros.eliminar(new Libro("Java", "Goldsling", 1));
//          System.out.println(libros);
    }
   
    
}
