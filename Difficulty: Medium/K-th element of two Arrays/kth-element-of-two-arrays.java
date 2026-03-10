class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length, m = b.length;
        int i = 0, j = 0;
        int idx = 0;
        while(i<n && j<m){
            idx++;
            if(a[i]<b[j]){
                if(idx == k) return a[i];
                i++;
            }else{
                if(idx == k) return b[j];
                j++;
                
            }
            
        }
        
        while(i<n && idx!=k){
            idx++;
            if(idx==k) return a[i];
            i++;
        }
        while(j<m && idx!=k){
            idx++;
            if(idx==k) return b[j];
            j++;
        }
        
        return -1;
    }
}