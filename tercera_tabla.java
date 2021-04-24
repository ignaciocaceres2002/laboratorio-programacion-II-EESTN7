/*
    Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera, de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */

package javaintegradora;

import java.util.Scanner;
import java.util.Arrays;

public class tercaraTabla {

    public static void main(String[] args) {
        

        int tablaA[] = new int[12], tablaB[] = new int[12], tablaC[] = new int[24]; 
        
   
        System.out.println("Tabla A");
        for (int i = 0; i < tablaA.length; i++) {
            tablaA[i] = (int) (Math.random() * 99) + 1; 
            
            System.out.println(tablaA[i]);
        }
        
        
       System.out.println("Tabla B");
        for (int i = 0; i < tablaB.length; i++) {
            tablaB[i] = (int) (Math.random() * 99) + 1; 
            
            System.out.println(tablaB[i]);
        }
        

        System.out.println("Tabla C");
            for (int i = 0; i < tablaC.length; i++) {
               
  
                for (int j = 0; j < 3; j++) {
                    System.out.println(tablaA[i]);
                    i++;
                }
                
                for (int y = 0; y < 3; y++) {
                    System.out.println(tablaB[i]);
                    i++;
                }
                
            }   
     
    }
    
}
