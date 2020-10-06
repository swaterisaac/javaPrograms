package model;
/* 
Funciones generales para ocupar en el controlador
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Cifrado {
    //Atributos
    private final static String abcT = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    protected final static ArrayList<String> abcInicial = new ArrayList<>(Arrays.asList(abcT.split("")));
    protected final static int moduloAbc = abcT.length();
    private final static int moduloMatriz = 255;
    
    //Métodos
    protected static int funcionSemilla1(int seed){
        return Math.abs((seed*502+37784) % moduloAbc);
    }
    protected static int funcionSemilla2(int seed){
        return Math.abs((seed*502+37784) % moduloMatriz);
    }
    

   
}
