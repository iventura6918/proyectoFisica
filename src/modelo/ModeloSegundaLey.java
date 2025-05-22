
package modelo;

import vista.VIstaSegundaLey;


public class ModeloSegundaLey {
    
    VIstaSegundaLey vistaSL;

    public ModeloSegundaLey() {
    }

    public ModeloSegundaLey(VIstaSegundaLey vistaSL) {
        this.vistaSL = vistaSL;
    }

    public VIstaSegundaLey getVistaSL() {
        return vistaSL;
    }

    public void setVistaSL(VIstaSegundaLey vistaSL) {
        this.vistaSL = vistaSL;
    }

}
