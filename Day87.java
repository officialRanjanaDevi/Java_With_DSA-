class Day87 {
    public double findMaxAverage(int[] nums, int k) {
        if(k==1&&nums.length==1){
            return nums[0];
        }

        int left=0;
        int i=0;
        int windowsize=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(i<nums.length){
            if(windowsize<k){
                sum+=nums[i];
                windowsize++;
            }
            if(windowsize>=k){
                max=Math.max(sum,max);
                sum=sum-nums[left];
                windowsize--;
                left++;
            }
            i++;
        }
        return (double)max/k;
    }
}