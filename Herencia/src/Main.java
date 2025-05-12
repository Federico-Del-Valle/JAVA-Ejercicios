
import Modelos.Animal;
import Modelos.Gato;
import Modelos.Perro;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Gato("catalina",10, "marron"));
        animals.add(new Perro("Kira", 9, "Labrador"));
        animals.add(new Gato("Mufasa",10, "marron"));
        animals.add(new Gato("lisa",6, "marron"));
        animals.add(new Gato("Franela",5, "marron"));
        animals.add(new Perro("Coco", 2, "Callejero"));
        animals.add(new Gato("Papel", 1, "marron"));
        animals.add(new Perro("Rulo", 10, "Mastin"));
        animals.add(new Perro("Teo", 15, "Caniche"));
        animals.add(new Gato("Ramon", 3, "Blanco"));
        animals.add(new Animal("Pumba", 24));
        for(Animal animal : animals){
            if(animal instanceof Gato gato){
                System.out.println("Gato: " + gato.getNombre());
                System.out.println(gato.comer());
                gato.miau();
            }
            else if(animal instanceof Perro perro){
                System.out.println("Perro:" + perro.getNombre());
                System.out.println(perro.comer());
                perro.ladrar();
            }else {
                System.out.println("No es ni gato ni perro");
                System.out.println(animal.comer());
            }
        }
    }
}