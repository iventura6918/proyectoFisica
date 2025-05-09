
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloMRU;


public class ControladorMRU implements ActionListener {
    ModeloMRU modeloMRU;

    public ControladorMRU(ModeloMRU ModeloMRU) {
        this.modeloMRU = ModeloMRU;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
 public void calculoTiempo(){
     double distancia = Double.parseDouble(modeloMRU.getVistaMRU().txtDistaciaT.getText());
     double velocidad = Double.parseDouble(modeloMRU.getVistaMRU().txtVelocidadT.getText());
     double tiempo = distancia/velocidad;
     modeloMRU.getVistaMRU().lblResultadoTiempo.setText(tiempo + " Segundos");
 }
    
   
    
}
