/*
    Pedir números hasta que se introduzca uno negativo, y calcular el promedio.
*/

package javaintegradora;

import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
    
      int num=0, cuenta=0, cont=1, prom=0;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca un nuevo numero");
            num = input.nextInt();
            cuenta = cuenta + num;
            cont++;
            
        }
        
        while(num>0) {
        
        prom = cuenta/cont;
        
        System.out.println("El promedio de los numeros es de " + prom);
        
    }
    
}
