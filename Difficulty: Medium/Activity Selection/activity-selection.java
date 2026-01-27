class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int end = -1;
        int n = start.length;
        int [][]act = new int[n][2];
        for(int i=0;i<n;i++){
            act[i][0] = start[i];
            act[i][1] = finish[i];
        }
        
        Arrays.sort(act, (a,b)->(a[1]-b[1]));
        end = act[0][1];
        int count = 1;
        for(int i=0;i<n;i++){
            if(end<act[i][0]){
                count++;
                end = act[i][1];
            }
        }
        
        return count;
    }
}
