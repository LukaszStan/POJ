package zad5;
import java.util.Scanner;

public class Konto {
    int id;
    float balance;

    public void setId(int id){
        this.id = id;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public void checkBalance(){
        System.out.println("The balance is: " + balance);
    }
    public void withdraw(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much you want to withdraw: ");
        float withdrawAmn = scan.nextInt();
        if(balance<withdrawAmn){
            System.out.println("Not enough money on the account to withdraw this amount");
        }
        else {
            balance -= withdrawAmn;
            System.out.println("Withdraw was successful, your balance is: " + balance);
        }
    }
    public void deposit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much you want to deposit: ");
        float depositAmn = scan.nextInt();
        balance += depositAmn;
        System.out.println("Deposit was successful, your balance is: " + balance);
    }
}
