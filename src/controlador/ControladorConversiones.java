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

}
