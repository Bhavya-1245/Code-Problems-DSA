/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public static int len(ListNode head){
      int size = 0;
      while(head!=null){
        size++;
        head = head.next;
      }

      return size;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = len(headA), sizeB = len(headB);
        
        while(sizeA<sizeB){
          headB = headB.next;
          sizeB--;
        }
        while(sizeB<sizeA){
          headA = headA.next;
          sizeA--;
        }

        while(headA!=null && headB!=null){
          if(headA == headB) return headA;
          headA = headA.next;
          headB = headB.next;
        }

        return null;
    }


}