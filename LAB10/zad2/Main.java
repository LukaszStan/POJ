package zad2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Set<Integer> userNumbers = getUserNumbers();
    Set<Integer> computerNumbers = generateComputerNumbers();

    int matches = countMatches(userNumbers, computerNumbers);

    System.out.println("Liczba trafień: " + matches);
    }

    private static Set<Integer> getUserNumbers(){
        Set<Integer> userNumbers = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 6 liczb w zakresie 1-49: ");
        while(userNumbers.size() < 6){
            int number = scan.nextInt();

            if(number < 1 || number > 49){
                System.out.println("Podaj liczbę w zakresie 1-49 !!!");
                continue;
            }

            userNumbers.add(number);
        }
        return userNumbers;
    }

    private static Set<Integer> generateComputerNumbers() {
        Set<Integer> computerNumbers = new HashSet<>();
        Random random = new Random();

        while (computerNumbers.size() < 6){
            int number = random.nextInt(49) + 1;
            computerNumbers.add(number);
        }

        return computerNumbers;
    }

    private static int countMatches(Set<Integer> set1, Set<Integer> set2){
        int matches = 0;

        for (int number : set1){
            if(set2.contains(number)){
                matches++;
            }
        }
        return matches;
    }
}
