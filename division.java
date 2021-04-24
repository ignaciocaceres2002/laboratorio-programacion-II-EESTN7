/*
    Ingresar 2 números y calcular cociente y resto entero. Avisar que no es posible cuando el divisor es cero
*/

package javaintegradora;

import java.util.Scanner;

public class division {

    public static void main(String[] args) {
    
      double num1, num2, cociente, resto;
        
        Scanner input = new Scanner( System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=input.nextDouble();
        
        System.out.println("Ingrese el segundo numero");
        num2=input.nextDouble();
        
        if (num1 != 0) {
            
            cociente=num1/num2;
            resto=num1%num2;
            
            System.out.println("El cociente es " + cociente);
            System.out.println("El resto es " + resto);
        }
        
        else {
            System.out.println("No se puede realizar la operacion");
        }
    }
    
}
