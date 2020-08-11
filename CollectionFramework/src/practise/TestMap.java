package practise;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Smith",30);
        hasMap.put("Anderson",31);
        hasMap.put("Lewis",29);
        hasMap.put("Dick",29);
        System.out.println("Entry hashmap");
        System.out.println(hasMap+"\n");
        Map<String,Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("display entries in ascending order of key: ");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
