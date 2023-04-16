package zad5;

public class Main {
    public static void main(String[] args){
        Samochod s1 = new Samochod("Czerwony","BMW",2000);
        s1.przyspiesz();
        System.out.println(s1);
        Samochod s2 = new Samochod("Czerwony","BMW",2000);
        System.out.println(s1.equals(s2));

        SzybkiSamochod ss1 = new SzybkiSamochod("Czerwony","BMW",2000);
        ss1.przyspiesz();
        System.out.println(ss1);
        System.out.println(s1.equals(ss1));
    }
}
