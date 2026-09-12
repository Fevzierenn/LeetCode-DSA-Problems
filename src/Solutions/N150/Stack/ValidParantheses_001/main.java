package N150.Stack.ValidParantheses_001;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        System.out.println(Solution.isValid("()"));
        System.out.println(Solution.isValid("()[]{}"));
        System.out.println(Solution.isValid("{([])}"));
        System.out.println(Solution.isValid("(}"));
        System.out.println(Solution.isValid("([)]"));
        System.out.println(Solution.isValid(")]"));
    }
}

class Solution {
    public static boolean isValid(String s) {
        if(s.length() %2 != 0) return false;
        Map<Character,Character> parantheses = Map.of('(',')','[',']','{','}');
        char[] chars =s.toCharArray();
        Stack<Character> stack = new Stack();
        for(int i = 0 ; i<chars.length;i++){
            if(parantheses.containsKey(chars[i]))
                stack.push(chars[i]);
            else{
                if(stack.empty()) return false;
                Character value = stack.peek();
                if(parantheses.get(value) == chars[i]) stack.pop();
                else
                    return false;
            }
        }
        return stack.empty();
    }
}