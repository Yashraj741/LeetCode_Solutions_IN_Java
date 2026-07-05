package Tree;
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkTree(root) != -1;
    }
    private int checkTree(TreeNode node) {
        if(node == null) return 0;
        int left = checkTree(node.left);
        if(left == -1)  return -1;
        int right = checkTree(node.right);
        if(right == -1) return -1;
        if(Math.abs(left-right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}