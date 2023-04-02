package zad3;

public enum Figura {
    DWA("2"),
    TRZY("3"),
    CZTERY("4"),
    PIEC("5"),
    SZESC("6"),
    SIEDM("7"),
    OSM("8"),
    DZIEWIEC("9"),
    DZIESIEC("10"),
    WALET("J"),
    DAMA("Q"),
    KROL("K"),
    AS("A");

    private final String symbol;

    Figura(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
