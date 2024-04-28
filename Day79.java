public class Day79 {
    public boolean isprime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(!isprime(nums[i])){
                i++;
            }
            if(!isprime(nums[j])){
                j--;
            }else if(isprime(nums[i])&&isprime(nums[j])){
                return j-i;
            }
        }
        return 0;
    }
}
