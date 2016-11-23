/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) return root;
        else{
            
          TreeNode tmp_node = root.right;   
          root.right = root.left;   
          root.left = tmp_node;
          invertTree(root.left);
          invertTree(root.right);
            
        }
        return root;
    }
}