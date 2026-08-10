class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        prefixSum [0]= nums[0];
        int count = 0;
       for(int i = 1;i<nums.length;i++){
        prefixSum[i] =prefixSum[i-1] + nums[i];
       }
       Map<Integer,Integer> map = new HashMap<>();
       for(int j = 0;j<nums.length;j++){
        if(prefixSum[j] == k){
            count++;
        }
        int val = prefixSum[j]-k;
        if(map.containsKey(val)){
            count += map.get(val);
        }
        map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);

       }
       return count;
        
    }
}