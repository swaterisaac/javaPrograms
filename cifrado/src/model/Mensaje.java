package model;
import java.lang.Math;

public class Mensaje extends Diccionario{
    //Atributos
    private String mensajeClaro;
    private String mensajeCifrado = "";
    
 /*   //CONSTRUCTOR
    public Mensaje(String mensajeClaro, int semilla) {
        super(semilla);
        this.mensajeClaro = mensajeClaro;
    }
*/
    
    //Getters
    public String getMensajeClaro() {
        return mensajeClaro;
    }

    public String getMensajeCifrado() {
        return mensajeCifrado;
    }
    
    
    //Setters y generar datos
    public void setMensajeClaro(String mensajeClaro) {
        this.mensajeClaro = mensajeClaro;
    }
    public void generarDatos(){
        this.mensajeCifrado = "";
        this.generarAbc();
        this.generarMatriz();
        this.cifrarMensaje();
    }
    
    
    //Métodos
    private int calcularNumxFila(int[] listaRel, int fila){
        int numRel = 0;
        for(int i = 0; i < this.orden;i++){
           numRel += listaRel[i] * this.matrizClave[fila][i];
        }
        return Math.abs(numRel % Cifrado.moduloAbc);
    }
    public int conseguirNum(char caracterRel){
        for(int i = 0; i < this.abcClave.length;i++){
            if(this.abcClave[i].charAt(0) == caracterRel){
                return i;
            }
        }
        return this.abcClave.length - 1;
    }
    public void cifrarMensaje(){
        String strCompleto = this.mensajeClaro;
        int largoFaltante = this.mensajeClaro.length() % this.orden;
        int numRel = 0;
        int[] listaRel = new int[this.orden];
        
        if(largoFaltante != 0){
            for(int i = 0; i < this.orden - largoFaltante;i++){
                strCompleto += "R";
            }
        } 
        
        for(int i = 0; i < strCompleto.length();i += this.orden){
            for(int j = 0; j < this.orden;j++){
                listaRel[j] = conseguirNum(strCompleto.charAt(i+j));
            }
            for(int j = 0; j < this.orden;j++){
                numRel = calcularNumxFila(listaRel,j);
                this.mensajeCifrado += this.abcClave[numRel];
            }
        }
    }
    
    public void imprimirMensajeCif(){
        System.out.println(this.mensajeCifrado);
    }


}
