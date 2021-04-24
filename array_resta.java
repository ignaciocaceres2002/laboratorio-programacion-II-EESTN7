/*
	Leer por teclado una tabla de 10 elementos numéricos enteros y restarles a los mismos una unidad (-1). Mostrar por pantalla cómo quedó el array.
 */

package javaintegradora;

import java.util.Arrays;
import java.util.Collections;

public class arrayResta {

    public static void main(String[] args) {
        
     int[] vec1 = {23,43,7,34,66,43,24,67,86,3};
        
        for (int i = 0; i < 10; i++) {
            vec1[i]=vec1[i]-1;
            
            System.out.println(vec1[i]);
            System.out.println("");
        }
        
    }
    
}
