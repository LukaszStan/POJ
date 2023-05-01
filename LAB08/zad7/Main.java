package zad7;

public class Main {
    public static void main(String[] args){
        Figura[] figury = {new Kwadrat(5), new Prostokat(2,4), new Kolo(3)};
        for(Figura figura: figury){
            System.out.println("Pole: " + figura.obliczPole());
            System.out.println("Obwód: " + figura.obliczObwod());
            System.out.println();
        }
    }
}
