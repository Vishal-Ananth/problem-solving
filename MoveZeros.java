public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int i=0;
        for(int n:nums){
            if(n!=0){
                nums[i]=n;
                i++;
            }
        }
        while (i< nums.length){
            nums[i]=0;
            i++;
        }
        for(int n:nums){
            System.out.println(n);
        }
    }
}
