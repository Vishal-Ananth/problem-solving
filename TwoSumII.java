public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers={-1,0};
        int target=-1;
        int[] result=twoSum(numbers,target);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        for(;numbers[right]>target;right--);

        while(left<right+1){
            if(numbers[left]+numbers[right]!=target){
                left++;
            }else{
                break;
            }
        }

        return new int[] {left+1,right+1};
    }
}
