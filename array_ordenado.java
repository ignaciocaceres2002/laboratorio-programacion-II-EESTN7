/*
    Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}. Luego, muestre el resultado.
 */

package javaintegradora;

import java.util.Arrays;
import java.util.Collections;

public class arrayOrdenado {

    public static void main(String[] args) {
        
     int[] vec1 = {1,2,3,4,5};
        int[] vec2 = new int[5];
        
        for (int i : vec1) {
            System.out.println(vec1);
            System.out.println("");
        }

		Arrays.sort(vec1, Collections.reverseOrder());
  
        for (int i : vec2) {
            vec1[i]=vec2[i];
        }

		for (int i : vec2) {
            System.out.println(vec2);
            System.out.println("");
        }
         
    }
    
}
