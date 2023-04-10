package zad6;

public class Calculator {
    public int calculate(int num1){
        return (int) Math.pow(num1,2);
    }
    public int calculate(int num1, int num2){
        return num1 * num2;
    }
    public int calculate(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
