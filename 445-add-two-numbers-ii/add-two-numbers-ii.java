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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;

        while(list1!=null || list2!=null || carry !=0){
            int sum = carry;

            if(list1!=null){
                sum += list1.val;
                list1 = list1.next;
            }

            if(list2!=null){
                sum +=list2.val;
                list2 = list2.next;
            }

            carry = sum/10;

            int value = sum%10;

            ListNode d = new ListNode(value);
            temp.next = d;
            temp = temp.next;
        }

        return reverse(dummy.next);
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            curr = curr.next;
            head.next = prev;
            prev = head;
            head = curr;
        }

        return prev;
    }
}