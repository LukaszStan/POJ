package zad6;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Podaj godzinę w Polsce (dd/MM/yyyy HH:mm): ");
        String inputDateTime = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime, formatter);

        System.out.println("Wybierz kraj / miasto do przeliczenia czasu:");
        System.out.println("1. Nowy Jork, Stany Zjednoczone");
        System.out.println("2. Sydney, Australia");
        System.out.println("3. Tokio, Japonia");
        System.out.print("Twój wybór (1-3): ");
        int choice = scanner.nextInt();

        String outputTimeZone;
        switch (choice) {
            case 1 -> outputTimeZone = "America/New_York";
            case 2 -> outputTimeZone = "Australia/Sydney";
            case 3 -> outputTimeZone = "Asia/Tokyo";
            default -> {
                System.out.println("Nieprawidłowy wybór!");
                return;
            }
        }
        ZonedDateTime outputDateTime = dateTime.atZone(ZoneId.of("Europe/Warsaw"))
                .withZoneSameInstant(ZoneId.of(outputTimeZone));

        System.out.println("Godzina w " + outputTimeZone + ": " + outputDateTime.format(formatter));
    }
}
