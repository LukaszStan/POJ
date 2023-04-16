package zad5;

import java.util.Objects;

public class Samochod {
    private int predkosc;
    private String kolor;
    private String marka;
    private int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.predkosc = 0;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public void przyspiesz(){
        this.predkosc += 20;
        if(this.predkosc > 140){
            this.predkosc = 140;
        }
    }

    @Override
    public String toString(){
        return (this.kolor + " " + this.marka + " rocznik " + this.rocznik);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return rocznik == samochod.rocznik && Objects.equals(kolor, samochod.kolor) && Objects.equals(marka, samochod.marka);
    }
}
