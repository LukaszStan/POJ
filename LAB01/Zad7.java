import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą litere: ");
        char char1 = scan.next().charAt(0);
        System.out.println("Podaj druga litere: ");
        char char2 = scan.next().charAt(0);
        int x = char1;
        int y = char2;
        if(char1>char2){
            System.out.println("Litera: " + char1 + " jest dalej w alfabecie");
        }
        else if(char2>char1){
            System.out.println("Litera: " + char2 + " jest dalej w alfabecie");
        }
        else{
            System.out.println("Litery sa takie same");
        }
    }
}
