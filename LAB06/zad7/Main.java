package zad7;

public class Main {
    public static int sumArray(int[]... arrays){
        int sum = 0;
        for (int[] array : arrays){
            for (int i: array){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int result = sumArray(arr1,arr2);
        System.out.println(result);
    }
}
