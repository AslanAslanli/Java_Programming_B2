package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {

    JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Programming";
        book1.size = 20.0;
        book1.isFun = true;

        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextBook();
        book2.name = "Java P-2";
        book2.size = 30.5;
        //book2.isFun = false;
        ((JavaTextBook) book2).isFun = false;

        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextBook();
        book3.name = "Java P-3";
        book3.read();

        Downloadable book4 = new JavaTextBook();
        book4.download();

        JavaTextBook book5 = (JavaTextBook) book4;

    }
}
