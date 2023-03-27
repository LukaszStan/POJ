package zad5;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Konto[] konta = new Konto[10];
        for (int i = 0; i < 10; i++) {
            konta[i] = new Konto();
            konta[i].setId(i);
            konta[i].setBalance(100f);
        }
        boolean logged = false;
        while (true) {
            System.out.println("Podaj id konta: ");
            int inputid = scan.nextInt();
            for (int j = 0; j < 10; j++) {
                if (konta[j].id == inputid) {
                    logged = true;
                    break;
                }
                while (logged) {
                        System.out.println("Main menu");
                        System.out.println("1: check balance");
                        System.out.println("2: withdraw");
                        System.out.println("3: deposit");
                        System.out.println("4: exit");
                        System.out.println("Enter a choice: ");
                        int choice = scan.nextInt();
                        switch (choice) {
                            case 1 -> konta[inputid].checkBalance();
                            case 2 -> konta[inputid].withdraw();
                            case 3 -> konta[inputid].deposit();
                            case 4 -> logged = false;
                            default ->
                                    System.out.println("Please choose and operation that's available on the main menu screen");
                    }
                }
            }
        }
    }
}
