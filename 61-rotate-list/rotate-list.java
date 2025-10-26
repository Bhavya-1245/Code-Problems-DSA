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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        if(head == null) return head;
        while(temp!=null){
          count++;
          temp = temp.next;
        }
        k %= count;
        if(k==0) return head;
        count -= k;
        if(count==0) return head;
        ListNode curr = head, prev = null;
        while(count-->0){
          prev = curr;
          curr = curr.next;
        }

        prev.next = null;

        temp = curr;

        while(temp.next!=null){
          temp = temp.next;
        }

        temp.next = head;

        return curr;
    }
}