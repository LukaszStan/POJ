package zad2;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int zakresDolny;
    private int zakresGorny;
    private int liczba;
    public Gra(int zakresDolny, int zakresGorny){
        this.zakresDolny = zakresDolny;
        this.zakresGorny = zakresGorny;
        Random random = new Random();
        this.liczba = random.nextInt(zakresGorny-zakresDolny+1)+zakresDolny;
    }
    public void zagraj(){
        Scanner scan = new Scanner(System.in);
        int proby = 0;
        System.out.println("Komputer wylosowal liczbe z zakresu [" + zakresDolny + ", " +  zakresGorny + "].");
        System.out.println("Sprobuj ja odgadnac! (Powodzenia)");
        while (proby<5){
            System.out.println("Podaj swoja liczbe: ");
            int probaliczba = scan.nextInt();
            proby++;

            if(probaliczba == liczba){
                System.out.println("Brawo! Odgadles liczbe w " + proby + " probach.");
                return;
            } else if (probaliczba<liczba) {
                System.out.println("Za mala!");
            }
            else {
                System.out.println("Za duza!");
            }
        }
        System.out.println("Niestety, nie udało ci sie odgadnac liczby. Wylosowana liczba to: " + liczba);
    }
}
