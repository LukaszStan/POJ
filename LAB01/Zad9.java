import java.util.Scanner;
public class Zad9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;
        System.out.println("Wpisz x1: ");
        x1 = scan.nextInt();
        System.out.println("Wpisz y1: ");
        y1 = scan.nextInt();
        System.out.println("Wpisz x2: ");
        x2 = scan.nextInt();
        System.out.println("Wpisz y2: ");
        y2 = scan.nextInt();
        dis=Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        System.out.println("Odleglosc od tych punktow wynosi: "+dis);
    }
}
