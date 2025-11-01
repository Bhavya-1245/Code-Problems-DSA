class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.length()==0) return 0;

        ArrayList<String> arr = new ArrayList<>();
        String str = "";

        for(int i=0; i<s.length(); i++){
          char x = s.charAt(i);
          if(x==' '){
            if(str.length()==0) continue;
            arr.add(str);
            str = "";
          }
          else{
            str = str + x;
          }
          if(i==s.length()-1){
            if(str.length()==0) continue;
            arr.add(str);
            str = "";
          }
        }

        return arr.size();
    }
}