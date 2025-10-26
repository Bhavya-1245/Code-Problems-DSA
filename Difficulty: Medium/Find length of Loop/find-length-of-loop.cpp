/*
class Node {
 public:
    int data;
    Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};
*/

class Solution {
  public:
    int lengthOfLoop(Node *head) {
        // code here
        Node* temp = head;
        Node* temp1 = head;
        bool loop = 0;
        while(temp1 != NULL && temp1->next != NULL){
            
            temp1 = temp1->next->next;
            temp = temp->next;
            
            if(temp1==temp) break;
        }
        
        if(temp1==NULL || temp1->next==NULL) return 0;
        temp = temp1->next;
        int len = 1;
        while(temp!=temp1){
            len++;
            temp = temp->next;
        }
        
        return len;
    }
};