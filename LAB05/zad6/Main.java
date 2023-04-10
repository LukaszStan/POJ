package zad6;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(4));
        System.out.println(calc.calculate(4,2));
        System.out.println(calc.calculate(4,2,25));
    }
}
