package zad2i3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Slownik<Integer, String> slownik = new Slownik<>(5);
        slownik.dodaj(1,"Jeden");
        slownik.dodaj(2,"Dwa");
        slownik.dodaj(3,"Trzy");
        slownik.dodaj(4, "Cztery");
        slownik.dodaj(5, "Pięć");
        slownik.dodaj(6, "Sześć");
        System.out.println(slownik);
        System.out.println("Czy zawiera klucz 3: " + slownik.czyZawiera(3));
        System.out.println("Czy zawiera klucz 7: " + slownik.czyZawiera(7));
        System.out.println("Wielkość słownika: " + slownik.wielkosc());

        Slownik<String, String> slownik2 = new Slownik<>(3);
        slownik2.dodaj("A","Ananas");
        slownik2.dodaj("B","Banan");
        slownik2.dodaj("C","Czereśnie");
        slownik2.dodaj("A","Arbuz");
        System.out.println(slownik2);
        System.out.println("Czy zawiera klucz 'A': " + slownik2.czyZawiera("A"));
        System.out.println("Czy zawiera klucz 'D': " + slownik2.czyZawiera("D"));
        System.out.println("Wielkość słownika2 : " + slownik2.wielkosc());

        File file = new File("zad2i3/plikzrodlowy.txt");
        Slownik<String, String> slownik3 = Slownik.wczytajSlownik(file);
        System.out.println(slownik3);
        System.out.println("Wielkość wczytanego z pliku słownika3 : " + slownik3.wielkosc());
    }
}
