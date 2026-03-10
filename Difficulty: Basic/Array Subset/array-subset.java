
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int n = a.length, m = b.length;
        for(int i=0; i<n; i++){
            map1.put(a[i], map1.getOrDefault(a[i], 0) + 1);
        }
        for(int i=0; i<m; i++){
            map2.put(b[i], map2.getOrDefault(b[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> e: map2.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            if(!map1.containsKey(key) || val>map1.get(key)) return false;
        }
        
        return true;
    }
}
