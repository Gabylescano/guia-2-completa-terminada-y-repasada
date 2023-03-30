/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia3_ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num1, num2;
        
        System.out.println("ingresa 2 numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("uno o ambos numeros  es/son mayores a 25");
            
        } else {
            System.out.println("numguno de los  muneros es  mayor a 25");
        }
        
    }
    
}
