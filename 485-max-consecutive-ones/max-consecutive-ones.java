class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxlen = 0;

        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 1){
                
                count++;
                maxlen = Math.max(count,maxlen);
            }else{
                count= 0;
            }
        }
        return maxlen;
    }
}