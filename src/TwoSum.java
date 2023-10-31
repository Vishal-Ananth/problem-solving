package src;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        System.out.println(res[0]+","+res[1]);
    }
}
