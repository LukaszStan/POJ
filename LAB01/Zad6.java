import java.util.Scanner;
public class Zad6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia: ");
        int dzien = scan.nextInt();
        switch (dzien){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Wybierz liczbę od 1 do 7");
                break;
        }
    }
}
