package zad1;

public class Main {
    public static void main(String[] args){
        Ulamek a1 = new Ulamek(1,4);
        Ulamek b1 = new Ulamek(1,3);
        Ulamek c1 = a1.dodaj(b1);
        c1.wyswietl();
        Ulamek a2 = new Ulamek(1,5);
        Ulamek b2 = new Ulamek(1,10);
        Ulamek c2 = a2.odejmij(b2);
        c2.wyswietl();
        Ulamek a3 = new Ulamek(3,2);
        Ulamek b3 = new Ulamek(5,6);
        Ulamek c3 = a3.pomnoz(b3);
        c3.wyswietl();
        Ulamek a4 = new Ulamek(2,5);
        Ulamek b4 = new Ulamek(1,10);
        Ulamek c4 = a4.podziel(b4);
        c4.wyswietl();
    }
}
