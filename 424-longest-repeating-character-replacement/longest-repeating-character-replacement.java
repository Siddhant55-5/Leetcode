class Solution {
    public int characterReplacement(String s, int k) {
        int[] frq  = new int[26];
        int maxFreq = 0;
            int left = 0;
            int maxlen = 0;
        for(int right=0;right<s.length();right++){
            int index = s.charAt(right)-'A';
            frq[index]++;
            
           maxFreq =   Math.max(maxFreq,frq[index]);
            
            while((right-left+1)-maxFreq>k){
                int indexx= s.charAt(left)-'A';
                frq[indexx]--;
                left++;
            }
        maxlen = Math.max(right-left+1,maxlen);
        }
        return maxlen;
    }

}