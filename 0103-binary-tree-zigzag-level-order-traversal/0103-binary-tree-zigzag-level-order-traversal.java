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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currentLevel =new ArrayList<>(levelSize);

            for(int i=0; i<levelSize;i++){
                if(!reverse){
                    TreeNode currNode = q.removeFirst();
                    currentLevel.add(currNode.val);
                    if(currNode.left != null){
                        q.addLast(currNode.left);
                    }
                    if(currNode.right != null){
                        q.addLast(currNode.right);
                    }
                }else{
                    TreeNode currNode =q.removeLast();
                    currentLevel.add(currNode.val);
                    if(currNode.right != null){
                        q.addFirst(currNode.right);
                    }
                    if(currNode.left != null){
                        q.addFirst(currNode.left);
                    }
                }
            }
            reverse= !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}