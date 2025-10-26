/*
class Node {
   public:
    int data;
    Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
} */

class Solution {
  public:
    bool detectLoop(Node* head) {
        // code here
        unordered_map<Node*, bool> map;
        Node* temp = head;
        
        while(temp){
            if(map[temp]==1) return 1;
            else map[temp]=1;
            temp = temp->next;
        }
        
        return 0;
    }
};