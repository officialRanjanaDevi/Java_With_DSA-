public class Day63 {
        public int trap(int[] height) {
          int n=height.length;
          int leftmax[]=new int[n];
          leftmax[0]=height[0];
          for(int i=1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
          }
          int rightmax[]=new int[n];
          rightmax[n-1]=height[n-1];
          for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(rightmax[i+1],height[i]);
          }
          int sum=0;
          for(int i=1;i<n-1;i++){
            sum+=Math.abs(Math.min(leftmax[i],rightmax[i])-height[i]);
          }
           return sum;
        }
}
