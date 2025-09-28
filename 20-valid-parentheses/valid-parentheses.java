class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);

            if(x=='[' || x=='{' || x=='(') st.push(x);

            else{
                if(st.isEmpty()) return false;
                char y = st.pop();

                if(!matched(x, y)) return false;
            }
        }

        if(st.isEmpty()) return true;
        return false;
    }

    public static boolean matched(char x, char y){
        if(x == ')' && y == '(') return true;
        if(x == '}' && y == '{') return true;
        if(x == ']' && y == '[') return true;

        return false;
    }
}