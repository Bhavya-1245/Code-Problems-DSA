/* Node is defined as
  class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
};
*/
class Solution {
  public:
    Node* segregate(Node* head) {
        // code here
        Node* temp = head;
        int count_0 = 0, count_1 = 0, count_2 = 0;
        
        while(temp){
            if(temp->data==0) count_0++;
            if(temp->data==1) count_1++;
            if(temp->data==2) count_2++;
            temp = temp->next;
        }
        temp = head;
        while(count_0--){
            temp->data = 0;
            temp = temp->next;
        }
        while(count_1--){
            temp->data = 1;
            temp = temp->next;
        }
        while(count_2--){
            temp->data = 2;
            temp = temp->next;
        }
        
        return head;
        
    }
};