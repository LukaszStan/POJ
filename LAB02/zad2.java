import java.util.Scanner;
import java.util.Arrays;
public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy: ");
        int s = scan.nextInt();
        int[] arr = new int[s];
        System.out.println("Podaj pierwszy element tablicy: ");
        int f = scan.nextInt();
        arr[0] = f;
        for (int i = 1; i < arr.length; i++) {
            if(f % 2 == 0){
                arr[i] = (f + 2) + (2 * (i-1));
            }else{
                arr[i] = (f + 1) + (2 * (i-1));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        min(arr);
        max(arr);
        sum(arr);
        avg(arr);
        med(arr);
    }
    public static void min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Min: " + min);
    }
    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max: " + max);
    }
    public static void sum(int[] arr){
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("Suma: " + sum);
    }
    public static void avg(int[] arr){
        double sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        double avg = sum/ arr.length;
        System.out.println("Średnia: " + avg);
    }
    public static void med(int[] arr){
        Arrays.sort(arr);
        double median;
        if (arr.length % 2 == 0)
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        else
            median = (double) arr[arr.length/2];
        System.out.println("Mediana: " + median);
    }
}
