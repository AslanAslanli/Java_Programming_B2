package day35_inheritance.book;

public class Ebook extends Book{
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " +
                title + " which has " + pages + " pages");
    }

}
