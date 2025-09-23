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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return mergeTwoLists(left, right);

        
    }

    public static ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode mergeTwoLists(ListNode left, ListNode right){
        ListNode temp = new ListNode(-1);
        ListNode curr = temp;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next = left;
                curr = curr.next;
                left = left.next;
            }else{
                curr.next = right;
                curr = curr.next;
                right = right.next;
            }
        }

        if(left!=null) curr.next = left;
        else curr.next = right;

        return temp.next;
    }
}