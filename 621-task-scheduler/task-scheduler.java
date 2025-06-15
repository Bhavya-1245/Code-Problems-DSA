class Solution {
    public int leastInterval(char[] tasks, int n) {
        int N=tasks.length;
        int count=0;
        int freq[]=new int[26];

        for(char c: tasks){
            freq[c-'A']++;
            count=Math.max(count,freq[c-'A']);
        }

        int ans=(count-1)*(n+1);

        for(int i:freq){
            if(i==count) ans++;
        }

        return ans>N?ans:N;
    }
}