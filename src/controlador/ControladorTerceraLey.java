package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloTerceraLey;
import vista.VistaMenuPrincipal;

/**
 *
 * @author danie
 */
public class ControladorTerceraLey implements ActionListener {

    ModeloTerceraLey modeloTL;

    public ControladorTerceraLey(ModeloTerceraLey modeloTL) {
        this.modeloTL = modeloTL;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloTL.getVistaTL().btnCalcularAccionYReaccion.getActionCommand())) {
            calculoAccionYReaccion();
        }
        if (e.getActionCommand().equals(modeloTL.getVistaTL().btnSalir.getActionCommand())) {
            atras();
        }
    }

    public void calculoAccionYReaccion() {
        // Obtener la fuerza ingresada
        double fuerza = Double.parseDouble(modeloTL.getVistaTL().txtNewtons.getText());

        // Obtener la dirección ingresada
        String direccion = modeloTL.getVistaTL().txtDirección.getSelectedItem().toString();
        // Obtener objeto A
        String objetoA = modeloTL.getVistaTL().txtObjetoA.getText();
        // Obtener objeto B
        String objetoB = modeloTL.getVistaTL().txtObjetoB.getText();
        // Calcular la dirección opuesta
        String direccionOpuesta = "";
        switch (direccion.toLowerCase()) {
            case "derecha":
                direccionOpuesta = "izquierda";
                break;
            case "izquierda":
                direccionOpuesta = "derecha";
                break;
            case "arriba":
                direccionOpuesta = "abajo";
                break;
            case "abajo":
                direccionOpuesta = "arriba";
                break;
            default:
                direccionOpuesta = "opuesta";
                break;
        }

        // Mostrar el resultado
      //  String resultado = "Fuerza de reacción: " + fuerza + " N hacia " + direccionOpuesta;
        String resultado = objetoB + " ejerce una fuerza de " + fuerza + " N hacia la " + direccionOpuesta + " sobre " + objetoA;
        modeloTL.getVistaTL().lblResultadoAccionYReaccion.setText(resultado);
    }

    public void atras() {
        VistaMenuPrincipal vistamp = new VistaMenuPrincipal();
        vistamp.setVisible(true);
        modeloTL.getVistaTL().dispose();
    }

}
