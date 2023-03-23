package BTH1_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //HasMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("The Anh", 20);
        hashMap.put("Anh Khoa", 23);
        hashMap.put("Thang Xoai", 21);
        hashMap.put("Minh Kun", 30);
        System.out.println("Display entries in HasMap");
        System.out.println(hashMap + "\n");
        //TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //LinkedHasMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("The Anh",20);
        linkedHashMap.put("Anh Khoa",23);
        linkedHashMap.put("Thang Xoai", 21);
        linkedHashMap.put("Minh Kun", 30);
        System.out.println("\nThe age for "+"The Anh "+ linkedHashMap.get("The Anh"));
        System.out.println("\nThe age for "+"Anh Khoa "+ linkedHashMap.get("Anh Khoa"));
        System.out.println("\nThe age for "+"Thang Xoai "+ linkedHashMap.get("Thang Xoai"));
        System.out.println("\nThe age for "+"Minh Kun "+ linkedHashMap.get("Minh Kun"));
    }
}