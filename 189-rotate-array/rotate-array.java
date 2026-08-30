class Solution {
    public void rotate(int[] nums, int k) {
         k = k%nums.length;
        //revere the entire array
      int i = 0;
      int j = nums.length-1;
      while(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
      }
      //reverse the starting k elemnets 

     i = 0 ;
     j= k-1;
    while(i<j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;
        j--;
    }
    i = k ;
     j= nums.length-1;
    while(i<j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;
        j--;
   

    }

        }
}
    
