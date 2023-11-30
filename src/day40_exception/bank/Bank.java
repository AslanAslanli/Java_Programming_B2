package day40_exception.bank;

import day31_custom_classes.UseTrafficLigth;

public class Bank {
    double balance;

    //login
//    public void login(String username, String password) throws InvalidCredentialsException {
//        if (!username.equals("loopcamp"))
//            throw new InvalidCredentialsException("Invalid Username");
//
//        if (!password.equals("123456"))
//            throw new InvalidCredentialsException("Invalid Password");
//    }



    //withdraw
    public void withdraw (int withdrawAmount) throws NotEnoughBalanceException {
        if (balance < withdrawAmount)
            throw new NotEnoughBalanceException("Balance is not enough");

    }


}
