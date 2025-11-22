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
        ListNode add = new ListNode(-1);
        ListNode res = add;

        add(l1, l2, res, 0, 0);

        return add.next;
    }

    public static void add(ListNode l1, ListNode l2, ListNode res, int carry, int sum){
      if(!(l1!=null || l2 != null || carry != 0)) return;

      if(l1!=null){
        sum = sum + l1.val;
        l1 = l1.next;
      }
      if(l2 != null){
        sum = sum + l2.val;
        l2 = l2.next;
      }

      res.next = new ListNode(sum%10);
      add(l1, l2, res.next, sum/10, sum/10);
    }
}