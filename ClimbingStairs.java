import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;

        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(fib(n,memo));
    }
    static int fib(int n, int[] memo){
        if(n<0) return 0;
        if(n<=1) {
            memo[n]=1;
            return 1;
        }
        if(memo[n]!=-1) return memo[n];
        memo[n] = fib(n-1,memo) + fib(n-2,memo);
        return memo[n];
    }
}
