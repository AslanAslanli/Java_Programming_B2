package day14_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it was a Java class.";

        System.out.println(day.contains("it was")); // true
        System.out.println(day.contains("itwas")); // false

        String str = "was a SoftSkills";
        System.out.println(day.contains(str)); // false

        System.out.println(day.contains("Today class")); // false
        System.out.println(day.contains("it was a Java class.")); // false
        System.out.println(day.contains(" ")); // true
        System.out.println(day.contains("w")); // true
        System.out.println(day.contains("x")); // true

        System.out.println(day.startsWith("")); // true
        System.out.println(day.endsWith("")); // true

        System.out.println(day + " Or not."); // Today it was a Java class. Or not.
        System.out.println(day.contains(" Or not.")); // false

        System.out.println("-------------------------");
        System.out.println((day + " Or not.").contains(" Or not.")); // true
        System.out.println(day.contains(" Or not.")); // false

        // "Today it was a Java class."
        if (day.contains("Java")) {
            System.out.println("There is a coding language name in this sentence");
        }


























    }
}
