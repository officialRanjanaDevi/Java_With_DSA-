public class Day73 {
        public int helper(TreeNode root){
            if(root==null){
                return 0;
            }
            else if(root.left==null &&root.right==null){
                return 1;
            }
            else if(root.left==null){
                return helper(root.right)+1;
            }
            else if(root.right==null){
                return helper(root.left)+1;
            }
    
            return Math.min(helper(root.left),helper(root.right))+1;
        }
        public int minDepth(TreeNode root) {
            return helper(root);
        }
    }

