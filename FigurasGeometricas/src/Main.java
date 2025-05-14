import Modelos.Circulo;
import Modelos.Rectangulo;
import Modelos.Triangulo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList();
        lista.add(new Circulo(5));
        lista.add(new Rectangulo(2,4));
        lista.add(new Triangulo(6, 3));
        System.out.println("---Inicio programa---\n");
        for(Object o : lista){
            if(o instanceof Circulo c){
                System.out.println("\n Metodos Circulo: \n");
                c.calcularPerimetro();
                c.calcularArea();
                c.dibujar();
            }else if(o instanceof Rectangulo r){
                System.out.println("\n Metodos Rectangulo: \n");
                r.calcularPerimetro();
                r.calcularArea();
                r.dibujar();
            } else if (o instanceof Triangulo t ) {
                System.out.println("\n Metodos Triangulo: \n");
                t.dibujar();
                t.calcularArea();
                t.calcularPerimetro();
            }
        }

        System.out.println("\n---Finaliza programa---\n");
    }
}