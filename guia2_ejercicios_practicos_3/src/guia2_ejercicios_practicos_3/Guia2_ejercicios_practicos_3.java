
package guia2_ejercicios_practicos_3;

import java.util.Scanner;


public class Guia2_ejercicios_practicos_3 {

    
    public static void main(String[] args) {
     
        Scanner leer= new Scanner(System.in);
        
        String frase;
        System.out.println("escribe una frase");
        frase= leer.nextLine();
        
        System.out.println("en mayusculas queda: "+ frase.toUpperCase());
        
        System.out.println("en minusculas queda: "+ frase.toLowerCase());
    }
    
}
