package N150.Stack.MinStack_002;


/*
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */

import java.util.*;

public class main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(2147483647);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.push(-2147483648);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

    }
}
class MinStack {
    Stack<Integer> stackMain;
    Stack<Integer> stackMin;

    public MinStack(){
        this.stackMain = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public void push(int value) {
        stackMain.push(value);
        if (stackMin.isEmpty() || stackMin.peek() >= value) {
            stackMin.push(value);
        }
    }

    public void pop()    {
        if(stackMain.isEmpty()) return;
        if(stackMin.peek().equals(stackMain.peek())) {
            stackMain.pop();
            stackMin.pop();
        }
        else
            stackMain.pop();


    }
    public int  top()    { return stackMain.peek(); }
    public int  getMin() { return stackMin.peek(); }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//
//class MinStack {
//    Stack<Integer> stack;
//
//    public MinStack() {
//        this.stack = new Stack<Integer>();
//        this.queue = new PriorityQueue<>();
//    }
//
//    public void push(int value) {
//        this.stack.push(value);
//        this.queue.offer(value);
//    }
//
//    public void pop() {
//        int value = this.stack.pop();
//        this.queue.remove(value);
//    }
//
//    public int top() {
//        return this.stack.peek();
//    }
//
//    public int getMin() {
//        return this.queue.peek();
//    }
//}






//
//class MinStack {
//    int topI;
//    int[] values;
//    public MinStack() {
//        this.values = new int[30000];
//        this.topI=-1;
//    }
//
//    public void push(int value) {
//        this.topI++;
//        this.values[topI] = value;
//    }
//
//    public void pop() {
//        this.values[topI] = 0;
//        this.topI--;
//    }
//
//    public int top() {
//        return this.values[topI];
//    }
//
//    public int getMin() {
//        //int[] sortedArr = this.values;
//        //Arrays.sort(sortedArr);
//        return Arrays.stream(this.values)
//                .filter(m -> m != 0)
//                .min()
//                .orElse(0);
//    }
//}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */