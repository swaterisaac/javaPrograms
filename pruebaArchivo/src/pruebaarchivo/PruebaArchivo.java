
package pruebaarchivo;
import java.io.*;

public class PruebaArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter newArchivo = new PrintWriter("textoXD.txt");
        newArchivo.print("holaax");
        newArchivo.close();
        
        newArchivo = new PrintWriter("textoXD.txt");
        newArchivo.append("\nHOLADIJE");
        newArchivo.close();
        
        
    }
    
}
