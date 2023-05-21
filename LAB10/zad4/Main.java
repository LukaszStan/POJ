package zad4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String tekst = "Hello";
        Map<String, Set<Integer>> skorowidz = skorowidzLiterowy(tekst);
        System.out.println(skorowidz);
    }

    private static Map<String, Set<Integer>> skorowidzLiterowy(String tekst){
        Map<String, Set<Integer>> skorowidz = new HashMap<>();

        for (int i = 0; i< tekst.length();i++){
            String litera = String.valueOf(tekst.charAt(i));

            if(!skorowidz.containsKey(litera)){
                skorowidz.put(litera, new HashSet<>());
            }

            skorowidz.get(litera).add(i);
        }
        return skorowidz;
    }
}
