class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.size()==0 || st.size()==1) return;
        
        int top = st.pop();
        sortStack(st);
        insert(st, top);
    }
    
    public static void insert(Stack<Integer> st, int t){
        if(st.size()==0 || t>=st.peek() ){
            st.push(t);
            return;
        }
        
        int top = st.pop();
        insert(st, t);
        st.push(top);
    }
}