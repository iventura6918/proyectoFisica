
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloMenuPrincipal;
import vista.VIstaConversiones;
import vista.VIstaMRU;
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
        if (e.getActionCommand().equals(modelomp.getVistamp().bntConversiones.getActionCommand())) {
            callVistaConversiones();
        }
        if (e.getActionCommand().equals(modelomp.getVistamp().btnMRU.getActionCommand())) {
            callVistaMRU();
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
    public void callVistaConversiones(){
        VIstaConversiones vistaCon = new VIstaConversiones();
        vistaCon.setVisible(true);
        modelomp.getVistamp().dispose();
    }
    public void callVistaMRU(){
        VIstaMRU vistaMRU = new VIstaMRU();
        vistaMRU.setVisible(true);
        modelomp.getVistamp().dispose();
    }
    
}
