package zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String tekst = "Ala ma kota, kot ma Alę";
        Map<String, Integer> wystapienia = zliczWystapieniaSlow(tekst);
        System.out.println(wystapienia);
    }

    private static Map<String, Integer> zliczWystapieniaSlow(String tekst){
        Map<String, Integer> wystapienia = new HashMap<>();
        String[] slowa = tekst.replaceAll("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ ]","").toLowerCase().split("\\s+");

        for(String slowo : slowa){
            if(wystapienia.containsKey(slowo)){
                wystapienia.put(slowo,wystapienia.get(slowo) + 1);
            }
            else {
                wystapienia.put(slowo,1);
            }
        }
        return wystapienia;
    }
}
