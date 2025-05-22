
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloSegundaLey;
import vista.VistaMenuPrincipal;


public class ControladorSegundaLey implements ActionListener{
    ModeloSegundaLey modeloSL;

    public ControladorSegundaLey(ModeloSegundaLey modeloSL) {
        this.modeloSL = modeloSL;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloSL.getVistaSL().btnCalcular.getActionCommand())) {
            calculoAceleracion();
        }
        if (e.getActionCommand().equals(modeloSL.getVistaSL().btnAtras.getActionCommand())) {
            atras();
        }
    }
    
    public void calculoAceleracion(){
        double fuerza = Double.parseDouble(modeloSL.getVistaSL().txtFuerza.getText());
        double masa = Double.parseDouble(modeloSL.getVistaSL().txtMasa.getText());  
        double aceleracion = fuerza/masa;
        String aceleracionF = String.format("%.2f", aceleracion);
        modeloSL.getVistaSL().lblResultado.setText(aceleracionF + " m/s**2");
        
    }
    public void atras(){
        VistaMenuPrincipal vistamp = new VistaMenuPrincipal();
        vistamp.setVisible(true);
        modeloSL.getVistaSL().dispose();
    }
    
}
