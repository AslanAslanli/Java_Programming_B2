package day40_exception.bank;

public class UserAccounts {
    public static void main(String[] args) throws InvalidCredentialsException, NotEnoughBalanceException {

        Bank account1 = new Bank();
        account1.balance = 100_000;

        //account1.login("loopcamp" ,"123546");
        account1.withdraw(50000);
        account1.withdraw(150000);


    }
}
