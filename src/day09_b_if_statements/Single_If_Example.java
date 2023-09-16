package day09_b_if_statements;

public class Single_If_Example {
    public static void main(String[] args) {
///////////////////////////////////////////////////////////////
        if (true){
            System.out.println("Hello World!");
        }
///////////////////////////////////////////////////////////////
    int score = 60;

        if (score >= 75){
            System.out.println("You passed the exam!");
        }
////////////////////////////////////////////////////////////////
        if (score < 75){
            System.out.println("You failed");
        }
////////////////////////////////////////////////////////////////
        int year = 2021;
        boolean isLockdown = year == 2020 || year == 2021;

        if (isLockdown){
            System.out.println("Stay at home and study Java. When you study put your mask on");
        }

        if (!isLockdown){
            System.out.println("Party");
            System.out.println("But this is not a nomral party. This is a Java_Party");
        }

    }
}
