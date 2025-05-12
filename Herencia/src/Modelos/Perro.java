package Modelos;

import java.util.Objects;

public class Perro extends Animal{
    private String raza;
    public Perro(){
        super();
    }
    public Perro(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void ladrar(){
        System.out.println(getNombre() + " esta ladrando");
    }

    @Override
    public String comer(){
        return this.getNombre() + " esta comiendo croquetas";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raza);
    }
}
