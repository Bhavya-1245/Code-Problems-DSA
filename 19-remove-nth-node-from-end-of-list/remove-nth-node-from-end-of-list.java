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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next == null) return head.next;
        if(head == null) return head;
       
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }

        size = size - n;

        if(size == 0) return head.next;

        temp = head;
        for(int i = 0; i< size - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
        
    }
}