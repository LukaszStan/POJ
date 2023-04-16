package zad1;

public class Pracownik {
    private String imie;
    private String nazwisko;
    protected double dzienne_wynagrodzenie;

    public Pracownik(String imie, String nazwisko, double dzienne_wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzienne_wynagrodzenie = dzienne_wynagrodzenie;
    }
    public double getMiesieczneWynagrodzenie(){
        return dzienne_wynagrodzenie*20;
    }
}
