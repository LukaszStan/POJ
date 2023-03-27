package zad6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Gracz gracz = new Gracz();
        Przeciwnik przeciwnik = new Przeciwnik();

        System.out.println("Symulator walki");
        System.out.println("Wybierz swój ekwipunek");
        gracz.bronGracz();
        gracz.zbrojaGracz();
        System.out.println("Wybierz swojego przeciwnika: ");
        System.out.println("1.Łatwy przeciwnik");
        System.out.println("2.Średni przeciwnik");
        System.out.println("3.Trudny przeciwnik");
        int wyborPrzeciwnika = scan.nextInt();
        switch (wyborPrzeciwnika) {
            case 1 -> przeciwnik.latwyPrzeciwnik();
            case 2 -> przeciwnik.sredniPrzeciwnik();
            case 3 -> przeciwnik.trudnyPrzeciwnik();
            default -> System.out.println("Wybierz przeciwnika od 1 do 3");
        }
        System.out.println("Gotowy do walki ? (tak-true nie-false)");
        boolean ready = scan.nextBoolean();
        if(ready){
            System.out.println("Walka sie zaczyna");
            while (!gracz.dead && !przeciwnik.dead){
                if(gracz.pktZycia > 0 && przeciwnik.pktZycia > 0) {
                    System.out.println("Atakuje gracz");
                    if (gracz.losowanieGracz() <= 5 ) {
                        przeciwnik.pktZycia -= gracz.atak;
                        System.out.println("Gracz trafił atak, przeciwnik ma " + przeciwnik.pktZycia + " pkt życia");
                    } else {
                        System.out.println("Gracz nie trafił ataku, przeciwnik ma " + przeciwnik.pktZycia + " pkt życia");
                    }
                    System.out.println("Atakuje przeciwnik");
                    if (przeciwnik.losowaniePrzeciwnik() <= 5) {
                        gracz.pktZycia -= przeciwnik.atak;
                        System.out.println("Przeciwnik trafił atak, gracz ma " + gracz.pktZycia + " pkt życia");
                    } else {
                        System.out.println("Przeciwnik nie trafił ataku, gracz ma " + gracz.pktZycia + " pkt życia");
                    }
                }
                else if(gracz.pktZycia < 0){
                    gracz.dead=true;
                    System.out.println("Wygyrwa Przeciwnik");
                }
                else if(przeciwnik.pktZycia <= 0){
                    przeciwnik.dead=true;
                    System.out.println("Wygyrwa Gracz");
                }
                else {
                    gracz.dead=true;
                    System.out.println("Wygyrwa Przeciwnik");
                }
            }
        }
        else {
            System.out.println("No coz jak nie to nie");
        }
    }
}
