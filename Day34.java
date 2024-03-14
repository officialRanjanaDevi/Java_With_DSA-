public class Day34 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node buildTree(int arr[]){
        idx++;
          if(arr[idx]==-1){
            return null;
          }
          Node newnode=new Node(arr[idx]);
          newnode.left=buildTree(arr);
          newnode.right=buildTree(arr);
          return newnode;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Day34 t=new Day34();
        Node root =t.buildTree(arr);
        System.out.println(root.data);
    }
}
