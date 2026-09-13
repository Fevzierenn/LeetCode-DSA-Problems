package N150.LinkedList.MergeTwoSortedLists_002;

public class main {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode sortedHead= Solution.mergeTwoLists(head1, head2);

        while(sortedHead != null){
            System.out.println(sortedHead.val);
            sortedHead = sortedHead.next;
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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = list1.val <= list2.val ? list1 : list2;
        ListNode temp = new ListNode(0);
        while(list1 != null || list2 != null){
            if(list1 == null) {
                temp.next = list2;
                break;
            }
            if(list2 == null) {
                temp.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        return  head;
    }
}
