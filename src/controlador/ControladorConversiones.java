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
        /*  if (e.getActionCommand().equals(modeloCon.getVistaCon().btnMetrosaCm.getActionCommand())) {
            verDialogoMetrosCM();

        }
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnCalcularCM.getActionCommand())) {
            calculoMetrosCM();
        }
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnPulgasaCm.getActionCommand())) {
            verDialogoPulgadaCM();

        }
        if (e.getActionCommand().equals(modeloCon.getVistaCon().btnCalcularPulgada.getActionCommand())) {
            calculoPulgadaCM();
        }*/
        if (e.getSource() == modeloCon.getVistaCon().btnMetrosaCm) {
            verDialogoMetrosCM();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularCM) {
            calculoMetrosCM();
        } else if (e.getSource() == modeloCon.getVistaCon().btnPulgasaCm1) {
            verDialogoPulgadaCM();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularPulgada) {
            calculoPulgadaCM();
        } else if (e.getSource() == modeloCon.getVistaCon().btnKmhAMph) {
            verDialogoKmhAMphaCM();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularKmh) {
            calculoKmhAMph();
        } else if (e.getSource() == modeloCon.getVistaCon().btnKgaLb) {
            verDialogoKilogramosALibras();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularKilogramo) {
            calculoKgALibras();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCelsiusaFahrenheit) {
            verDialogoCelsiusaFahrenheit();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularCelsius) {
            calculoCelsiusAFahrenheit();
        } else if (e.getSource() == modeloCon.getVistaCon().btnLitrosAGalones) {
            verDialogoLitrosAGalones();
        } else if (e.getSource() == modeloCon.getVistaCon().btnCalcularLitros) {
            calculoLitrosAGalones();
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

    public void verDialogoPulgadaCM() {
        modeloCon.getVistaCon().txtPulgada.setText("");
        modeloCon.getVistaCon().lblResultadoPulgadas.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoPulgadas;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoPulgadaCM() {
        double pulgada = Double.parseDouble(modeloCon.getVistaCon().txtPulgada.getText());
        double conversion = pulgada * 2.54;

        modeloCon.getVistaCon().lblResultadoPulgadas.setText(conversion + " CM");

    }

    public void verDialogoKmhAMphaCM() {
        modeloCon.getVistaCon().txtKilometro.setText("");
        modeloCon.getVistaCon().lblResultadoMps1.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoKmh;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoKmhAMph() {
        double kmh = Double.parseDouble(modeloCon.getVistaCon().txtKilometro.getText());
        double conversion = kmh * 0.621371;

        modeloCon.getVistaCon().lblResultadoMps1.setText(conversion + " CM");

    }

    public void verDialogoKilogramosALibras() {
        modeloCon.getVistaCon().txtKilogramo.setText("");
        modeloCon.getVistaCon().lblResultadoKilogramo.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoKilogramosALibras;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoKgALibras() {
        double kg = Double.parseDouble(modeloCon.getVistaCon().txtKilogramo.getText());
        double conversion = kg * 2.20462;
        modeloCon.getVistaCon().lblResultadoKilogramo.setText(String.format("%.2f lb", conversion));
    }

    public void verDialogoCelsiusaFahrenheit() {
        modeloCon.getVistaCon().txtCelsius.setText("");
        modeloCon.getVistaCon().lblResultadoCelsius.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoCelsiusaFahrenheit;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoCelsiusAFahrenheit() {
        double celsius = Double.parseDouble(modeloCon.getVistaCon().txtCelsius.getText());
        double conversion = (celsius * 1.8) + 32;
        modeloCon.getVistaCon().lblResultadoCelsius.setText(String.format("%.2f °F", conversion));
    }

    public void verDialogoLitrosAGalones() {
        modeloCon.getVistaCon().txtLitros.setText("");
        modeloCon.getVistaCon().lblResultadoLitros.setText("");
        JDialog dialogo = modeloCon.getVistaCon().dialogoLitrosAGalones;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void calculoLitrosAGalones() {
        double litros = Double.parseDouble(modeloCon.getVistaCon().txtLitros.getText());
        double conversion = litros / 3.78541;
        modeloCon.getVistaCon().lblResultadoLitros.setText(String.format("%.2f gal", conversion));
    }
}
