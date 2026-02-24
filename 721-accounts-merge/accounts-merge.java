class Solution {
  static int n;
  static int[] par, size;

  static int find(int x){
    if(x == par[x]) return x;
    return par[x] = find(par[x]);
  }

  static void unionBySize(int u, int v){
    int ulp_u = find(u);
    int ulp_v = find(v);

    if(ulp_u == ulp_v) return;
    if(size[ulp_v]> size[ulp_u]){
      par[ulp_u] = ulp_v;
      size[ulp_v] += size[ulp_u];
    }else{
      par[ulp_v] = ulp_u;
      size[ulp_u] += size[ulp_v];
    }
  }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        n = accounts.size();
        Map<String, Integer> map = new HashMap<>();
        par = new int[n+1];
        size = new int[n+1];

        for(int i=0;i<=n;i++){
          par[i] = i;
          size[i] = 1;
        }
        for(int i=0;i<n;i++){
          for(int j=1;j<accounts.get(i).size();j++){
            String mail = accounts.get(i).get(j);

            if(!map.containsKey(mail)){
              map.put(mail, i);
            }else{
              unionBySize(i, map.get(mail));
            }
          }
        }
        List<List<String>> res = new ArrayList<>();
        // ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<ArrayList<String>> mails = new ArrayList<>();
        for(int i=0;i<n;i++) mails.add(new ArrayList<>());

        for(Map.Entry<String,Integer> e:map.entrySet()){
          String s = e.getKey();
          int idx = find(e.getValue());
          mails.get(idx).add(s);
        }
        
        for(int i=0;i<n;i++){
          if(mails.get(i).isEmpty()) continue;
          Collections.sort(mails.get(i), (a,b)->a.compareTo(b));
          ArrayList<String> temp = new ArrayList<>();
          temp.add(accounts.get(i).get(0));
          for(String s:mails.get(i)) temp.add(s);
          res.add(temp);
        }

        return res;
    }
}