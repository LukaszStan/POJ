package zad5;
import java.util.Random;
public class Zawodnik {
    private String imie;
    private int predkoscMin;
    private int predkoscMax;
    private int pokonanaOdleglosc;

    public Zawodnik(String imie, int predkoscMin, int predkoscMax) {
        this.imie = imie;
        this.predkoscMin = predkoscMin;
        this.predkoscMax = predkoscMax;
        this.pokonanaOdleglosc = 0;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + this.imie + " biegam z prędkością " + this.predkoscMin + "-" + this.predkoscMax + " km/h");
    }

    public void biegnij() {
        Random r = new Random();
        int predkosc = r.nextInt(this.predkoscMax - this.predkoscMin + 1) + this.predkoscMin;
        this.pokonanaOdleglosc += predkosc;
        System.out.println(this.imie + " przebiegł(a) " + predkosc + " km, całkowita odległość: " + this.pokonanaOdleglosc + " km");
    }

    public String getImie() {
        return this.imie;
    }

    public int getPokonanaOdleglosc() {
        return this.pokonanaOdleglosc;
    }
}
