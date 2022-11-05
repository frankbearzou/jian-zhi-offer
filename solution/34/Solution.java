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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target, new ArrayList<>());
        return res;
    }

    public void recur(TreeNode root, int target, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            if (sum == target) {
                res.add(new ArrayList<>(list));
            }
        }
        recur(root.left, target, list);
        recur(root.right, target, list);
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}
