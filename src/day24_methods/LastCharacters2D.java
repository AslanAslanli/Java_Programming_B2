package day24_methods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] words = {
                {"Java", "is", "fun"},
                {"Softskills", "ehhh"},
                {"Loops", "are", "getting", "easier"}
        };

        System.out.println(words.length); // 3
        System.out.println(words[2].length); // 4

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j].charAt(words[i][j].length()-1));
            }
            System.out.println();
        }

        for (String[] eachArr : words) {
            for (String eachElement : eachArr) {
                System.out.print(eachElement.charAt(eachElement.length()-1));
            }
            System.out.println();
        }







    }
}
