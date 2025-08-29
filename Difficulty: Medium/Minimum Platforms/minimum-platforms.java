class Solution {
    public int findPlatform(int arr[], int dep[]) {
        //  code here
        int plat = 1;
        int res=1;
        int n = arr.length;
        
       Arrays.sort(arr);
       Arrays.sort(dep);
        
        int i=1,j=0;
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
                
            }
            else{
                plat--;
                j++;
                
            }
            res=Math.max(res,plat);
        }
        
        return res;
    }
    
    
    
    
}
