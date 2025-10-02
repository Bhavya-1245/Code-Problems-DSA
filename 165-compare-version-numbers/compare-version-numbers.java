class Solution {
    public int compareVersion(String version1, String version2) {
        

        String []revision1 = version1.split("\\.");
        String []revision2 = version2.split("\\.");

        int maxLen = Math.max(revision1.length, revision2.length);

        for(int i = 0; i<maxLen; i++){
            int v1 = 0;
            if(i<revision1.length) v1 = Integer.parseInt(revision1[i]);
            
            int v2 = 0;
            if(i<revision2.length) v2 = Integer.parseInt(revision2[i]);

            if(v1<v2) return -1;
            else if(v1>v2) return 1;
        }

        return 0;
    }
}