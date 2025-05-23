
package modelo;

import vista.VistaTerceraLey;


public class ModeloTerceraLey {
    
    VistaTerceraLey vistaTL;

    public ModeloTerceraLey() {
    }

    public ModeloTerceraLey(VistaTerceraLey vistaTL) {
        this.vistaTL = vistaTL;
    }

    public VistaTerceraLey getVistaTL() {
        return vistaTL;
    }

    public void setVistaTL(VistaTerceraLey vistaTL) {
        this.vistaTL = vistaTL;
    }
    
}
