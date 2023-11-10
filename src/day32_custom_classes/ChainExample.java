package day32_custom_classes;

public class ChainExample {

    public ChainExample(){
        System.out.println("first");
    }

    public ChainExample(int a){
        this();
        System.out.println("second");
    }

    public ChainExample(String str){
        this(5);
        System.out.println("third");
    }
}
