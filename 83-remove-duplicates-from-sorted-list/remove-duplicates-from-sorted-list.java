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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        if(head == null) return head;

        while(temp.next!=null && temp!=null){
            if(temp.next.val == temp.val){
                
                temp.next = temp.next.next;
            }
            
            else temp = temp.next;
        }

        return head;

    }
}