package zad4;

public class Main {
    public static void main(String[] args){
        Czas czas1 = new Czas(29,14);
        Czas czas2 = new Czas(1,50);
        Czas czas3 = new Czas(20,30);

        System.out.println(czas1);
        System.out.println(czas1.dodaj(czas2));
        System.out.println(czas1.odejmij(czas3));
        System.out.println(czas1.pomnoz(2));
    }
}
