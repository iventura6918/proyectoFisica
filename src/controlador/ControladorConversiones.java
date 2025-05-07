package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import modelo.ModeloConversiones;

public class ControladorConversiones implements ActionListener {

    ModeloConversiones modeloCon;

    public ControladorConversiones(ModeloConversiones modeloCon) {
        this.modeloCon = modeloCon;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnMetrosaCm.getActionCommand())) {
            verDialogoMetrosCM();

        }
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnCalcularCM.getActionCommand())) {
            calculoMetrosCM();
        }
          if (e.getActionCommand().equals(modeloCon.getVistaCon().btnPulgadaCm.getActionCommand())) {
            verDialogoPulgadaCM();

        }
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnpulgadaDos.getActionCommand())) {
            calculoPulgadaCm();
        }
        
    }

    public void verDialogoMetrosCM() {
        modeloCon.getVistaCon().txtMetros.setText("");
        modeloCon.getVistaCon().lblResultadoCentimetros.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoMetros;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoMetrosCM() {
        double metros = Double.parseDouble(modeloCon.getVistaCon().txtMetros.getText());
        double conversion = metros * 100;

        modeloCon.getVistaCon().lblResultadoCentimetros.setText(conversion + " CM");

    }
    
    public void calculoPulgadaCm(){
    double pulgada = Double.parseDouble(modeloCon.getVistaCon().txtPulgada.getText());
     double conversionDos =  pulgada * 2.54;
     
     modeloCon.getVistaCon().lblResultadoPulgadas.setText(conversionDos + " CM");
    }
     public void verDialogoPulgadaCM() {
        modeloCon.getVistaCon().txtPulgada.setText("");
        modeloCon.getVistaCon().lblResultadoPulgadas.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoPulgadaCm;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }


}
