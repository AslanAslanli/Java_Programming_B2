package day09_b_if_statements;

public class If_Else_Example {
    public static void main(String[] args) {

        int score = 80;
        if (score >= 75){  // false
            System.out.println("You passed the exam!");
        } else {  // true
            System.out.println("You failed!");
        }
///////////////////////////////////////////////////////////////////////////////////////////////////
        int year = 2021;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown){
            System.out.println("Stay at home and study Java. When you study put your mask on");
        }
        else {
            System.out.println("Party. But this is not a nomral party. This is a Java_Party");
        }

















    }
}
