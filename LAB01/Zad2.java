import java.util.Scanner;
public class Zad2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz stopnie celcjusza- ");
        double celsius = scan.nextDouble();
        double farenhait = ((celsius*9)/5)+32;
        System.out.println("Temperatura w farenhaitach to: " + farenhait);
    }
}
