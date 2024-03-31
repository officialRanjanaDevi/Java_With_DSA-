/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/
class Day51 {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        if(root==null){
            return -1;
        }
        if(root.key==n){
            return root.key;
        }
        
        if(root.key>n){
            if(root.left==null){
                return -1;
            }else{
                return findMaxForN(root.left,n);
            }
        }
        if(root.right==null){
            return root.key;
        }
        return Math.max(root.key,FindMaxForN(root.right,n));
    }
}