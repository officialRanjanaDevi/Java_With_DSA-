
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Day50 {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
      
        if(root.left==null){
            return root.data;
        }
        return minValue(root.left);
    }
}


