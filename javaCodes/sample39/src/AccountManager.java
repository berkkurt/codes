public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;

    }
    public void withdrav(double amount) throws BalanceInsufficentException {
        if(balance>=amount){
        balance = getBalance() - amount;}
        else{
            throw new BalanceInsufficentException("Bakiye Yeteriz");
        }
    }

    public double getBalance() {
        return balance;
    }
}
