/*
	Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */

package javaintegradora;

import java.util.Scanner;

public class contNumeros {

    public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
    
      int num=1, contNum=1;
    
    while (num >= 0) {
    
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        
        contNum++;
 
    }

        System.out.println("Se ingresaron " + contNum + " numeros");
}

}
