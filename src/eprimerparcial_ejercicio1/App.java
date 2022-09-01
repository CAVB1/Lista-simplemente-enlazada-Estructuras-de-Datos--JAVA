
package eprimerparcial_ejercicio1;

public class App {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEnlazada <Medicamento> inventario=new ListaEnlazada<Medicamento>();
        inventario.insert(new Medicamento("Aspirina", "Dolor"));
        inventario.insert(new Medicamento("Paracetamol", "Dolor"));
        inventario.insert(new Medicamento("Hidroclorotiazida", "Hipertensión arterial"));
        inventario.insert(new Medicamento("Diclofenaco", "Dolor"));
        inventario.insert(new Medicamento("Omeprazol", "Acidez estomacal"));
        
        System.out.println(inventario);
        
        System.out.println(inventario.printxPadecimiento("Acidez estomacal"));
        
        
        
        
        
    }
    
}
