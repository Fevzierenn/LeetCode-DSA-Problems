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

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(31);
        stack.push(41);
        stack.push(51);
        stack.pop();
        System.out.println(stack.getMin());

    }
}
class MinStack {
    private final int[] values = new int[30000];
    private final int[] mins   = new int[30000];
    private int top = -1;

    public void push(int value) {
        top++;
        values[top] = value;
        mins[top] = (top == 0) ? value : Math.min(value, mins[top - 1]);
    }

    public void pop()    { top--; }
    public int  top()    { return values[top]; }
    public int  getMin() { return mins[top]; }
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