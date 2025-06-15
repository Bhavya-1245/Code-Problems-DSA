class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1], b[1]));

        int n=intervals.length;

        ArrayList<int[]> arr=new ArrayList<>();
        arr.add(intervals[0]);
        int val=intervals[0][1];
        int count=0;
        for(int i=0; i<n-1; i++){
            if(val<=intervals[i+1][0]){
                val=intervals[i+1][1];
            }else{
                count++;
            }
        }

        return count;
    }
}