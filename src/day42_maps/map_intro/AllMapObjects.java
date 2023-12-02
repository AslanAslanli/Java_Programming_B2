package day42_maps.map_intro;

import javax.crypto.MacSpi;
import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("feyruz", "java");
        map.put("hello", "world");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);

        Map<String, String> linkedHash = new LinkedHashMap<>();
        linkedHash.put("feyruz", "java");
        linkedHash.put("hello", "world");
        linkedHash.put("nadir", "soft skills");
        linkedHash.put("username", "password");
        linkedHash.put(null, "nothing");

        System.out.println(linkedHash);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("feyruz", "java");
        treeMap.put("hello", "world");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
        //treeMap.put(null, "nothing");

        System.out.println(treeMap);
//////////////////////////////////////////////////////////////
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("feyruz", "java");
        hashtable.put("hello", "world");
        hashtable.put("nadir", "soft skills");
        hashtable.put("username", "password");
        //treeMap.put(null, "nothing");

        System.out.println(hashtable);




    }
}
