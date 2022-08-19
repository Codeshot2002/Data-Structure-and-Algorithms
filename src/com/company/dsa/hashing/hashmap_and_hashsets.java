package com.company.dsa.hashing;

import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class hashmap_and_hashsets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        map.put(1,"Umang");
        map.put(2,"Ipsit");
        map.put(3,"Rashmi");
        map.put(4,"Manoj");
        System.out.println(map);
        System.out.println(map.containsValue("Umang"));
        System.out.println(map.size());
        System.out.println(map.get(2));
        int[] arr = {1,2,3,4,5,1,3,2,1};
        for(Integer a:arr){
            hashSet.add(a);
        }
        System.out.println(hashSet);
        //Traversing through hashset using iterator
        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //for each loop for hashmap
        for(Map.Entry<Integer,String> a:map.entrySet()){
            System.out.print(a.getKey() + " ");
            System.out.print(a.getValue());
            System.out.println();
        }
        Set<Integer> keys = map.keySet();
        for(Integer a : keys){
            System.out.print(a);
            System.out.print("-->" + map.get(a));
            System.out.println();
        }
    }
}
