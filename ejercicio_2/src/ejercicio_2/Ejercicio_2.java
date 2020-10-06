package ejercicio_2;
/* 
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene
la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e 
imprima la cantidad de dinero que tienen los tres.
*/
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero N de guillermo: ");
        float dineroGuille = entrada.nextFloat();
        System.out.println("El dinero de Guille es: " + dineroGuille);
        System.out.println("El dinero de Luis es: " + (dineroGuille/2));
        System.out.println("El dinero de Juan es: " + (3*dineroGuille/4));
        System.out.println("La cantidad total es: "+ (9*dineroGuille/4));
    }
    
}
