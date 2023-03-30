
package guia2_ejercicios_practicos_5;

import java.util.Scanner;


public class Guia2_ejercicios_practicos_5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double num;
        System.out.println("ingresa un numero entero");
        num = leer.nextInt();
        
        System.out.println("el doble del numero es : " + num * 2);
        System.out.println("el triple del numero es : " + num * 3);
        System.out.println("la raiz cuadrada del numero es : " + Math.sqrt(num));
       
    }
    
}
