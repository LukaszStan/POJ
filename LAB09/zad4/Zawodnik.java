package zad4;

public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int numer;
    private double maxpredkosc;

    public Zawodnik(String imie, String nazwisko, int numer, double maxpredkosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.maxpredkosc = maxpredkosc;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumer() {
        return numer;
    }

    public double getMaxpredkosc() {
        return maxpredkosc;
    }
}
