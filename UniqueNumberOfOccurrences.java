import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        //int[] arr = {1,2,2,1,1,3};
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,1)+1);
        }

        for(Integer i: map.values()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}
