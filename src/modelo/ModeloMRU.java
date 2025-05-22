
package modelo;

import vista.VIstaMRU;


public class ModeloMRU {
    
    VIstaMRU vistaMRU;
    double distancia;

    public ModeloMRU() {
    }

    public ModeloMRU(VIstaMRU vistaMRU) {
        this.vistaMRU = vistaMRU;
    }

    public VIstaMRU getVistaMRU() {
        return vistaMRU;
    }

    public void setVistaMRU(VIstaMRU vistaMRU) {
        this.vistaMRU = vistaMRU;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
    
    
    
}
