/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import modelo.ModeloSegundaLeyDos;
import vista.VistaMenuPrincipal;

public class ControladorSegundaLeyDos implements ActionListener {

    ModeloSegundaLeyDos modelosSLD;

    public ControladorSegundaLeyDos(ModeloSegundaLeyDos modelosSLD) {
        this.modelosSLD = modelosSLD;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == modelosSLD.getVistaSLD().btnFuerza) {
            verDialogoFuerza();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnAceleracion) {
            verDialogoAceleracion();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnMasa) {
            verDialogoMasa();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnSalir) {
            atras();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnCFCalcular1){
            calculoFuerza();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnCACalcular) {
            calculoAceleracion();
        }
        if (e.getSource() == modelosSLD.getVistaSLD().btnCMCalcular1) {
            calculoMasa();
        }

    }

    //ventanas
    public void verDialogoAceleracion() {
        JDialog dialogo = modelosSLD.getVistaSLD().dialogoAceleracion;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void verDialogoFuerza() {
        JDialog dialogo = modelosSLD.getVistaSLD().dialogoFuerza;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void verDialogoMasa() {
        JDialog dialogo = modelosSLD.getVistaSLD().dialogoMasa;
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }

    public void atras() {
        VistaMenuPrincipal vistaMP = new VistaMenuPrincipal();
        vistaMP.setVisible(true);
        modelosSLD.getVistaSLD().dispose();
    }

    public void calculoFuerza() {
        try {
            double masa = Double.parseDouble(modelosSLD.getVistaSLD().txtCFMasa.getText());
            double aceleracion = Double.parseDouble(modelosSLD.getVistaSLD().txtCFAceleracion.getText());
            double fuerza = masa * aceleracion;
            modelosSLD.getVistaSLD().lblCFResultado.setText(String.format("%.2f N", fuerza));
        } catch (NumberFormatException e) {
            modelosSLD.getVistaSLD().lblCFResultado.setText("Error en datos");
        }
    }

    public void calculoAceleracion() {
        try {
            double fuerza = Double.parseDouble(modelosSLD.getVistaSLD().txtCAFuerza.getText());
            double masa = Double.parseDouble(modelosSLD.getVistaSLD().txtCAMasa.getText());
            double aceleracion = fuerza / masa;
            modelosSLD.getVistaSLD().lblCAResultado.setText(String.format("%.2f m/s²", aceleracion));
        } catch (NumberFormatException e) {
            modelosSLD.getVistaSLD().lblCAResultado.setText("Error en datos");
        }
    }

    public void calculoMasa() {
        try {
            double fuerza = Double.parseDouble(modelosSLD.getVistaSLD().txtCMfuerza1.getText());
            double aceleracion = Double.parseDouble(modelosSLD.getVistaSLD().txtCMAceleracion.getText());
            double masa = fuerza / aceleracion;
            modelosSLD.getVistaSLD().lblCMresultado1.setText(String.format("%.2f kg", masa));
        } catch (NumberFormatException e) {
            modelosSLD.getVistaSLD().lblCMresultado1.setText("Error en datos");
        }
    }
}
