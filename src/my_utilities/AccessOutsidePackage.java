package my_utilities;

import day33_b_encapsulation.access_modifier.AccessModifier;

public class AccessOutsidePackage {

    /**
     *  in a dif package and a dif class
     */

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a); // Can Access
        //System.out.println(obj.b); // Can Not Access
        //System.out.println(obj.c); // Can Not Access

        System.out.println(AccessModifier.x); // Can Access
        //System.out.println(AccessModifier.y); // Can Not Access
        //System.out.println(AccessModifier.z); // Can Not Access




    }




}
