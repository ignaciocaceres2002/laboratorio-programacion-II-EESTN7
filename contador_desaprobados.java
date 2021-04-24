/*
    Pedir las notas de los 16 alumnos de una clase y decir cuántos desaprobados hubo.
*/

package javaintegradora;

import java.util.Scanner;

public class contDesaprobados {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int cal=1, contDes=1;
    
        for (int i = 1; i <= 16; i++) {
            
            System.out.println("Ingrese la calificacion");
            cal = input.nextInt();
            
                if(cal <= 6) {
                    contDes++;
                }
            
        }
        
        System.out.println("Hay " + contDes + " desaprobados");
        
}

}
