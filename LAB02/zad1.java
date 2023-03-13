import java.util.Scanner;
import java.util.Arrays;

public class zad1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        int s = scan.nextInt();
        char[] arr = new char[s];
        for(int i=0;i<s;i++){
            System.out.println("Podaj znak dla elementu o indeksie " + i + " : ");
            arr[i] = scan.next().charAt(0);
        }
        System.out.println(Arrays.toString(arr));
    }
}
