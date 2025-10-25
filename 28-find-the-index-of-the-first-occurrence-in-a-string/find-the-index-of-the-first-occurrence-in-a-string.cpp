class Solution {
public:

    void lpsFind(vector<int> &lps, string s){
      int first = 0, second = 1;

      while(second<s.size()){
        if(s[first]==s[second]){
          lps[second] = first+1;
          first++;
          second++;
        }
        else{
          if(first==0){
            lps[second++]==0;
          }else{
            first = lps[first-1];
          }
        }
      }
    }

    int strStr(string haystack, string needle) {
        vector<int> lps(needle.size(),0);
        lpsFind(lps, needle);

        int first = 0, second = 0;

        while(first<haystack.size() && second<needle.size()){
          if(haystack[first]==needle[second]){
            first++; second++;
          }
          else{
            if(second==0){
              first++;
            }else{
              second = lps[second-1];
            }
          }
        }

        if(second==needle.size()) return first-second;

        return -1;
    }
};