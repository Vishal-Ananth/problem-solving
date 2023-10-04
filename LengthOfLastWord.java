public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="  a  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int index=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i-1)==' '&&s.charAt(i)!=' '){
                index=i;
                break;
            }
        }
        return s.substring(index).trim().length();
    }
}
