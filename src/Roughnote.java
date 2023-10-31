package src;

import java.util.*;

public class Roughnote {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr ={1,2,2,1,1,3,2};
        for(int i:arr){
            map.put(i,map.getOrDefault(i,1)+1);
        }
        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        for(Integer i: map.values()){
            if(set.contains(i)){
                System.out.println("False");
                return;
            }
            set.add(i);
        }
        System.out.println(set);
        System.out.println("True");
    }

}
