package zad4;

import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę rzutów monetą:");
        int liczbaRzutow = scan.nextInt();

        Moneta moneta = new Moneta();

        int liczbaOrlow = 0;
        for (int i = 0; i < liczbaRzutow; i++) {
            String wynikRzutu = moneta.rzut();
            if (wynikRzutu.equals("orzeł")) {
                liczbaOrlow++;
            }
            System.out.print(wynikRzutu + " ");
        }

        double procentOrlow = (double) liczbaOrlow / liczbaRzutow * 100;
        double procentReszek = 100 - procentOrlow;
        System.out.printf("\n%.0f%% orzeł | %.0f%% reszka\n", procentOrlow, procentReszek);
    }
}
