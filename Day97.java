public class Day97 {
        public boolean evaluateTree(TreeNode root) {
           if(root==null){
            return false;
           }
           if(root.left==null&&root.right==null){
             if(root.val==0){
                return false;
             }else{
                return true;
             }
           }
           if(root.val==2){
              return evaluateTree(root.left)||evaluateTree(root.right);
           }else{
            return evaluateTree(root.left)&&evaluateTree(root.right);
           }
        }
}

