package pck1;


public class Cuadrilatero {
    private int lado1;
    private int lado2;
    
    //Constructores
    public Cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(int lado1) {
        this.lado1 = lado1;
        lado2 = lado1;
    }
    
    //Métodos
    public int calcularArea(){
        return (lado1*lado2);
    }
    public int calcularPerimetro(){
        return (2*lado1 + 2*lado2);
    }
    public void imprimirDatos(){
        System.out.println("Su perimetro es: " + this.calcularPerimetro());
        System.out.println("Su area es: " + this.calcularArea());
    }
    
}
