import java.util.Scanner;
public class Zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trojkata: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugi bok trojkata: ");
        int b = scan.nextInt();
        System.out.println("Podaj trzeci bok trojkata: ");
        int c = scan.nextInt();
        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Nie");
        }
        else{
            System.out.println("Tak");
        }
    }
}
