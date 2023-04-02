package zad1;

public class Ulamek {
    private int licznik;
    private int mianownik;
    public Ulamek(int licznik, int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    public Ulamek dodaj(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.mianownik + inny.licznik * this.mianownik;
        int nowyMianownik;
        if(this.mianownik == inny.mianownik){
            nowyMianownik = this.mianownik;
        }
        else {
            nowyMianownik = this.mianownik * inny.mianownik;
        }
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public Ulamek odejmij(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.mianownik - inny.licznik * this.mianownik;
        int nowyMianownik;
        if(this.mianownik == inny.mianownik){
            nowyMianownik = this.mianownik;
        }
        else {
            nowyMianownik = this.mianownik * inny.mianownik;
        }
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public Ulamek pomnoz(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.licznik;
        int nowyMianownik = this.mianownik * inny.mianownik;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public Ulamek podziel(Ulamek inny) {
        int nowyLicznik = this.licznik * inny.mianownik;
        int nowyMianownik = this.mianownik * inny.licznik;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    public void wyswietl() {
        System.out.println(licznik + "/" + mianownik);
    }
}
