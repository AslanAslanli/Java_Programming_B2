package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many friends do you have?");
        int numOffFriends = input.nextInt();

        String [] friendNameList = new String[numOffFriends];

        for (int i = 0; i < friendNameList.length; i++) {
            System.out.println("Enter your friend's name: ");
            friendNameList [i] = input.next();
        }

        System.out.println(Arrays.toString(friendNameList));







    }
}
