package zad1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean poprawneDane = false;

        while(!poprawneDane){
            try{
                System.out.println("Podaj imię: ");
                String imie = scan.nextLine();
                System.out.println("Podaj nazwisko: ");
                String nazwisko = scan.nextLine();
                System.out.println("Podaj rok urodzenia: ");
                int rok_urodzenia = scan.nextInt();
                scan.nextLine();

                Osoba osoba = new Osoba(imie,nazwisko,rok_urodzenia);
                System.out.println("Utworzono nową osobę: " + osoba);
                poprawneDane = true;
            } catch (Exception e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
    }
}
