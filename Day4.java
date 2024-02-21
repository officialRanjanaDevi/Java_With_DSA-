//Container with most water
import java.util.ArrayList;
public class Day4 {
    public static void main(String[]args){
         
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(1);
        int st=0;
        int end=list.size()-1;
        int max=0;
        while(st<end){
           int height=Math.min(list.get(st), list.get(end));
           int width=end-st;
           int area=height*width;
           max=Math.max(max, area);
          if(list.get(st)<list.get(end)){
            st++;
          }else if(list.get(st)>list.get(end)){
            end--;
          }
        }
        System.out.println(max);
    }
}
