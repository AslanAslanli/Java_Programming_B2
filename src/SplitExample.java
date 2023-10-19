import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String str = "monday, tuesday, wednesday, thursday, fridaya";
        String [] days = str.split(",");

        for (String each : days) {
            System.out.println(each);
        }

        String [] days2 = str.split("day");

        for (String each : days2) {
            System.out.println(each);
        }

        String months = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
        String [] monthsArr = months.split("-");
        System.out.println(Arrays.toString(monthsArr));


        String [] arr2 = months.split("y-");
        for (String each : arr2) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");
        String [] arr3 = months.split("");

        for (String each : arr3) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");
        String[] arr4 = months.split("java");
        for (String each : arr4) {
            System.out.println(each);
        }

        System.out.println(arr4.length);
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4[0]);


    }
}
