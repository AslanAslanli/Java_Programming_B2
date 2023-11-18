package day36_inheritance.finalExample;

public class Main {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.walk();
        new Parent().walk();
        new Child().walk();
    }

}

class Parent{
    public final void walk(){
        System.out.println("You are walking in Parent class");
    }

}

class Child extends Parent{
//    @Override
//    public void walk(){
//        System.out.println("You are walking in Child class");
//    }
}
