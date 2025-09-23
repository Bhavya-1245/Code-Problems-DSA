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
        if(head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode rev = reverse(slow.next);
        slow.next = null;

        while(head!=null && rev!=null){
            if(head.val!=rev.val) return false;
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
           curr = temp;
        }

        return prev;
    }

    
}