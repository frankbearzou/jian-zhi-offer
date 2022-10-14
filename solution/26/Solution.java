/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        if (preorder(A, B)) {
            return true;
        }
        if (isSubStructure(A.left, B)) {
            return true;
        }
        if (isSubStructure(A.right, B)) {
            return true;
        }
        return false;
    }

    boolean preorder(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return preorder(A.left, B.left) && preorder(A.right, B.right);
    }
}
