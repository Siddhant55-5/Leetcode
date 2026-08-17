class Solution {
    public boolean palindHelper(int i,int j,String s){
       
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       int i = 0;
       int j = s.length()-1;
       while(i<j){
        int left = s.charAt(i);
        int right = s.charAt(j);
        if(left != right){
            //super power to delete a element 
           return  palindHelper(i+1,j,s) || palindHelper(i,j-1,s);
        }

       
        i++;
        j--;
       }
       return true;
    }

}