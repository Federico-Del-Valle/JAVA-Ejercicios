package Modelos;

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



}
