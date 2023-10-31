package src;

import java.util.HashMap;

public class FindTheTwoNumbers {
    /*
     * Given a list of numbers and a number k,
     * return whether any two numbers from the list
     * gives the product as k.
     */
    public static void main(String[] args) {
        int[] nums= {10,5,7,6};
        int k=35;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            System.out.println(map);
            if(map.containsKey(k/nums[i])){
                System.out.println("["+nums[map.get(k/nums[i])]+","+nums[i]+"]" );
                break;
            }else{
                map.put(nums[i],i);
            }
        }
    }
}
