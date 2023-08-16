# Invert Binary Tree

Link to the problem [here](https://leetcode.com/problems/invert-binary-tree/).

### [Solution](/Binary%20Tree/226.%20Invert%20Binary%20Tree/Solution.java)

```java
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        return root;
        return new TreeNode(root.val,invertTree(root.right),invertTree(root.left));
    }
}
```
Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>)

Explanation: Simple recursion, where change in `TreeNode` left and right sides
