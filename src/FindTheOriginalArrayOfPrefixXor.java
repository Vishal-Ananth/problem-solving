package src;
public class FindTheOriginalArrayOfPrefixXor {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        int[] ans = findArray(pref);
        for(int i:ans){
            System.out.println(i);
        }
    }

    public static int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0]=pref[0];
        for(int i=1; i< res.length; i++){
            res[i]=pref[i-1]^pref[i];
        }

        return res;
    }
}
