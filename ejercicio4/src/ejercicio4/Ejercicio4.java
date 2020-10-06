package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        System.out.println("Ingrese una cantidad de horas: ");
        horas = entrada.nextInt();
        System.out.println("La cantidad de semanas es: " + (horas / 168));
        System.out.println("La cantidad de días es: " + ((horas / 24) % 7)); //o ((horas % 168) / 24)
        System.out.println("La cantidad de horas restantes es: " + (horas % 24));
        
    }
    
}
