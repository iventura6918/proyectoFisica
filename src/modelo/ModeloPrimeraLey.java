
package modelo;

import vista.VistaPrimeraLey;


public class ModeloPrimeraLey {
    
    VistaPrimeraLey vistaPL;
    double masa;

    public ModeloPrimeraLey() {
    }

    public ModeloPrimeraLey(VistaPrimeraLey vistaPL) {
        this.vistaPL = vistaPL;
    }

    public VistaPrimeraLey getVistaPL() {
        return vistaPL;
    }

    public void setVistaPL(VistaPrimeraLey vistaPL) {
        this.vistaPL = vistaPL;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
    
    
}
