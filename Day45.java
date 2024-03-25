import java.util.ArrayList;
import java.util.List;

public class Day45 {
   public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        boolean []arr=new boolean[nums.length+1];
        for(int num:nums){
            if(arr[num]){
                ans.add(num);
            }else{
                arr[num]=true;
            }
        }
        return ans;
    } 
}
