package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        LoopcampStudents student1 = new LoopcampStudents("Sergi", 2);
        System.out.println(student1);

        LoopcampStudents student2 = new LoopcampStudents("Nihad", 3);
        System.out.println(student2);

        System.out.println();
        LoopcampStudents.printInfo();

        System.out.println("Teachers name: " + Arrays.toString(LoopcampStudents.teachers));
        System.out.println("Teachers name: " + Arrays.toString(student1.teachers));
        System.out.println("Teachers name: " + Arrays.toString(student2.teachers));

    }

}
