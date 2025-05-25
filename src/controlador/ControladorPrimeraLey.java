
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloPrimeraLey;
import vista.VistaMenuPrincipal;


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
        if (e.getActionCommand().equals(modeloPL.getVistaPL().btnAtras.getActionCommand())) {
            atras();
        }
    }
    
    
    public void calculoPrimeraLey(){
        double gravedad = 9.8;
        double masa = Double.parseDouble(modeloPL.getVistaPL().txtMasa.getText());      
        double peso = masa*gravedad;      
        double tension = peso;
        double sumatoria = tension - peso;
        
        String pesoF = String.format("%.2f", peso);
        String tensionF = String.format("%.2f", tension);
        
        modeloPL.getVistaPL().lblPeso.setText("Peso del Objeto (W): "+ pesoF + " N");
        modeloPL.getVistaPL().lblTension.setText("Tension de la cuerda (T): " + tensionF + " N");
        //modeloPL.getVistaPL().lblSumatoria.setText("Sumatoria de las Fuerzas: " + sumatoria + " N");
        modeloPL.getVistaPL().lblSumatoria.setText("Objeto en reposo");
    }
    
    public void atras(){
        VistaMenuPrincipal vistaMP = new VistaMenuPrincipal();
        vistaMP.setVisible(true);
        modeloPL.getVistaPL().dispose();
    }
    
}
