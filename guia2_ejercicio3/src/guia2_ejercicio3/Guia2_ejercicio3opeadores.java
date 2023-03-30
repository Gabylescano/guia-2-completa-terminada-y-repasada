//Define variables donde puedas alojar los resultados y prueba usar dos 
//operadores de cada tipo.

package guia2_ejercicio3;


public class Guia2_ejercicio3opeadores {

    
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS
        int num1= 6;
        int num2= 4;
        
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);//OPERADOR DE MODULO: devuelve el resto
        
        //OPERADORES UNARIOS
        num1++;//=7
        System.out.println(num1);
        num2--;//=3
        System.out.println(num2);
        num1= -num1;// =(-7)
        System.out.println(num1);
        boolean a = true;// (!)=invierte el valor false
        System.out.println(!a);
        
        //OPERADORES DE IGUAL Y RELACION
             
        boolean resultado = (num1==num2);//falso
        System.out.println(resultado);
        boolean resultado1 = (num1!=num2);//verdadero
        System.out.println(resultado1);
        boolean resultado3 = (num1>num2);//falso
        System.out.println(resultado3);
        boolean resultado4 = (num1>=num2);//falso
        System.out.println(resultado4);
        boolean resultado5 = (num1<num2);//verd
        System.out.println(resultado5);
        boolean resultado6 = (num1<=num2);//verd
        System.out.println(resultado6);
    }
    
}
