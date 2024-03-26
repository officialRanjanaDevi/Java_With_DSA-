class Day46 {
    public int firstMissingPositive(int[] nums) {
        boolean arr[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&&nums[i]<=nums.length){
                arr[nums[i]-1]=true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
}