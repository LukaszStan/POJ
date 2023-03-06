import java.util.Scanner;
import java.util.Random;
public class Zad10 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz liczbe od 0-2 (0-kamien, 1-papier, 2-nozyce): ");
        int player = scan.nextInt();
        int opp = rand.nextInt(3);
        System.out.println(opp);

        if(opp==0){
            if(player==1){
                System.out.println("Komputer wybral kamien");
                System.out.println("Wygrywa gracz!");
            }
            else if(player==2){
                System.out.println("Komputer wybral kamien");
                System.out.println("Wygrywa komputer!");
            }
        }
        else if(opp==1){
            if(player==0){
                System.out.println("Komputer wybral papier");
                System.out.println("Wygrywa komputer!");
            }
            else if(player==2){
                System.out.println("Komputer wybral papier");
                System.out.println("Wygrywa gracz!");
            }
        }
        else if(player==1){
            System.out.println("Komputer wybral nozyce");
            System.out.println("Wygrywa komputer!");
        }
        else if(player==0){
            System.out.println("Komputer wybral nozyce");
            System.out.println("Wygrywa gracz!");
        }
        else{
            System.out.println("Remis!");
        }
    }
}
