import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Zad4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow: ");
        int liczbastudentow = scan.nextInt();
        int pkt,pkt2;
        String imie,imie2;
        System.out.println("Podaj imie studenta: ");
        imie = scan.next();
        System.out.println("Podaj liczbe punktow studenta: ");
        pkt = scan.nextInt();
        for(int i=0;i<liczbastudentow-1;i++){
            System.out.println("Podaj imie studenta: ");
            imie2 = scan.next();
            System.out.println("Podaj liczbe punktow studenta: ");
            pkt2 = scan.nextInt();
            if(pkt2>pkt){
                pkt=pkt2;
                imie=imie2;
            }
            else{
                pkt=pkt;
            }
        }
        System.out.println("Najwiecej punktow mial: " + imie + " " + pkt);
    }
}
