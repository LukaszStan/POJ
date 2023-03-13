import java.util.Arrays;
public class zad4 {
    public static void matrix(int arr[][]){
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args){
        int arr[][]={{1,6,9,3},{4,2,3,6},{11,6,23,9}};
        matrix(arr);
    }
}
