/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;

        ListNode mid = middle(head, head);

        ListNode revList = reverse(mid);

        return palin(head, revList);
    }

    public static ListNode middle(ListNode slow, ListNode fast){
      // if(fast==null) return slow;
      if(fast==null || fast.next==null) return slow;
      return middle(slow.next, fast.next.next);
    }

    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode new_head = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return new_head;
    }

    public static boolean palin(ListNode head1, ListNode head2){
      if(head2==null) return true;
      if(head1 == null) return false;
      if(head1.val!=head2.val) return false;

      return palin(head1.next, head2.next);
    }

    
}