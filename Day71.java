public class Day71 {
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
      TreeSet<Integer> ts=new TreeSet<>();
      for(int i=0;i<n;i++){
          ts.add(arr1[i]);
      }
      for(int j=0;j<m;j++){
          ts.add(arr2[j]);
      }
      ArrayList<Integer> arr=new ArrayList<>();
      for(Integer set:ts){
          arr.add(set);
      }
      return arr;
    }
}


