import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Zad8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        System.out.println("Podaj trzy cyfry: ");
        for(int i=0;i<3;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
    }
}
