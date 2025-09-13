class Solution {
    public int maxFreqSum(String s) {
        int vow_count = 0, cons_count = 0;
        int[] ch =new int[26];
        
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            ch[x-'a']++;
            
        }

        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20) vow_count=Math.max(vow_count,ch[i]);
            else cons_count=Math.max(cons_count,ch[i]);
        }
        return vow_count + cons_count;
    }
}