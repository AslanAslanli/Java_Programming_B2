package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Lord of the Rings";

        AudioBook ab1 = new AudioBook();
        ab1.title = "The Lion";
        ab1.duration = 150;
        ab1.narrator = "Tom Jerry";
        ab1.listen();
        ab1.author = new Author("Mickey Mouse", 22);


        Ebook eb1 = new Ebook();
        eb1.title = "SoftSkills";
        eb1.pages = 100;
        eb1.read();
        //eb1.listen();

        Author a1 = new Author("Winnie Pooh", -10);
        System.out.println(a1.getAge());


    }




}
