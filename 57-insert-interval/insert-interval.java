class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;

        ArrayList<int[]> arr=new ArrayList<>();

        int i=0;
        
        while(i<n && newInterval[0]>intervals[i][1]){
            arr.add(intervals[i++]);
        }

        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        arr.add(newInterval);

        while(i<n){
            arr.add(intervals[i++]);
        }
        
        int [][]res=new int[arr.size()][2];
        for(int j=0; j<arr.size(); j++){
            res[j]=arr.get(j);
        }

        return res;
    }
}