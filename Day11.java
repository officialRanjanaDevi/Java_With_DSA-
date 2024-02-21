//Maximum sum of subarrays using kadanes algorithm
public class Day11 {
    //checking wheather array has all negative elements or not
    public static boolean check(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
          if (arr[i] > 0) {
            return false;
          }
        }
        return true;
    }
    //driver function
    public static void main(String args[]) {
        int arr[] = { 4, -6, 9, 5, -1, -3, 7, 2 };
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        if (check(arr, n)) {
          for (int i = 0; i < n; i++) {
              if (arr[i] > max) {
              max = arr[i];
              }
            }
        } else {
          for (int i = 0; i < arr.length; i++) {
              if ((sum + arr[i]) < 0) {
              sum = 0;
              } else {
              sum += arr[i];
              }
    
              if (sum > max) {
              max = sum;
              }
            }
        }
    
        System.out.println("Max sum=" + max);
    }
}
      

