class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char right = s.charAt(i);
            char left = s.charAt(j);
            if(!Character.isLetterOrDigit(right)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(left)){
                j--;
                 continue;
             }
             if(Character.toLowerCase(right) != Character.toLowerCase(left) ){
                return false;
             }
             i++;
             j--;

    }
    return true;
}
}