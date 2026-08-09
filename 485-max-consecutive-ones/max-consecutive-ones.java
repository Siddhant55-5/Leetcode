class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen = 0;
        int left = 0;
         for (int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
               left = right+1;
            }
            maxlen = Math.max(maxlen,right-left+1);
         }
         return maxlen;
    }
}