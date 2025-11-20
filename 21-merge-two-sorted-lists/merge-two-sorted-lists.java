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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1== null) return list2;
        if(list2== null) return list1;

        ListNode newNode = new ListNode(-1);
        ListNode curr = newNode;

        merge(list1, list2, curr);
        return newNode.next;
    }

    public static void merge(ListNode l1, ListNode l2, ListNode curr){
      if(l1!=null && l2!=null){
        if(l1.val<=l2.val){
          curr.next = l1;
          merge(l1.next, l2, curr.next);

        }else{
          curr.next = l2;
          merge(l1, l2.next, curr.next);
        }
      }else if(l1!=null){
        curr.next = l1;
      }else if(l2!=null){
        curr.next = l2;
      }
    }

    
}