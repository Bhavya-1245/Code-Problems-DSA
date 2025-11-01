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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> arr = new HashSet<>();
        for(int i:nums) arr.add(i);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode curr = head;

        while(curr!=null){
          if(!arr.contains(curr.val)){
            temp.next = curr;
            temp = temp.next;
            
          }
          curr = curr.next;
        }
        temp.next = null;
        return dummy.next;
    }
}