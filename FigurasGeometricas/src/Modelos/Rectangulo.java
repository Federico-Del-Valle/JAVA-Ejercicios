package Modelos;
import Modelos.Figura;
public class Rectangulo extends Figura implements Dibujable {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        System.out.println("Area de Rectangulo: " + this.base*this.altura);
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro de Rectangulo: " + (this.base*2 + this.altura*2));
    }

    @Override
    public void dibujar(){
        System.out.println("--------------");
    }
}
