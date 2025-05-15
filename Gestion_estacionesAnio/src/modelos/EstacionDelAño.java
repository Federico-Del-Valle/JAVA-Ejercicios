package modelos;

import enums.Estacion;
import enums.Mes;

public class EstacionDelAño {
    public static Estacion obtenerEstacion(Mes mes){
        switch (mes){
            case ENERO,FEBRERO,MARZO:
                return Estacion.VERANO;
            case ABRIL,MAYO,JUNIO:
                return Estacion.OTOÑO;
            case JULIO,AGOSTO,SEPTIEMBRE:
                return Estacion.INVIERNO;
            case OCTUBRE,NOVIEMBRE,DICIEMBRE:
                return Estacion.PRIMAVERA;
            default:
                throw new IllegalArgumentException("Mes desconocido: " + mes);
        }
    }
    public static void imprimirEstaciones(){
        for(Estacion estacion: Estacion.values()){
            System.out.println(estacion);
            for(Mes mes: Mes.values()){
                if(obtenerEstacion(mes) == estacion)
                    System.out.println(mes);
            }
        }
    }
}
