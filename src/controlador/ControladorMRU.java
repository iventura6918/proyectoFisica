package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import modelo.ModeloMRU;
import vista.VistaMenuPrincipal;

public class ControladorMRU implements ActionListener {

    ModeloMRU modeloMRU;

    public ControladorMRU(ModeloMRU ModeloMRU) {
        this.modeloMRU = ModeloMRU;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloMRU.getVistaMRU().btnMruTiempo.getActionCommand())) {
            verDialogoTiempo();
        }
        if (e.getActionCommand().equals(modeloMRU.getVistaMRU().btnMruDistancia.getActionCommand())) {
            verDialogoDistancia();
        }
        if (e.getActionCommand().equals(modeloMRU.getVistaMRU().btnMruVelocidad.getActionCommand())) {
            verDialogoVelocidad();
        }
        if (e.getActionCommand().equals(modeloMRU.getVistaMRU().btnAtrasMRU.getActionCommand())) {
            atras();
        }
        if (e.getSource() == modeloMRU.getVistaMRU().btnCalcularTiempo) {
            calculoTiempo();
        }
        if (e.getSource() == modeloMRU.getVistaMRU().btnCalcularDistancia) {
            calculoDistancia();
        }
        if (e.getSource() == modeloMRU.getVistaMRU().btnCalcularVelocidad) {
            calculoVelocidad();
        }
    }

    public void calculoTiempo() {
        double distancia = Double.parseDouble(modeloMRU.getVistaMRU().txtDistaciaT.getText());
        double velocidad = Double.parseDouble(modeloMRU.getVistaMRU().txtVelocidadT.getText());
        double tiempo = distancia / velocidad;
        String tiempoF = String.format("%.2f", tiempo);
        modeloMRU.getVistaMRU().lblResultadoTiempo.setText(tiempoF + " Segundos");
    }

    public void calculoDistancia() {
        double velocidad = Double.parseDouble(modeloMRU.getVistaMRU().txtVelocidadD.getText());
        double tiempo = Double.parseDouble(modeloMRU.getVistaMRU().txtTiempoD.getText());
        double distancia = velocidad * tiempo;
        String distanciaF  = String.format("%.2f", distancia);
        modeloMRU.getVistaMRU().lblResultadoDIstancia.setText(distanciaF + " Metros");
    }

    public void calculoVelocidad() {
        double distancia = Double.parseDouble(modeloMRU.getVistaMRU().txtDistanciaV.getText());
        double tiempo = Double.parseDouble(modeloMRU.getVistaMRU().txtTiempoV.getText());
        double velocidad = distancia / tiempo;
        String velocidadF = String.format("%.2f", velocidad);
        modeloMRU.getVistaMRU().lblResultadoVelocidad.setText(velocidadF + " Metros/Segundo");
    }

    public void verDialogoTiempo() {
        modeloMRU.getVistaMRU().txtDistaciaT.setText("");
        modeloMRU.getVistaMRU().txtVelocidadT.setText("");
        modeloMRU.getVistaMRU().lblResultadoTiempo.setText("");
        JDialog dlg = modeloMRU.getVistaMRU().dlgTiempo;
        dlg.pack();
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
    }

    public void verDialogoDistancia() {
        modeloMRU.getVistaMRU().txtTiempoD.setText("");
        modeloMRU.getVistaMRU().txtVelocidadD.setText("");
        modeloMRU.getVistaMRU().lblResultadoDIstancia.setText("");
        JDialog dlg = modeloMRU.getVistaMRU().dlgDistancia;
        dlg.pack();
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
    }

    public void verDialogoVelocidad() {
        modeloMRU.getVistaMRU().txtDistanciaV.setText("");
        modeloMRU.getVistaMRU().txtTiempoV.setText("");
        modeloMRU.getVistaMRU().lblResultadoVelocidad.setText("");
        JDialog dlg = modeloMRU.getVistaMRU().dlgVelocidad;
        dlg.pack();
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
    }

    public void atras() {
        VistaMenuPrincipal vistam = new VistaMenuPrincipal();
        vistam.setVisible(true);
        modeloMRU.getVistaMRU().dispose();
    }

}
