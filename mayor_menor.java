/*
    Ingresar 2 números y decir si son iguales. Si no son iguales decir si el primero es mayor o el segundo es mayor
*/

package javaintegradora;

import java.util.Scanner;

public class mayorMenor {

    public static void main(String[] args) {
    
      int num1, num2;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=input.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2=input.nextInt();
        
        if (num1 == num2) {
            
            System.out.println("Son iguales");
            
        }
        
        else {
            
            if (num1 > num2) {
                System.out.println("El primero es mayor");
            }
            
            else {
                System.out.println("El segundo es mayor");
            }
            
        }
        
    }
    
}
