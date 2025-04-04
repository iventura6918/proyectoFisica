
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloMenuPrincipal;
import vista.VistaCalculoHipotenusa;
import vista.VistaSumaVectores;


public class ControladorMenuprincipal implements ActionListener{
    ModeloMenuPrincipal modelomp;
    

    public ControladorMenuprincipal(ModeloMenuPrincipal modelomp) {
        this.modelomp = modelomp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals(modelomp.getVistamp().btnSumVectores.getActionCommand())) {
            callVistaSumaVector();
        }
        if (e.getActionCommand().equals(modelomp.getVistamp().btnHipotenusa.getActionCommand())) {
            callVistaHipotenusa();
            
        }
    }
    
    public void callVistaSumaVector(){
        VistaSumaVectores vistaSuma = new VistaSumaVectores();
        vistaSuma.setVisible(true);
        modelomp.getVistamp().dispose();
    }
    public void callVistaHipotenusa(){
        VistaCalculoHipotenusa vistaHipo = new VistaCalculoHipotenusa();
        vistaHipo.setVisible(true);
        modelomp.getVistamp().dispose();
    }
    
}
