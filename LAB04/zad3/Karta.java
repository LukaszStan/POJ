package zad3;

public class Karta {
    private Kolor kolor;
    private Figura figura;

    public Karta(Kolor kolor, Figura figura){
        this.kolor = kolor;
        this.figura = figura;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Figura getFigura() {
        return figura;
    }
    @Override
    public String toString(){
        return figura + " " + kolor;
    }
}
