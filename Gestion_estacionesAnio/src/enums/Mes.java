package enums;

public enum Mes {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    OCTUBRE(10),
    NOVIEMBRE(11),
    DICIEMBRE(12);

    private int num;

    private Mes(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public static Mes fromNumero(int numero) {
        for (Mes m : values()) {
            if (m.num == numero) return m;
        }
        return null;
    }
}
