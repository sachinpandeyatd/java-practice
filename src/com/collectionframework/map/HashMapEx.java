package com.collectionframework.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 10);
        map.put("2", 20);
        map.put("8", 40);
        map.put("3", 60);
        map.put("4", 50);
        map.put("6", 30);

//        Set<Integer> keySet = new HashSet<Integer>(map.keySet());
//        for (Integer key : keySet){
//            System.out.println(key + " -> " + map.get(key));
//        }

        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }

        System.out.println(map);
    }
}
