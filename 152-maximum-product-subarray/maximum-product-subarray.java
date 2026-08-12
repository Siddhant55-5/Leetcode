class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
         int max = nums[0];
         int ans = nums[0];
        for(int i= 1 ; i<nums.length;i++){
            int num = nums[i];
            int tempmax = max;
            max = Math.max(num,Math.max(max*num,min*num));
            min = Math.min(num,Math.min(min*num,tempmax*num));
            ans = Math.max(max,ans);
        }
        return ans ;
    }
}