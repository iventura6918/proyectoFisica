
package modelo;

import vista.VIstaConversiones;

public class ModeloConversiones {
    
    VIstaConversiones vistaCon;
    double metros;
    double centimetros;
    double pulgadas;

    public ModeloConversiones() {
    }

    public ModeloConversiones(VIstaConversiones vistaCon) {
        this.vistaCon = vistaCon;
    }

    public VIstaConversiones getVistaCon() {
        return vistaCon;
    }

    public void setVistaCon(VIstaConversiones vistaCon) {
        this.vistaCon = vistaCon;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(double centimetros) {
        this.centimetros = centimetros;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    
    
}
