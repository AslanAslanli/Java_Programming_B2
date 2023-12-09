package day33_b_encapsulation.access_modifier;

public class AccessingPackage {
    public static void main(String[] args) {
    /**
    * In the same package but different class
    */

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a); // Can Access
        System.out.println(obj.b); // Can Access
        //System.out.println(obj.c); // Can Not Access

        System.out.println(AccessModifier.x); // Can Access
        System.out.println(AccessModifier.y); // Can Access
        //System.out.println(AccessModifier.z); // Can Not Access

    /**
    *   c and z are not accessible from another class as they are private
    */


    }








}
