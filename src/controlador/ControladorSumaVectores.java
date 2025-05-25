package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloSumaVectores;
import vista.VistaMenuPrincipal;

public class ControladorSumaVectores implements ActionListener {

    ModeloSumaVectores modeloSum;

    public ControladorSumaVectores(ModeloSumaVectores modeloSum) {
        this.modeloSum = modeloSum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modeloSum.getVistaSumaV().btnSuma.getActionCommand())) {
            sumaVectores();
        }
        if (e.getActionCommand().equals(modeloSum.getVistaSumaV().bntAtras.getActionCommand())) {
            salir();
        }

    }

    /*public void sumaVectores(){
        int x1 = Integer.parseInt(modeloSum.getVistaSumaV().txtX1.getText());
        int y1 = Integer.parseInt(modeloSum.getVistaSumaV().txtY1.getText());
        int x2 = Integer.parseInt(modeloSum.getVistaSumaV().txtX2.getText());
        int y2 = Integer.parseInt(modeloSum.getVistaSumaV().txtY2.getText());
       
        int sAbcisa = x1 + x2;
        int sOrdenada = y1 + y2;
        
        modeloSum.getVistaSumaV().lblResultadoSuma.setText("( "+sAbcisa+" , "+sOrdenada+" )");  
        
    }*/
    public void salir() {
        VistaMenuPrincipal vistaM = new VistaMenuPrincipal();
        vistaM.setVisible(true);
        modeloSum.getVistaSumaV().dispose();
    }

    public void sumaVectores() {
        int x1 = Integer.parseInt(modeloSum.getVistaSumaV().txtX1.getText());
        int y1 = Integer.parseInt(modeloSum.getVistaSumaV().txtY1.getText());
        int x2 = Integer.parseInt(modeloSum.getVistaSumaV().txtX2.getText());
        int y2 = Integer.parseInt(modeloSum.getVistaSumaV().txtY2.getText());
        //int angulo = Integer.parseInt(modeloSum.getVistaSumaV().txtAngulo.getText());

        int sAbcisa = x1 + x2;
        int sOrdenada = y1 + y2;

        double magnitud = Math.sqrt(Math.pow(sAbcisa, 2) + Math.pow(sOrdenada, 2));
        double anguloResultanteRad = Math.atan2(sOrdenada, sAbcisa); 
        double anguloResultanteDeg = Math.toDegrees(anguloResultanteRad); 
        
        //modeloSum.getVistaSumaV().lblResultadoSuma.setText("( "+sAbcisa+" , "+sOrdenada+" ) Angulo: " + anguloResultanteDeg);
        
        String magnitudF = String.format("%.2f", magnitud);
        String anguloResultanteDegF = String.format("%.2f", anguloResultanteDeg);
        modeloSum.getVistaSumaV().lblResultadoSuma.setText("Magnitud:" + magnitudF+  " Angulo:" + anguloResultanteDegF);

    }

}
