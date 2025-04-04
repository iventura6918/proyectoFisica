
package modelo;

import vista.VistaCalculoHipotenusa;


public class ModeloCalculoHipotenusa {
    
    VistaCalculoHipotenusa vistaHipo;
    private String ladoA;
    private String ladoB;
    private String ladoH;
    private boolean opcion1;
    private boolean opcion2;
    private String resultado;

    public ModeloCalculoHipotenusa() {
    }

    public ModeloCalculoHipotenusa(VistaCalculoHipotenusa vistaHipo) {
        this.vistaHipo = vistaHipo;
    }

    public String getLadoA() {
        return ladoA;
    }

    public void setLadoA(String ladoA) {
        this.ladoA = ladoA;
    }

    public void setVistaHipo(VistaCalculoHipotenusa vistaHipo) {
        this.vistaHipo = vistaHipo;
    }

    public String getLadoB() {
        return ladoB;
    }

    public void setLadoB(String ladoB) {
        this.ladoB = ladoB;
    }

    public VistaCalculoHipotenusa getVistaHipo() {
        return vistaHipo;
    }

    public boolean isOpcion1() {
        return opcion1;
    }

    public void setOpcion1(boolean opcion1) {
        this.opcion1 = opcion1;
        vistaHipo.rbOpcion1.setSelected(opcion1);
    }

    public boolean isOpcion2() {
        return opcion2;
    }

    public void setOpcion2(boolean opcion2) {
        this.opcion2 = opcion2;
        vistaHipo.rbOpcion2.setSelected(opcion2);
    }

    public String getLadoH() {
        return ladoH;
    }

    public void setLadoH(String ladoH) {
        this.ladoH = ladoH;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
}
