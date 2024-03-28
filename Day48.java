import java.util.*;
public class Day48 {
        public int maxSubarrayLength(int[] nums, int k) {
            HashMap<Integer,Integer>map=new HashMap<>();
            int left=-1;
            int max=0;
            for(int i=0;i<nums.length;i++){
                 if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                    
                 }else{
                    map.put(nums[i],1);
                 }
                 while(map.get(nums[i])>k){
                       left++;
                       map.put(nums[left],map.get(nums[left])-1);
                    }
                    int size=i-left;
                    if(size>max){
                        max=size;
                    }
            }
            return max;
        }
}
