import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Main {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result);   // Left
        result.add(node.val);         // Root
        inorder(node.right, result);  // Right
    }
    // public static void main(String[] args) {
    //     /*
    //         We will construct this binary tree:
    //              1
    //             / \
    //            2   3
    //           / \
    //          4   5
    //     */
    //     TreeNode root = new TreeNode(1);
    //     root.left = new TreeNode(2);
    //     root.right = new TreeNode(3);
    //     root.left.left = new TreeNode(4);
    //     root.left.right = new TreeNode(5);
    //     Main solution = new Main();
    //     List<Integer> output = solution.inorderTraversal(root);
    //     // Expected Inorder Output: [4, 2, 5, 1, 3]
    //     System.out.println("Inorder Traversal: " + output);
    // }
}