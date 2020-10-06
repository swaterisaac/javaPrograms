package model;
import java.util.ArrayList;
//import static model.Cifrado.*;


public class Diccionario {
    protected final int orden = 4;
    public int semilla;
    public int[][] matrizClave;
    public String[] abcClave = new String[Cifrado.moduloAbc];

 /*   public Diccionario(int semilla) {
        this.semilla = semilla;
    }*/
    
    public void generarAbc(){
        ArrayList<Integer> numRep = new ArrayList<>();
        int semillaRel = Cifrado.funcionSemilla1(this.semilla);
        
        for(int i = 0;i < Cifrado.moduloAbc;i++){
            //Caso de que se repita el numero
            if(numRep.contains(semillaRel)){
                semillaRel = 0;
                while(numRep.contains(semillaRel)){
                    semillaRel += 1;
                }
            }
            numRep.add(semillaRel);
            this.abcClave[i] = Cifrado.abcInicial.get(semillaRel);
            semillaRel = Cifrado.funcionSemilla1(semillaRel);
        }
    }
    public void generarMatriz(){
        this.matrizClave = new int[this.orden][this.orden];
        int semillaRel = Cifrado.funcionSemilla2(this.semilla);
        for(int i = 0;i < this.orden;i++){
            for(int j = 0;j < this.orden;j++){
                this.matrizClave[i][j] = semillaRel;
                semillaRel = Cifrado.funcionSemilla2(semillaRel);
            }
        }
    }
    public void imprimirMatriz(){
        for(int i = 0; i < this.orden;i++){
            for(int j = 0; j < this.orden;j++){
                System.out.print(this.matrizClave[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
        
    public void imprimirLista(){
        for(int i = 0; i < Cifrado.moduloAbc;i++){
            System.out.print(this.abcClave[i]);
        }
        System.out.println("");
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

}
