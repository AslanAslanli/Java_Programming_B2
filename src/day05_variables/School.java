package day05_variables;

public class School  {
    public static void main (String [] args){

        int numberofStudentsinGrade1 = 32;
        int numberofStudentsinGrade2 = 40;
        int numberofStudentsinGrade3 = 25;
        int numberofStudentsinGrade4 = 10;
        int numberofStudentsinGrade5 = 38;

        // How can i calculate the total number of students
        // int totalNumberofStudents = 30 + 40 + 25 + 10 + 38;
        int totalNumberofStudents = numberofStudentsinGrade1 + numberofStudentsinGrade2 + numberofStudentsinGrade3 + numberofStudentsinGrade4 + numberofStudentsinGrade5;

        double numberofDaysinaYear = 100.5;
        double numberofSnowDaysinaYear = 10;
        double averageGPSinSchool = 3.5;

        System.out.println("Number of Students in Grade 1: " + numberofStudentsinGrade1);
        System.out.println("Number of Students in Grade 2: " + numberofStudentsinGrade2);
        System.out.println("Number of Students in Grade 3: " + numberofStudentsinGrade3);
        System.out.println("Number of Students in Grade 4: " + numberofStudentsinGrade4);
        System.out.println("Number of Students in Grade 5: " + numberofStudentsinGrade5);


        System.out.println("Total number of students: " + numberofStudentsinGrade1 + totalNumberofStudents); // this is concatination only
        System.out.println("Total number of students: " + totalNumberofStudents);

        System.out.println("Number of days in a year: " + numberofDaysinaYear);
        System.out.println();
        //variableName.sout
        System.out.println(numberofSnowDaysinaYear);
        //variableName.soutv
        System.out.println("Number of Snow Days in a  Year = " + numberofSnowDaysinaYear);

        System.out.println("Average GPS in School = " + averageGPSinSchool);




    }}

    /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
