class Solution {
    public boolean checkIfPangram(String sentence) {
        

        for(int i = 0; i<26;i++){
            char c = (char)(97+i);
            if(sentence.indexOf(c)==-1) return false;
        }
        return true;
    }
}