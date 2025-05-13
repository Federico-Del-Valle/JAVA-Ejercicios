package Modelos;

public class EdificioDeOficinas extends Edificio{
private int numOficinas;
private int cantPxOficinas;
private int numPisos;

public EdificioDeOficinas(){
    super();
}
public EdificioDeOficinas(int ancho, int alto, int largo, int numOficinas, int cantPxOficinas, int numPisos){
    super(ancho, alto, largo);
    this.numOficinas = numOficinas;
    this.cantPxOficinas = cantPxOficinas;
    this.numPisos = numPisos;
}
    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPxOficinas() {
        return cantPxOficinas;
    }

    public void setCantPxOficinas(int cantPxOficinas) {
        this.cantPxOficinas = cantPxOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int cantPersonas(){
    return this.numOficinas * this.cantPxOficinas * this.numPisos;
    }

}
