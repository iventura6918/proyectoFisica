
package modelo;

import vista.VistaSumaVectores;


public class ModeloSumaVectores {
    VistaSumaVectores vistaSumaV;
    private String x1;
    private String y1;
    private String x2;
    private String y2;
    private String resultadoSuma;

    public ModeloSumaVectores() {
    }

    public ModeloSumaVectores(VistaSumaVectores vistaSumaV) {
        this.vistaSumaV = vistaSumaV;
    }

    public VistaSumaVectores getVistaSumaV() {
        return vistaSumaV;
    }

    public void setVistaSumaV(VistaSumaVectores vistaSumaV) {
        this.vistaSumaV = vistaSumaV;
    }

    public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1;
    }

    public String getY1() {
        return y1;
    }

    public void setY1(String y1) {
        this.y1 = y1;
    }

    public String getX2() {
        return x2;
    }

    public void setX2(String x2) {
        this.x2 = x2;
    }

    public String getY2() {
        return y2;
    }

    public void setY2(String y2) {
        this.y2 = y2;
    }

    public String getResultadoSuma() {
        return resultadoSuma;
    }

    public void setResultadoSuma(String resultadoSuma) {
        this.resultadoSuma = resultadoSuma;
    }
    
    
}
