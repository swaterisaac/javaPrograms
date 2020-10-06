
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VistaGeneral;
import model.Mensaje;

public class Control1 implements ActionListener{
    private VistaGeneral vista1;
    private Mensaje mensaje1;

    public Control1(VistaGeneral vista1, Mensaje mensaje1) {
        this.vista1 = vista1;
        this.mensaje1 = mensaje1;
        this.vista1.cifrarBtn.addActionListener(this);
        this.vista1.exitBtn.addActionListener(this);
    }
    public void initialize(){
        vista1.setTitle("PW Cifrador");
        vista1.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        Object component = e.getSource();

        if(component == vista1.cifrarBtn){
            mensaje1.setSemilla(Integer.parseInt(vista1.introducirSemilla.getText()));
            mensaje1.setMensajeClaro(vista1.introducirMensaje.getText());
            mensaje1.generarDatos();
            vista1.mensajeCifrado.setText(mensaje1.getMensajeCifrado());
        }
        if(component == vista1.exitBtn){
            System.exit(0);
        }
    }
}
