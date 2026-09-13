package N150.Stack.EvaluateReversePolishNotation_003;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
//        System.out.println(Solution.evalRPN(new String[] {"2","1","+","3","*"}));
//        System.out.println(Solution.evalRPN(new String[]{"4","13","5","/","+"}));
//        System.out.println(Solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
        System.out.println(Solution.evalRPN(new String[] {"4","3","-"}));

    }
}
class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<tokens.length;i++){
            switch (tokens[i]){
                case "+" ->  stack.push(stack.pop() + stack.pop());
                case "-" ->  {
                    int topF = stack.pop();
                    int topS = stack.pop();
                    stack.push(topS-topF);
                }
                case "*" ->  stack.push(stack.pop() * stack.pop());
                case "/" ->  {
                    int topF = stack.pop();
                    int topS = stack.pop();
                    stack.push(topS/topF);
                }
                default ->  stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}