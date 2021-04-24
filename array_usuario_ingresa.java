/*
    Cargue un array con los siguientes valores enteros: 4, 8, 15, 16, 23 Y 42 de las siguientes maneras: PIDIENDO AL USUARIO QUE INGRESE LOS 6 VALORES.
*/

package javaintegradora;

import java.util.Scanner;
import java.util.Arrays;

public class arrayUsuario {

    public static void main(String[] args) {
        
    int vector[] = new int[6]; 
    
    Scanner input = new Scanner(System.in);
    
    for (int i = 1; i < vector.length; i++) {
            System.out.println("Ingrese un valor para el vector " + i);
            vector[i] = input.nextInt();
        }
   
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
