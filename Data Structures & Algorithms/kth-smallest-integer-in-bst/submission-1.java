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
    public int kthSmallest(TreeNode root, int k) {
    //     List<Integer> arr = new ArrayList<>();

    //     helper(root, arr);
    //     Collections.sort(arr);
    //     return arr.get(k-1);
        
    // }
    // void helper(TreeNode node, List<Integer> arr) {
    //     if (node == null) return;
    //     arr.add(node.val);
    //     helper(node.left, arr);
    //     helper(node.right, arr);
    // }

    List<Integer> arr = new ArrayList<>();
    inOrder(root, arr);
    return arr.get(k-1);

    }
    void inOrder(TreeNode node, List<Integer> arr) {
        if (node == null) return;

        inOrder(node.left, arr);
        arr.add(node.val);
        inOrder(node.right, arr);
    }
}
