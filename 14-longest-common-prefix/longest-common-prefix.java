class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        
        String firstStr = strs[0];
        for(int i=0;i<firstStr.length();i++){
            char current = firstStr.charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=current){
                    return firstStr.substring(0,i);
                }
            }
        }

        return firstStr;
    }
}