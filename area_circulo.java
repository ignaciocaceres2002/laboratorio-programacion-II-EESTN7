/* 
	Pedir el radio de un círculo y calcular su área. A=PI*r^2
 */

package javaintegradora;

import java.util.Scanner;

public class areaCirculo {

    public static void main(String[] args) {
    
    double radio, area; 
    
    System.out.println("Ingrese el radio del circulo");
    
     Scanner input = new Scanner(System.in);
     
     radio= input.nextDouble();
     
     area = 3.14 * (radio*radio);

     System.out.println("El area del circulo es: " + area);
     
    }      
}
