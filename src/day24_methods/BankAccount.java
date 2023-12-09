package day24_methods;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many accounts are there: ");
        int numOfAcc = input.nextInt();
        String[][] allAccounts = new String[numOfAcc][4];

        String[] questions = {"Name: ", "Account Type: ", "Account Number: ", "Balance $: "};
        input.nextLine();

//        String[] bankAcc1 = {"Tom Jerry", "Saving", "1111-2222-3333", "100,000"};
//        String[] bankAcc2 = {"Tom Jerry", "Saving", "1111-2222-3333", "100,000", "test1", "test2", "test3", "test4"};


        for (int i = 0; i < allAccounts.length; i++) {

            for (int j = 0; j < allAccounts[i].length; j++) {

                System.out.println(questions[j]);
                allAccounts [i][j] = input.nextLine();

            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(allAccounts));

        for (String[] eachArr : allAccounts) {
            Arrays.toString(eachArr);
        }


//        System.out.println("Number of elements: " + bankAcc1.length);
//        System.out.println("Whole array " + Arrays.toString(bankAcc1));
//        System.out.println("Name: " + bankAcc1[0]);
//        System.out.println("Account Type: " + bankAcc1[1]);
//        System.out.println("Account Number: " + bankAcc1[2]);
//        System.out.println("Balance $: " + bankAcc1[3]);














    }
}
