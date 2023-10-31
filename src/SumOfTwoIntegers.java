package src;

public class SumOfTwoIntegers {
    //Given two integers a and b,
    // return the sum of the two integers
    // without using the operators + and -.
    public static void main(String[] args) {
        int a=100,b=-123;
        System.out.println(a^b);
//        System.out.println(a&b);
        System.out.println((a&b)<<1);
        System.out.println("******");
        System.out.println(a+b );
        System.out.println((a^b)+((a&b)<<1));
    }
}
