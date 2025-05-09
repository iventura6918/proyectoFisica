
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
 
 public void calculoDistancia(){
     double velocidad = Double.parseDouble(modeloMRU.getVistaMRU().txtVelocidadD.getText());
     double tiempo = Double.parseDouble(modeloMRU.getVistaMRU().txtTiempoD.getText());
     double distancia = velocidad*tiempo;
     modeloMRU.getVistaMRU().lblResultadoDIstancia.setText(distancia + " Metros");
 }
 
 public void calculoVelocidad(){
     double distancia = Double.parseDouble(modeloMRU.getVistaMRU().txtDistanciaV.getText());
     double tiempo = Double.parseDouble(modeloMRU.getVistaMRU().txtTiempoV.getText());
     double velocidad = distancia/tiempo;
     modeloMRU.getVistaMRU().lblResultadoVelocidad.setText(velocidad + "Metros/Segundos");
 }
    
   
    
}
