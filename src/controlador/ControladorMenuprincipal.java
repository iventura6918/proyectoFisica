
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloMenuPrincipal;
import vista.VIstaConversiones;
import vista.VIstaMRU;
import vista.VIstaSegundaLey;
import vista.VistaCalculoHipotenusa;
import vista.VistaPrimeraLey;
import vista.VistaSegundaLey1;
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
        if (e.getActionCommand().equals(modelomp.getVistamp().btnPrimeraLey.getActionCommand())) {
            callVistaPL();
        }
        /*if (e.getActionCommand().equals(modelomp.getVistamp().btnSegundaLey.getActionCommand())) {
            callVistaSL();
        }*/
        if (e.getActionCommand().equals(modelomp.getVistamp().btnSegundaLey.getActionCommand())) {
            callVistaSLD ();
        }
        if (e.getActionCommand().equals(modelomp.getVistamp().btnCerrarPrograma.getActionCommand())) {
            cerrarPrograma();
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
    public void callVistaPL(){
        VistaPrimeraLey vistaPL = new VistaPrimeraLey();
        vistaPL.setVisible(true);
        modelomp.getVistamp().dispose();
    }
   /* public void callVistaSL(){
        VIstaSegundaLey vistaSL = new VIstaSegundaLey();
        vistaSL.setVisible(true);
        modelomp.getVistamp().dispose();
    }*/
    public void callVistaSLD(){
        VistaSegundaLey1 vistaSL1 = new VistaSegundaLey1();
        vistaSL1.setVisible(true);
        modelomp.getVistamp().dispose();
    }
    public void cerrarPrograma(){
        modelomp.getVistamp().dispose();
        JOptionPane.showMessageDialog(null, "Gracias por utilizar este programa campeón!", "Atencion", 2);
        System.exit(0);
    }
}
