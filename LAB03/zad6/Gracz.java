package zad6;
import java.util.Scanner;
public class Gracz {
    int pktZycia=20;
    int atak;
    String bron;
    String zbroja;
    boolean dead = false;

    public Gracz(){

    }

    public void bronGracz(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz bron dla gracza: ");
        System.out.println("1.drewniany miecz");
        System.out.println("2.stalowy miecz");
        System.out.println("3.zloty miecz");
        int wybormiecz = scan.nextInt();
        switch (wybormiecz){
            case 1:
                bron = "drewniany miecz";
                atak = 2;
                break;
            case 2:
                bron = "stalowy miecz";
                atak = 5;
                break;
            case 3:
                bron = "zloty miecz";
                atak = 10;
                break;
            default:
                System.out.println("Wybierz bron od 1-3");
                break;
        }
    }
    public void zbrojaGracz(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz zbroje dla gracza: ");
        System.out.println("1.skorzana zbroja");
        System.out.println("2.stalowy zbroja");
        System.out.println("3.zlota zbroja");
        int wyborzbroja = scan.nextInt();
        switch (wyborzbroja){
            case 1:
                zbroja = "skorzana zbroja";
                pktZycia += 5;
                break;
            case 2:
                zbroja = "stalowa zbroja";
                pktZycia += 10;
                break;
            case 3:
                zbroja = "zlota zbroja";
                pktZycia += 20;
                break;
            default:
                System.out.println("Wybierz zbroje od 1-3");
                break;
        }
    }
    public int losowanieGracz(){
        int min = 1;
        int max = 10;
        int random_intG = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_intG;
    }
}
