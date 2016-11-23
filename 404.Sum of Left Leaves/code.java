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
    public int sumOfLeftLeaves(TreeNode root) {
       int result = 0;
       result = sumOfLeftLeaves(root,0);
       
       return result;
    }
    public int sumOfLeftLeaves(TreeNode root, int flag) {
         int result = 0;
         if(root == null) return 0;
         if((flag == 1)&&(root.left == null)&&(root.right == null)) result += root.val;
         result += sumOfLeftLeaves(root.left,1);
         result += sumOfLeftLeaves(root.right,0);
         
         return result;
    }
}