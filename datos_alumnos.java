/*
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1,75.
*/

package javaintegradora;

import java.util.Scanner;

public class datosAlumnos {

    public static void main(String[] args) {
    
      int edad, contEdad=0, mayor=1;
        double altura, contAltura=0, alto=1;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= 5; i++) {
            
            System.out.println("Indicar la edad del alumno");
            edad = input.nextInt();
            
            System.out.println("Indicar la altura del alumno");
            altura = input.nextDouble();
            
            contEdad+=edad;
            contAltura+=altura;
            
                if (edad >=18) {
                
                    mayor++;
                }
                
                if (altura >= 1.75) {
                
                    alto++;
                }
            
        }
        
        contEdad/=5;
        contAltura/=5;
        
        System.out.println("La edad media es de: " + contEdad);
        System.out.println("La altura media es de " + contAltura);
        System.out.println("Hay " + mayor + " alumnos mayores de 18 años");
        System.out.println("Hay " + alto + " alumnos que miden mas de 1.75");
        
        
    }
    
}
