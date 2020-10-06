package pck1;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        int opcion = 0;
        int lado1 = 0,lado2 = 0;
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero ob1;
        while(opcion != 3){
            System.out.print("Ingrese la opción.\n1.Cuadrado\n2.Rectangulo\n3.Salir\n-->");
            opcion = entrada.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el lado: ");
                    lado1 = entrada.nextInt();
                    //Creamos objeto
                    
                    break;
                case 2:
                    System.out.println("Ingrese el lado 1: ");
                    lado1 = entrada.nextInt();
                    System.out.println("Ingrese el lado 2: ");
                    lado2 = entrada.nextInt();
                    //Creamos objeto
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta\n\n");
            }
            if(opcion == 1){
                ob1 = new Cuadrilatero(lado1);
                ob1.imprimirDatos();
            }
            else if(opcion == 2){
                ob1 = new Cuadrilatero(lado1,lado2);
                ob1.imprimirDatos();
            }
        }
    }
    
}
