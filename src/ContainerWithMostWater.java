package src;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int currentWidth=height.length-1;
        int maximumArea=Integer.MIN_VALUE;
        while(left<right){
            int area;
            if(height[left]<height[right]){
                area=height[left]*currentWidth;
                left++;
            }else{
                area=height[right]*currentWidth;
                right--;
            }
            if(area>maximumArea){
                maximumArea=area;
            }
            currentWidth--;

        }
        return maximumArea;
    }
}
