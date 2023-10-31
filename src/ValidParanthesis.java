package src;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="()";

        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='{'|| c=='(' || c=='['){
                stack.push(c);
            }else if(!stack.isEmpty() && stack.peek()==map.get(c)){
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty());
    }
}
