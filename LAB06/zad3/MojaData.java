package zad3;

public class MojaData {
    private int dzien;
    private int miesiac;
    private int rok;

    public MojaData(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    @Override
    public String toString(){
        //Format a: 1.11.2011
        //return (dzien + "." + miesiac + "." + rok);

        //Format b: 01.11.2011
        //return String.format("%02d.%02d.%d", dzien, miesiac, rok);

        //Format c: 1 lis 2011
        String[] miesiace = {"", "sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paź", "lis", "gru"};
        return (dzien + " " + miesiace[miesiac] + " " + rok);
    }
}
