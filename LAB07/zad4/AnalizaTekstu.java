package zad4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalizaTekstu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tekst do analizy: ");
        String tekst = scan.nextLine();
        Analizuj(tekst);
        scan.close();
    }
    protected static void Analizuj(String tekst) {
        int liczbaLiter = 0;
        int liczbaSamoglosek = 0;
        int liczbaSpolglosek = 0;
        int liczbaBialychZnakow = 0;
        int liczbaLiczb = 0;
        int liczbaInnychZnakow = 0;

        Pattern patternLitery = Pattern.compile("[a-zA-Z]");
        Matcher matcherLitery = patternLitery.matcher(tekst);

        Pattern patternSamogloski = Pattern.compile("[aeiouyAEIOUY]");
        Matcher matcherSamogloski = patternSamogloski.matcher(tekst);

        Pattern patternBialeZnaki = Pattern.compile("\\s");
        Matcher matcherBialeZnaki = patternBialeZnaki.matcher(tekst);

        Pattern patternLiczby = Pattern.compile("\\d");
        Matcher matcherLiczby = patternLiczby.matcher(tekst);

        while (matcherLitery.find()){
            liczbaLiter++;
        }

        while (matcherSamogloski.find()){
            liczbaSamoglosek++;
        }

        liczbaSpolglosek = liczbaLiter - liczbaSamoglosek;

        while (matcherBialeZnaki.find()){
            liczbaBialychZnakow++;
        }

        while (matcherLiczby.find()){
            liczbaLiczb++;
        }

        liczbaInnychZnakow = tekst.length() - liczbaLiter - liczbaBialychZnakow - liczbaLiczb;

        System.out.println("Podany tekst \"" + tekst + "\" zawiera:");
        System.out.println(liczbaLiter + " liter, w tym " + liczbaSamoglosek + " samogłosek oraz " + liczbaSpolglosek + " spółgłosek");
        System.out.println(liczbaBialychZnakow + " białych znaków");
        System.out.println(liczbaLiczb + " liczb");
        System.out.println(liczbaInnychZnakow + " innych znaków");
    }
}
