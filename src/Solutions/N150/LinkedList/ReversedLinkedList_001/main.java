package N150.LinkedList.ReversedLinkedList_001;

import java.util.List;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode index = head;
        for(int i=2; i<5; i++){
            index.next = new ListNode(i);
            index = index.next;
        }
       ListNode reversedHead=Solution.reverseList(head);
        while(reversedHead != null){
            System.out.println(reversedHead.val);
            reversedHead = reversedHead.next;
        }
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode temp = head.next;
        head.next = null;
        while(temp != null){
            ListNode nextTemp= temp.next;
            temp.next = head;
            head = temp;
            temp = nextTemp;
        }
        return head;
    }
}

//public static ListNode reverseList(ListNode head) {
//    if(head == null) return null;
//    Stack<ListNode> stack = new Stack<>();
//    while(head != null){
//        stack.push(head);
//        head = head.next;
//    }
//    ListNode headNew = stack.pop();
//    ListNode temp = headNew;
//    while(!stack.isEmpty()){
//        temp.next= stack.pop();
//        temp = temp.next;
//    }
//    temp.next = null;
//    return headNew;
//}