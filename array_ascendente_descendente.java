/*
    Se tiene un array con los siguiente valores enteros {13,-2,27,0,6, -54}. Listarlos en orden ascendente y descendente.
 */

package javaintegradora;

import java.util.Arrays;
import java.util.Collections;

public class arrayAscDesc {

    public static void main(String[] args) {
        
    int[] num = {13,-2,27,0,6, -54};
        
        Arrays.sort(num);
        
        for (int i : num) {
            System.out.println(num);
            System.out.println("");
        }
        
        Arrays.sort(num, Collections.reverseOrder());
        
        for (int i : num) {
            System.out.println(num);
            System.out.println("");
        }
        
        
    }
}
