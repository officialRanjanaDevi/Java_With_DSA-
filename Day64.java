public class Day64 {
        public int calpro(int idx,int nums[]){
             int pro=1;
            for(int i=0;i<nums.length;i++){
               
                if(i!=idx){
                    pro=pro*nums[i];
                }
            }
            return pro;
        }
        public int[] productExceptSelf(int[] nums) {
            int pro=1;
            for(int i=0;i<nums.length;i++){
                pro=pro*nums[i];
            }
            int ans[]=new int[nums.length];
            for(int i=0;i<ans.length;i++){
                if(nums[i]==0){
                    ans[i]=calpro(i,nums);
                }else{
                    ans[i]=pro/nums[i];
                }
            }
            return ans;
        }
}
