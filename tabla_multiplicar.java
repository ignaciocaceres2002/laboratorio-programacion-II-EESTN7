/*
    Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
*/

package javaintegradora;

import java.util.Scanner;

public class tablasMulti {

    public static void main(String args[]) {
        
        int num=0, mult=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a multiplicar");
        num = input.nextInt();
        
        
                for (int i = 1; i <= 10; i++) {
                    
                    mult = i * num;
                    
                    System.out.println(i + " * " + num + " = " + mult);
                    
                }
               
        
    }
    
}
