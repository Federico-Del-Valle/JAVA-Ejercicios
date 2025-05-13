package Modelos;

public class Polideportivo extends Edificio{
    private String nombre;
    private String TipoDeInstalacion; //Techado o abierto

    public Polideportivo(int ancho,int largo, int alto,String nombre, String TipoDeInstalacion){
        super(ancho,largo,alto);
        this.nombre=nombre;
        this.TipoDeInstalacion=TipoDeInstalacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return TipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.TipoDeInstalacion = tipoDeInstalacion;
    }
}
