import java.util.Arrays;
public class zad3 {
    public static void add_arr(int[] arr, int[] arr2){
        int[] arr_both = new int[arr.length];
        if(arr.length==arr2.length){
            for(int i=0;i<arr.length;i++){
                arr_both[i] = arr[i]+arr2[i];
            }
            System.out.println(Arrays.toString(arr_both));
        }
        else {
            arr_both = new int[0];
            System.out.println(Arrays.toString(arr_both));
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};
        add_arr(arr,arr2);
    }
}
