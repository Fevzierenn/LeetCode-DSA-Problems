package N150.LinkedList.LinkedListCycle_003;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(Solution.hasCycle(head));
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 class Solution {
     public static boolean hasCycle(ListNode head) {
         ListNode slow  = head;
         ListNode fast = head;
         while (fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
             if(slow == fast) return true;
         }
         return false;
     }




    public static boolean hasCycle2(ListNode head) {
        int counter =1;
        HashSet<Integer> set = new HashSet<>();
        Boolean isCycle = true;
        while(head != null && isCycle)
        {
            isCycle = set.add(head.hashCode());
            head= head.next;
        }
        return !isCycle;
    }
}