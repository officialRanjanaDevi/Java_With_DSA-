//Lonely number in an ArrayList;
import java.util.*;
public class Day5 {
    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(8);
        arr.add(6);
        arr.add(5);
        arr.add(8);
        arr.add(12);
        Collections.sort(arr); //5  6  8  8  10  12
        ArrayList<Integer> brr=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            //checking if a number has duplicate or any adjacent number.
            if(arr.get(i)==arr.get(i+1) || arr.get(i)==arr.get(i+1)-1 ){
             i=i+1;
            }else{
                brr.add(arr.get(i));
            }
        }
        //checking for last element of the list
        if(arr.get(arr.size()-1)!=arr.get(arr.size()-2) && arr.get(arr.size()-1)!=arr.get(arr.size()-2)+1  ){
            brr.add(arr.get(arr.size()-1));
        }
        System.out.println(brr);
    }
}
