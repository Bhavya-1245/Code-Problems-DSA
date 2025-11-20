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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode temp = swapPairs(head.next.next);
        ListNode temp1 = head;
        head.next.next = temp1;
        head = temp1.next;
        temp1.next = temp;
        

        return head; 
        

    }

    
}