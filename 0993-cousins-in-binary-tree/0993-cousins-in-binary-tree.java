/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            boolean foundX= false;
            boolean foundY =false;

            for(int i=0; i<levelSize; i++){
                TreeNode current = q.remove();

                if(current.left !=null && current.right != null){
                    if((current.left.val ==x && current.right.val==y)||(current.left.val==y && current.right.val ==x)){
                        return false;
                    }
                }
                if(current.left != null){
                    q.add(current.left);

                    if(current.left.val == x){
                        foundX = true;
                    }
                    if(current.left.val ==y){
                        foundY = true;
                    }
                }
                if(current.right != null){
                    q.add(current.right);

                    if(current.right.val ==x){
                        foundX = true;
                    }
                    if(current.right.val ==y){
                        foundY = true;
                    }
                }
            }
            if(foundX && foundY){
                return true;
            }
            if(foundX || foundY){
                return false;
            }
            // return false;
        }
        return false;
    }
}