class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        if(start.length != end.length) return -1;
        int count=0;
        
        int i=0, n=start.length;
        sort(start, end, n);
        int end_time=-2;
        while(i<n){
            if(start[i]>end_time) 
            {
                count++;
                end_time=end[i];
            }
            i++;
            
        }
        
        return count;
    }
    
    public static void sort(int []a, int []b, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j]>b[j+1]){
                    int temp1=b[j], temp2=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;
                    b[j]=b[j+1];
                    b[j+1]=temp1;
                }
            }
        }
    }
}
