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
            modelohipo.getVistaHipo().txtLadoB.setEnabled(true);
            modelohipo.getVistaHipo().txtLadoH.setEnabled(false);
        }
        if (e.getSource() == modelohipo.getVistaHipo().rbOpcion2) {
            modelohipo.getVistaHipo().txtLadoB.setEnabled(false);
            modelohipo.getVistaHipo().txtLadoH.setEnabled(true);

        }
        if (e.getActionCommand().equals(modelohipo.getVistaHipo().btnCalcular.getActionCommand())) {
            if (modelohipo.getVistaHipo().rbOpcion1.isSelected()) {
                double ladoA = Double.parseDouble(modelohipo.getVistaHipo().txtLadoA.getText());
                double ladoB = Double.parseDouble(modelohipo.getVistaHipo().txtLadoB.getText());
                double result = calculoDosLados(ladoA, ladoB);
                String resultRedondeado = String.format("%.2f", result);

                modelohipo.getVistaHipo().lblResultado.setText(resultRedondeado);
            }

        }
    }

    public void atras() {
        VistaMenuPrincipal vistam = new VistaMenuPrincipal();
        vistam.setVisible(true);
        modelohipo.getVistaHipo().dispose();
    }

    public double calculoDosLados(double a, double b) {
        double h;
        h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return h;
    }

}
