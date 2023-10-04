import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {-2,-2,17,1,1,12,12,33,33,7,7};
        int x=0;
        for(int n:nums){
            x=x^n;
            System.out.println(x);
        }

    }
}
