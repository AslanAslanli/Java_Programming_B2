package day30_a_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class GoodPair {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 8, 5, 6, 7, 10, 18));
        System.out.println(goodPairs(nums));

    }

    public static ArrayList<Integer> goodPairs(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size()-2; i+=2) {
            if (list.get(i) >= list.get(i+1)) {
                newList.add(list.get(i));
                newList.add(list.get(i+1));
            }
        }

        list.retainAll(newList);

        return list;
    }

}
