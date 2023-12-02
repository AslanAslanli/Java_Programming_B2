package day42_maps.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLoop {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 12, 35, 6, 2, 5, 6));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)<5){
//                list.remove(i);
//                i--;
//            }
//        }

//        for (Integer each : list) {
//            if (each<5)
//                list.remove(each);
//        }

//        Iterator <Integer> it = list.iterator();
//        while (it.hasNext()){
//            if (it.next()<5){
//                it.remove();
//            }
//        }
//        System.out.println(list);

        list.removeIf(each -> each<5);
        System.out.println(list);


    }
}
