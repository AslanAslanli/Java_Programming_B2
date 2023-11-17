package day35_inheritance.computer;

public class Store {
    public static void main(String[] args) {
        Computer objComp = new Computer("General OS", 300);
        System.out.println(objComp);

        Mac macObj1 = new Mac(512);
        Mac macObj2 = new Mac(1024);
        Mac macObj3 = new Mac(256);
        System.out.println(macObj1);

        Windows winObj1 = new Windows(512);
        Windows winObj2 = new Windows(512);
        Windows winObj3 = new Windows(512);
        System.out.println(winObj1);




    }

}
