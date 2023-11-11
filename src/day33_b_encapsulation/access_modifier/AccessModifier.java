package day33_b_encapsulation.access_modifier;

public class AccessModifier {

    public int a; // public access modifier
    int b; // default access modifier
    private int c; // private access modifier


    public static int x;
    static  int y;
    private static int z;


    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a); // Can Access
        System.out.println(obj.b); // Can Access
        System.out.println(obj.c); // Can Access

        System.out.println(AccessModifier.x); // Can Access
        System.out.println(AccessModifier.z); // Can Access
        System.out.println(AccessModifier.y); // Can Access

    }








}
