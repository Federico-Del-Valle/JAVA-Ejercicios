
import Modelos.Animal;
import Modelos.Gato;
import Modelos.Perro;

public class Main {
    public static void main(String[] args) {
        Gato catalina = new Gato("Catalina", 10, "Marron");
        Perro maga = new Perro("Maga",7, "Callejera");
        System.out.println("La raza de " + maga.getNombre() + " es "
        +maga.getRaza() );
        maga.ladrar();
        System.out.printf("La edad de %s es %d\n ", catalina.getNombre(), catalina.getEdad());
        System.out.println(catalina.getNombre() + " tiene ganas de comer por eso ahora " + catalina.comer());


    }
}