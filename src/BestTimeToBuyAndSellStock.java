package src;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int overall=0;

        int left=Integer.MAX_VALUE;

        for(int i:prices){
            if(i<left){
                left=i;
            }
            if(overall<left-i){
                overall=left-i;
            }

        }
        return overall;
    }
}
