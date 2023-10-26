package day25_methods;

public class Email {
    public static void main(String[] args) {

        String fullName = "Winnie Pooh";
        String domain = "gMail";
        generateEmail(fullName, domain);


    }

    public static void generateEmail (String fullName, String domain) {
        String email = (fullName.charAt(0) + fullName.substring(fullName.indexOf(" ")+1) + "@" + domain + ".com").toLowerCase();
        System.out.println(email);
    }
}
