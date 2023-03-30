/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package guia2_ejercicios_practicos_1;

import java.util.Scanner;

public class Guia2_ejercicios_practicos_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("ingresa dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("la suma de los numeros es: " + suma);
    
    }
    
}
