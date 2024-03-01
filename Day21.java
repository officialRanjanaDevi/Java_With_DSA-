//------------Peak element--------------
class Solution
{
	public static int peakElement(int[] arr,int n)
    {  
       int st=0;
       int end=arr.length-1;
       while(st<=end){
           int mid=st+(end-st)/2;
           if((mid==0 || arr[mid]>=arr[mid-1])&&(mid==arr.length-1 || arr[mid]>=arr[mid+1])){
               return mid;
           }else if(mid>0 && arr[mid]<arr[mid-1]){
               end=mid-1;
           }else{
               st=mid+1;
           }
       }
       return -1;
    }
    //-----------Driver code----------
    public static void main(String[]args){
         int arr[]={7,8,9,1,1,3,5,6};
         int n=arr.length;
         System.out.println(peakElement(arr,n));
    }
}