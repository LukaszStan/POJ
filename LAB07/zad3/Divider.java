package zad3;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

        try{
            int num = convertToInteger(number);
            int div = convertToInteger(divider);
            if(div==0){
                throw new ArithmeticException("Błąd, nie można dzielić przez zero");
            }
            int result = num/div;
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd, wprowadzono nie-liczbę");
        }
    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
