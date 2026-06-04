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
    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diam;
    }

    public Info helper(TreeNode root) {

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = helper(root.left);
        Info rightInfo = helper(root.right);

        int diam = Math.max(leftInfo.ht + rightInfo.ht, Math.max(leftInfo.diam, rightInfo.diam));
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, height);
    }
}
