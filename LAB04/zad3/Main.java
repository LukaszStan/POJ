package zad3;

public class Main {
    public static void main(String[] args){
        Karta[] talia = new Karta[Kolor.values().length * Figura.values().length];
        int index = 0;
        for(Kolor kolor : Kolor.values()){
            for(Figura figura : Figura.values()){
                talia[index++] = new Karta(kolor,figura);
            }
        }
        for (Karta karta : talia){
            System.out.println(karta);
        }
    }
}
