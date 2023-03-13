import java.util.Arrays;
public class zad5 {
    public static void add_matrix(int arr[][], int arr2[][]) {
        int sum_arr[][] = new int[arr.length][arr2.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum_arr[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int[] row : sum_arr)
            System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,3,1},{6,9,5}};
        int arr2[][] = {{6,2,2},{9,10,3},{12,3,1}};
        add_matrix(arr,arr2);
    }
}
