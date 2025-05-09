
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloPrimeraLey;


public class ControladorPrimeraLey implements ActionListener{
    
    ModeloPrimeraLey modeloPL;

    public ControladorPrimeraLey(ModeloPrimeraLey modeloPL) {
        this.modeloPL = modeloPL;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloPL.getVistaPL().btnCalcularPrimeraLey.getActionCommand())) {
            calculoPrimeraLey();
        }
    }
    
    
    public void calculoPrimeraLey(){
        double gravedad = 9.8;
        double masa = Double.parseDouble(modeloPL.getVistaPL().txtMasa.getText());      
        double peso = masa*gravedad;      
        double tension = peso;
        
        double sumatoria = tension - peso;
        
        modeloPL.getVistaPL().lblPeso.setText("Peso del Objeto (W): "+ peso + " N");
        modeloPL.getVistaPL().lblTension.setText("Tension de la cuerda (T): " + tension + " N");
        modeloPL.getVistaPL().lblSumatoria.setText("Sumatoria de las Fuerzas: " + sumatoria + " N");
    }
    
}
