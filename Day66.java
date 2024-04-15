public class Day66 {
        public int sumNumbers(TreeNode root) {
            return dfs(root,0);
        }
        public int dfs(TreeNode node,int pathSum){
            if(node==null){
                return 0;
            }
            pathSum=pathSum*10+node.val;
            if(node.left==null &&node.right==null){
                return pathSum;
            }
            return dfs(node.left,pathSum)+dfs(node.right,pathSum);
        }
}
