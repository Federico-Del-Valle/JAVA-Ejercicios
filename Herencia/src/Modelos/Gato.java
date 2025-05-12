package Modelos;

public class Gato extends Animal{
    private String color;
    public Gato(){
        super();
    }
    public Gato(String nombre, int edad, String color){
        super(nombre,edad);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void miau(){
        System.out.println(getNombre() + " esta mauyando");
    }

    @Override
    public String dormir(){
        return getNombre() + " esta durmiendo encima del sofa";
    }
}
