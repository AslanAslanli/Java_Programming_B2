package day36_inheritance.finalExample;

public final class UseFinalExample{
    public static void main(String[] args) {
        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.a);

        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        System.out.println();
        System.out.println(FinalExample.PLANET);
        //FinalExample.planet = "Mars";


    }




}
