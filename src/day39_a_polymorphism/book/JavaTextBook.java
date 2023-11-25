package day39_a_polymorphism.book;

public class JavaTextBook extends EBook{
    boolean isFun;

    public boolean isFun() {
        return isFun;
    }

    @Override
    public void read() {
        System.out.println("Reading Java Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading java texting");
    }

    @Override
    public void open() {
        System.out.println("Opening Java Text Book");
    }

}
