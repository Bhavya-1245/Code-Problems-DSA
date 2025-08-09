class Solution {
    public boolean checkIfPangram(String sentence) {
        char []alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i = 0; i<alpha.length;i++){
            char c = alpha[i];
            if(sentence.indexOf(c)==-1) return false;
        }
        return true;
    }
}