package day24_methods;

public class MyFirstMethod {

    public static  void helloWorld () {
        System.out.println("Hello world");
    }

    public static void helloWorld50 () {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello world");
        }
    }
    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloWorld50();
    }



}
