package principal;


import model.Mensaje;
import control.Control1;
import view.VistaGeneral;

public class main {

    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        VistaGeneral vis = new VistaGeneral();
        Control1 ctrl = new Control1(vis,msg);
        
        
        ctrl.initialize();

        vis.setVisible(true);
    }
    
}
