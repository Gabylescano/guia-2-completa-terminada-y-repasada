
package guia2_ejercicios_practicos_2;

import java.util.Scanner;


public class Guia2_ejercicios_practicos_2 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); // crear objeto Scanner
        String n; // declarar variable
        
        System.out.println("¿Cuál es tu nombre?"); // solicitar entrada de usuario
        n = leer.nextLine(); // leer entrada de usuario
        
        System.out.println("Tu nombre es: " + n); 
    }
    
}
