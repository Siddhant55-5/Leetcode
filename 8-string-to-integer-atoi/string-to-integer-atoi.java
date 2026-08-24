class Solution {
    public int myAtoi(String s) {
        int a  = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        s = s.trim();
        if (s.length() == 0) {
    return 0;
}
        int i =0;
        int sign = 1;
        int num =0;
        if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(num > (Integer.MAX_VALUE-digit)/10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                
                }else{
                    return Integer.MIN_VALUE;
                }
            }
             num = num*10 + digit;
             i++;
        }
      return num*sign;
        }
      
    }
