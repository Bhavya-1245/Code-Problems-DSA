class Solution {
    
    static void helper(HashSet<String> ans,String s, String curr){
        if(s.length()==0){
            ans.add(curr);
            return;
        }
        // String 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            String l = s.substring(0,i);
            String r = s.substring(i+1);
            
            helper(ans, l+r, curr+ch);
            
           
        }
        
        return;
        
    }
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        if(s.length()==0) return new ArrayList<>();
        
        ArrayList<String> ans = new ArrayList<String>();
        HashSet<String> str = new HashSet<>();
        
        helper(str, s, "");
        ans.addAll(str);
        return ans;
    }
}