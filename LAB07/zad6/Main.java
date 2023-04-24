package zad6;

public class Main {
    public static void main(String[] args){
        String tekst = "123Test";
        String usuniety = TransformacjaString.usunZnaki(tekst, Znak.LICZBA);
        System.out.println(usuniety);

        String podmieniony = TransformacjaString.podmienZnaki(tekst, Znak.LICZBA, "$");
        System.out.println(podmieniony);

        String pozostawiony = TransformacjaString.pozostawZnaki(tekst, Znak.LICZBA);
        System.out.println(pozostawiony);
    }
}
