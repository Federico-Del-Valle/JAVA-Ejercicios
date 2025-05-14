package Modelos;
import Modelos.Figura;

public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del Circulo es: "+ this.radio * this.radio * Math.PI);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: " + 2* Math.PI * this.radio);
    }
@Override
    public void dibujar() {
        System.out.println("Circulo dibujar");
}

}
