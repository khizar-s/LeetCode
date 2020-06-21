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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        
        return makeBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode makeBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        
        int mid = (left + right) / 2;
        TreeNode main = new TreeNode(nums[mid]);
        main.left = makeBST(nums, left, mid - 1);
        main.right = makeBST(nums, mid + 1, right);
        return main;
        
    }
}