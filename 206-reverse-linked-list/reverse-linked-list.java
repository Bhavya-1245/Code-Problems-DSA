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
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null) return head;

      ListNode new_head = reverseList(head.next);
      head.next.next = head;
      head.next = null;
      return new_head;
    }

    // public static ListNode reverse(ListNode head, ListNode curr, ListNode prev){
    //   if(curr==null) return prev;

    //   curr = curr.next;
    //   head.next = prev;
    //   return reverse(curr, curr, head);
    // }
}