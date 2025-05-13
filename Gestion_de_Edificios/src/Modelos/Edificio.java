package Modelos;

public class Edificio {
    protected int ancho;
    protected int alto;
    protected int largo;

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    public Edificio(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    public Edificio(){

    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int calcularSuperficie(int ancho, int alto){
        return ancho * alto;
    }
    public int calcularVolumen(int ancho, int alto, int largo){
        return ancho * alto * largo;
    }

}
