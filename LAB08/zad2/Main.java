package zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String fileName = "zad2/Input";
        int lineNumber = 1;
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();

            while (line != null) {
                if (lineNumber % 2 == 0) {
                    sum += Integer.parseInt(line.trim());
                }

                line = reader.readLine();
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing integer: " + e.getMessage());
        }

        System.out.println("Suma co drugiej linijki pliku " + fileName + " wynosi: " + sum);
    }

}

