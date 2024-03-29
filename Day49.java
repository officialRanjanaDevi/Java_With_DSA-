class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        } 
        int left=0;
        int windowsize=0;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                windowsize++;
            }
            while(windowsize==k){
                if(nums[left]==max){
                    windowsize--;
                }
                left++;
            }
            count+=left;
        }
        return count;
    }
}