/*
    Cargue un array con los siguientes valores enteros: 4, 8, 15, 16, 23 Y 42 de las siguiente manera: POR ASIGNACIÓN DIRECTA.
 */

package javaintegradora;

import java.util.Arrays;

public class asignacionDirecta {

    public static void main(String[] args) {
        
    int vector[] = new int[6]; 
    
    vector[0] = 4; 
    vector[1] = 8; 
    vector[2] = 15; 
    vector[3] = 16; 
    vector[4] = 23; 
    vector[5] = 46; 
    
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
