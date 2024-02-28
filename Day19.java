/*------Merge Sort---------*/
import java.util.*;
public class Day19 {
    //------------function to print the array-----------
    public static void print(int arr[]){
        System.out.println();
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"  ");
        }
    }
    //-----------function for sorting and merging-----------
    public static void merge(int arr[],int low,int high,int mid){
       ArrayList <Integer> list=new ArrayList<>();
       int i=low;
       int j=mid+1;
       while(i<=mid && j<=high){
           if(arr[i]>arr[j]){
            list.add(arr[j]);
            j++;
           }else{
            list.add(arr[i]);
            i++;
           }
       }
       while(i<=mid){
        list.add(arr[i]);
        i++;
       }
       while(j<=high){
        list.add(arr[j]);
        j++;
       }
       int idx=0;
       for(int k=low;k<=high;k++){
        arr[k]=list.get(idx);
        idx++;
       }
       return;
    }
   //------- Recursion function for dividing array----------
    public static void mergesort(int arr[],int low,int high){
        //base case
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,high,mid);
        return;
    } 
    //------------Driver code--------------------
    public static void main(String[]args){
        int arr[]={4,3,7,6};
        print(arr);
        mergesort(arr,0,arr.length-1);
        print(arr);
        
    }
}


