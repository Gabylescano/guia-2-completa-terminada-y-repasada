/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_ejercicio4;

import java.util.Random;

public class Guia2_ejercicio4 {

    public static void main(String[] args) {
        String nombre = "gaby";
        int edad = 45;
        System.out.println(nombre + " " + edad);

        //charAt()= retorna el caracter especifico
        System.out.println(nombre.charAt(3) + " " + edad);

        String saludo = "hola";
        //equals(String str)
        //Sirve para comparar si dos cadenas son iguales.
        //Devuelve true si son iguales y false si no.
        System.out.println(nombre.equals(saludo));

        //equalIgnoreCase()
        String nombre1 = "GABY";
        System.out.println(nombre.equalsIgnoreCase(nombre1));

        System.out.println(nombre.concat(saludo));
        System.out.println(nombre.concat("lescano"));
            //INDEXOF
        String cadena = "Hola mundo";
        int indice = cadena.indexOf("mundo");

        if (indice != -1) {
            System.out.println("La subcadena 'mundo' se encuentra en la posición " + indice);
        } else {
            System.out.println("La subcadena 'mundo' no se encuentra en la cadena");
        }
        //ENDSWITH
        if (cadena.endsWith("mundo")) {
            System.out.println("La cadena termina con 'mundo'");
        } else {
            System.out.println("La cadena no termina con 'mundo'");
        }
        //STARTSWITH
        if (cadena.startsWith("mundo")) {
            System.out.println("La cadena empieza con 'mundo'");
        } else {
            System.out.println("La cadena no empieza con 'mundo'");
                }
        
        //LENGTH()
        int longitud = cadena.length();
        System.out.println("La cadena tiene " + longitud + " caracteres");   
        
        //replace(char oldChar, char newChar)
        cadena = cadena.replace('a', '#');
        cadena = cadena.replace('e', '€');
        cadena = cadena.replace('i', '$');
        cadena = cadena.replace('o', '&');
        cadena = cadena.replace('u', '%');
        
        System.out.println(cadena);
        
        //split(String regex)
        String cadena1 = "Hola, mundo, cómo, estás?";
        String[] arreglo = cadena1.split(", ");
        for (String parte : arreglo) {
            System.out.println(parte);
            }
        
        //substring(int beginIndex)
        //Retorna la sub cadena desde el carácter del parámetro
        
            //substring(int beginIndex, int endIndex)
            //String cadenaOriginal = "Esta es una cadena de texto.";
            //String subcadena = cadenaOriginal.substring(5, 15);
            //System.out.println(subcadena);


        String cadenaOriginal = "Esta es una cadena de texto.";
        String subcadena = cadenaOriginal.substring(5);

        System.out.println(subcadena); // salida: "es una cadena de texto"

        //toCharArray()
        String cadenaOriginal2 = "Ejemplo";
        char[] arregloCaracteres = cadenaOriginal2.toCharArray();

        for (int i = 0; i < arregloCaracteres.length; i++) {
            System.out.println(arregloCaracteres[i]);            
            }
        
        //toLowerCase        
        String cadenaMinusculas = cadenaOriginal.toLowerCase();
        System.out.println(cadenaMinusculas);
        
        //toUpperCase        
        String cadenaMayusculas = cadenaMinusculas.toUpperCase();
        System.out.println(cadenaMayusculas);
        
        //de int a String
        int numeroEntero= 12345;
        String numCadena = String.valueOf(numeroEntero);
        System.out.println(numCadena);
        
        // de String a int
        int cadenaNum = Integer.parseInt(numCadena);
        System.out.println(cadenaNum);
        
        //CLASE MATH
        
        //abs(double a)(ABSOLUTO)
        //abs(int a)
        int numero = -42;
        int valorAbsoluto = Math.abs(numero);

        System.out.println(valorAbsoluto); // salida: 42.0   
        
        //max(int a, int b)
        // min(int a, intb)
        int num1= 10;
        int num2=20;
        
        int maximo = Math.max(num2, num1);
        System.out.println(maximo);
        
        /*int[] numeros = {42, 24, 56, 39, 78};
        int num_maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            num_maximo = Math.max(num_maximo, numeros[i]);
        }

        System.out.println("vector " + num_maximo); // salida: 78
        */
        int[] numeros = {42, 24, 56, 39, 78};
        int num_minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            num_minimo = Math.min(num_minimo, numeros[i]);
        }

        System.out.println("vector " + num_minimo); // salida: 24
        
        //pow(double a, double b)
//Devuelve el valor del primer argumento elevado a la potencia del segundo argumento.
        double resultado = Math.pow(2, 3);
        System.out.println(resultado); // salida: 8.0
        //RANDOM
        Random generadorAleatorio = new Random();
        int numeroAleatorio = generadorAleatorio.nextInt(111);
        System.out.println(numeroAleatorio); // salida: un número aleatorio entre 0 y 10 (incluye 0 y 10)
        
        //round(double a)        
        double n = 3.7;
        int numeroRedondeado = (int) Math.round(n);
        System.out.println(numeroRedondeado); // salida: 4
        
        
    }
}
