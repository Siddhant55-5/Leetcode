class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            product *= nums[i];
            max = Math.max(max,product);
            if(product==0){
                product = 1;
                
            }
        }
        product = 1;
        for(int j = nums.length-1;j>=0;j--){
             product *= nums[j];
              max = Math.max(max,product);
            if(product==0){
                product = 1;
                
            }
        }
        return max;
    }
}