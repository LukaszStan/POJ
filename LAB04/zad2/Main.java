package zad2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w grze zgadnij liczbe!");
        System.out.println("Podaj dolny zakres liczb: ");
        int zakresDolny = scan.nextInt();
        System.out.println("Podaj gorny zakres liczb: ");
        int zakreGorny = scan.nextInt();
        Gra gra = new Gra(zakresDolny,zakreGorny);
        gra.zagraj();
    }
}
