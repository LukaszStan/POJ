package zad2;
public class Account{
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws Exception {
        if(amount>balance){
            throw new InsufficientFundsException("Can't withdraw more than your balance is");
        }
        if(amount<0){
            throw new InsufficientFundsException("Can't withdraw negative amounts");
        }
        balance-=amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
