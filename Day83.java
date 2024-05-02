public class Day83 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
         if(nums[i]*-1==nums[j]){
             return nums[j];
         }else if(nums[i]*-1>nums[j]){
              i++;
         }else{
             j--;
         }
        } 
        return -1;
     }
}
