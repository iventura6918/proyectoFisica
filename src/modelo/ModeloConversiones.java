package modelo;

import vista.VIstaConversiones;

public class ModeloConversiones {

    VIstaConversiones vistaCon;
    double metros;
    double centimetros;
    double pulgadas;
    double kmh;
    double kg;
    double celsius;
    double litros;

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

    public double getKmh() {
        return kmh;
    }

    public void setKmh(double kmh) {
        this.kmh = kmh;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

}
