package Modelos;
import Modelos.Figura;
public class Triangulo extends Figura implements Dibujable {
    private int base;
    private int altura;


    @Override
    public void calcularArea(){
        System.out.println("Area de Triangulo: " + (double)(this.base*this.altura)/ 2.00 );
    }

    @Override
    public void calcularPerimetro(){
        System.out.println("Perimetro de Triangulo: " + base*3);
    }
    @Override
    public void dibujar(){
        System.out.println("   /\\\n" +
                "  /  \\\n" +
                " /____\\  (base=" + base + ", altura=" + altura + ")");
    }

    public Triangulo(int base, int altura){
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
}
