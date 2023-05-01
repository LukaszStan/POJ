package zad5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        int count = 0;
        while (count < 100) {
            if (isLeapYear(year)) {
                System.out.println(year);
                count++;
            }
            year++;
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
