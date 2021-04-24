/*
    Crea un array de números de 10 posiciones, que contendrá los primeros números pares. Muestra el array completo y la suma de ellos.
*/

package javaintegradora;

import java.util.Arrays;

public class sumaPares {

    public static void main(String[] args) {
        
    int vector[] = new int[10], par=0, suma=0; 
    
    for (int i = 1; i < vector.length; i++) {
            
        par+=2;
        vector[i]=par;
        suma+=vector[i]; 
      
        }
   
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("La sumatoria de los arrays es: " + suma);

    }
