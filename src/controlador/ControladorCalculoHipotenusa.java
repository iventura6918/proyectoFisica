package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloCalculoHipotenusa;
import vista.VistaMenuPrincipal;

public class ControladorCalculoHipotenusa implements ActionListener {

    ModeloCalculoHipotenusa modelohipo;

    public ControladorCalculoHipotenusa(ModeloCalculoHipotenusa modelohipo) {
        this.modelohipo = modelohipo;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelohipo.getVistaHipo().btnAtras.getActionCommand())) {
            atras();
        }
        if (e.getSource() == modelohipo.getVistaHipo().rbOpcion1) {
            modelohipo.getVistaHipo().txtLadoH.setEnabled(false);
            
        }

        if (e.getSource() == modelohipo.getVistaHipo().rbOpcion2) {
            
        }
    }
    
    public void atras(){
        VistaMenuPrincipal vistam = new VistaMenuPrincipal();
        vistam.setVisible(true);
        modelohipo.getVistaHipo().dispose();
    }

}
