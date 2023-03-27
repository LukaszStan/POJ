package zad3;
import java.util.Scanner;

public class Remote {
    TV tv;
    public Remote(TV tv){
        this.tv = tv;
    }
    public void changeChannel(){
        Scanner scan = new Scanner(System.in);
        if(tv.on){
            if(tv.channel <= 20 && tv.channel >= 1){
                System.out.println("Wybierz czy chcesz zmienic kanal w gore (g) czy dol (d): ");
                char changeC = scan.next().charAt(0);
                switch (changeC) {
                    case 'g' -> tv.channel += 1;
                    case 'd' -> tv.channel -= 1;
                    default -> System.out.println("Kanał można zmienić tylko w górę albo w dół");
                }
                System.out.println("Obecny kanał: " + tv.channel);
            }
            else {
                System.out.println("Zakres kanałów wynosi 1-20");
            }
        }
        else {
            System.out.println("Żeby zmienić kanał telewizor musi być włączony");
        }
    }
    public void changeVolume(){
        Scanner scan = new Scanner(System.in);
        if(tv.on){
            if(tv.volume <= 10 && tv.volume >= 1){
                System.out.println("Wybierz czy chcesz zmienic glosnosc w gore (g) czy dol (d): ");
                char changeV = scan.next().charAt(0);
                switch (changeV) {
                    case 'g' -> tv.volume += 1;
                    case 'd' -> tv.volume -= 1;
                    default -> System.out.println("Głośność można zmienić tylko w górę albo w dół");
                }
                System.out.println("Obecna głośność: " + tv.volume);
            }
            else {
                System.out.println("Zakres głośności wynosi 1-10");
            }
        }
        else {
            System.out.println("Żeby zmienić głośność telewizor musi być włączony");
        }
    }
    public void turnTv(){
        Scanner scan = new Scanner(System.in);
        if(tv.on){
            tv.on = false;
            System.out.println("Telewizor został wyłączony");
        }
        else {
            tv.on = true;
            System.out.println("Telewizor został włączony");
        }
    }
}
