/*
    Crea dos arrays de 10 elementos cada uno y con ellos crear un tercero, donde cada elemento sea el resultado del producto de los elementos de los mismos en la misma posición.
 */

package javaintegradora;

import java.util.Arrays;
import java.util.Collections;

public class arrayMultiplicacion {

    public static void main(String[] args) {
        
     int[] vec1 = {23,43,7,34,66,43,24,67,86,3};
     int[] vec2 = {83,4,6,44,29,12,15,47,1,33};
     int[] vec3 = new int[10];
     
        
        for (int i = 0; i < 10; i++) {
            vec3[i] = vec1[i] * vec2[i];
            
            System.out.println(vec3[i]);
            System.out.println("");
        }
        
    }
    
}
