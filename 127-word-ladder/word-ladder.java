class Solution {
    // static int n;
    static class Pair{
          String str;
          int cnt;
          Pair(String str, int cnt){
            this.str = str; this.cnt = cnt;
          }
        }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        
        int n = wordList.size();
        int idx = -1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        HashSet<String> dict = new HashSet<>(wordList);
        // visited.add(beginWord);
        StringBuilder sb;
        while(!q.isEmpty()){
          Pair p = q.poll();
          String str = p.str;
          int cnt = p.cnt;

          if(str.equals(endWord)) return cnt;

          char[] arr = str.toCharArray();
          for(int i=0;i<str.length();i++){
            char org = arr[i];
            for(char ch = 'a'; ch<='z'; ch++){
              arr[i] = ch;
              String s = new String(arr);
              if(dict.contains(s)){
                q.add(new Pair(s, cnt+1));
                dict.remove(s);
              }
            }
            arr[i] = org;
          }
        }
      return 0;
    }
}