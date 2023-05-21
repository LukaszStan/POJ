package zad1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        System.out.println("Lista przed usunięciem duplikatów: " + numbers);
        printDuplicates(numbers);
        List<?> newList = removeDuplicates(numbers);
        System.out.println("Lista po usunięciu duplikatów: " + newList);

    }

    private static void printDuplicates(List<?> list){
        List<Object> duplicates = new ArrayList<>();
        Set<Object> set = new HashSet<>();
        for(Object o: list){
            if(set.contains(o)){
                duplicates.add(o);
            }
            else {
                set.add(o);
            }
        }
        System.out.println("Zduplikowane elementy: " + duplicates);
    }

    private static List<?> removeDuplicates(List<?> list){
        List<Object> newList = new ArrayList<>();

        for(Object element : list){
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
