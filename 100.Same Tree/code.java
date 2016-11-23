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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean result = true;
        if(p == null) return(q == null? true:false);
        if(q == null) return(p == null? true:false);
         
        if(p.val != q.val) result = false;
        else result = result; 
       
        
        result = result && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
        return result;
    }
}