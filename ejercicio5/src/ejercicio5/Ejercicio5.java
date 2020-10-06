package ejercicio5;

import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        int horas;
        final int sueldoMin = 16;
        final int sueldoExtra = 20;
        final int horasMin = 40;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"
                + " de horas trabajadas"));
        if(horas < horasMin){
            JOptionPane.showMessageDialog(null, "Su sueldo es de $" + (horas * sueldoMin));
        }
        else{
            JOptionPane.showMessageDialog(null,"Su sueldo es de $" + 
                    (horasMin * 16 + (horas - horasMin) * sueldoExtra));
        }
        
        
    }
    
}
