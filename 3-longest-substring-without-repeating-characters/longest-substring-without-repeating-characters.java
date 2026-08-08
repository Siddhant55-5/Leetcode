class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;

        for (int right =0 ; right< s.length();right++){

            while(set.contains(s.charAt(right))){//Sees if the character is present or not the same char 
                set.remove(s.charAt(left));// if present than removes the right char
                left++; 
            }
            set.add(s.charAt(right)); // if not present add further
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}