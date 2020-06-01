package l1poo;
import java.util.Scanner;


/**
 *
 * @author Pablo Maldonado Manzano
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----- Libros. -----");  
        MyBook my_book = new MyBook();
        int opcion = 1;                    
        do {
            
            try{                
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("Selecciona una opción.");
                System.out.println("Opción 1: ingresar título de libro.");
                System.out.println("Opción 0: Salir.");
                Scanner opciones = new Scanner(System.in);
                opcion = opciones.nextInt();
                               
                switch(opcion){
                    case 1:                        
                        Scanner teclado = new Scanner(System.in);
                        System.out.println("Ingresa el nombre del libro.");
                        String titulo = teclado.nextLine();
                        my_book.setTitle(titulo);                        
                        System.out.println(my_book.getTitle());                                    
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                                
            }catch(Exception e){
                System.out.println("Error: La opción es inválida.");                          
            }            
                
        } while(opcion != 0);       
    }
}
