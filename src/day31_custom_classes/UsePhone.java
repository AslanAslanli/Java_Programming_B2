package day31_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("iPhone 14", "Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("iPhone 14", "Apple", 256, 2.1);
        System.out.println(phone3);
    }
}
