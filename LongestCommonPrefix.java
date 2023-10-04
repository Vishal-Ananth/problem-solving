import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];
        int i=0;
        while(i<s1.length()&&i<s2.length()&&s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        //String res=(.equals(""))?"\"\"":s1.substring(0,i);
        System.out.println(s1.substring(0, i));
    }
}
