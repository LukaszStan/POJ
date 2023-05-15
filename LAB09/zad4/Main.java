package zad4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zawodnik> zawodnicy = new ArrayList<>();
        zawodnicy.add(new Zawodnik("Jan","Kowalski",1,10.5));
        zawodnicy.add(new Zawodnik("Adam","Nowak",3,8.6));
        zawodnicy.add(new Zawodnik("Maciek","Stanowski",2,6.4));

        zawodnicy.sort(new ImieComparator());
        System.out.println("Sortowanie po imieniu");
        for (Zawodnik zawodnik: zawodnicy){
            System.out.println(zawodnik.getImie());
        }

        zawodnicy.sort(new NumerComparator());
        System.out.println("Sortowanie po numerze:");
        for (Zawodnik zawodnik: zawodnicy){
            System.out.println(zawodnik.getNumer());
        }

        zawodnicy.sort(new PrekoscMaxComparator());
        System.out.println("Sortowanie po prekosci max:");
        for (Zawodnik zawodnik: zawodnicy){
            System.out.println(zawodnik.getMaxpredkosc());
        }
    }
}
