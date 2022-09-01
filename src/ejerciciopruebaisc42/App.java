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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada <Producto> inventario = new ListaEnlazada<Producto>();
             
        inventario.insert(new Producto("Sabritas Papas Fritas", 8, 14.0f));
        inventario.insert(new Producto("Leche santa clara", 8, 21.0f));
        inventario.insert(new Producto("Chocolate carlos V", 24, 7.0f));

        System.out.println(inventario.imprimirProductosRangoPrecios(0, 20));
        //System.out.println(inventario.toString());
    }
    
}
