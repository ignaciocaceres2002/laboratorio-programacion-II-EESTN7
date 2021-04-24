/*
	Pedir primero el apellido y después el nombre de una persona.
 */

package javaintegradora;

import java.util.Scanner;

public class apellidoNombre {

    public static void main(String[] args) {
    
    char apellido, nombre; 
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese su apellido");
    
    apellido = input();
    
    System.out.println("Ingrese su nombre");
    
    nombre = input();
    
    System.out.println(apellido + ", " + nombre);
    
     
    }      
}
