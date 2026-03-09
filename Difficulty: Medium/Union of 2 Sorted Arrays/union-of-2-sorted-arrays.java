class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> set = new TreeSet<>();
        
        // int i=0;
        for(int i=0;i<a.length;i++) set.add(a[i]);
        for(int i=0;i<b.length;i++) set.add(b[i]);
        
        return new ArrayList<>(set);
    }
}
