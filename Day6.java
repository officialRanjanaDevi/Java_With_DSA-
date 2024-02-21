//Polygon with largest perimeter
import java.util.Arrays;
import java.util.Scanner;
public class Day6 {
    public static long largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       long arr[]=new long [nums.length];
       arr[0]=nums[0];
       //calculating a prefix sum array
       for(int i=1;i<nums.length;i++){
           arr[i]=arr[i-1]+nums[i];
       }
       //checking the polygon condition
       for(int i=nums.length-1;i>=2;i--){
           if((arr[i]-nums[i])>nums[i]){
               return arr[i];
           }
       } 
       return -1;
    }
     //driver function
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(largestPerimeter(nums));
    }
}




