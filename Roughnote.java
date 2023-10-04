import java.util.*;

public class Roughnote {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums ={1,2,3,1,4};
        for(int i:nums){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
