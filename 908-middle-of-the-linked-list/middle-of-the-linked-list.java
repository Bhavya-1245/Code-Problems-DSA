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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        if(n==1) return head;
        n = (n%2==0)?(n/2)+1:(n+1)/2;

        int i = 0;

        temp = head;

        n--;

        while(n>1 && temp.next!=null){
            n--;
            
            temp = temp.next;
        }

        return temp.next;
    }
}