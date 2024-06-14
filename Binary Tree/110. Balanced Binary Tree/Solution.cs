/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution
{

    public bool IsBalanced(TreeNode root)
    {
        if (root == null) return true;

        int maxHeight = GetMaxHeight(root);

        return CheckIfBalanceInTree(maxHeight);
    }

    private int GetMaxHeight(TreeNode root)
    {
        if (root == null) return 0;

        int leftMaxHeight = GetMaxHeight(root.left);
        int rightMaxHeight = GetMaxHeight(root.right);


        return GetHeight(leftMaxHeight, rightMaxHeight);
    }

    private int GetHeight(int leftHeight, int rightHeight)
    {
        if (CheckCurrentTreeBalance(leftHeight, rightHeight))
        {
            return Math.Max(leftHeight, rightHeight) + 1;

        }
        else
            return -1;
    }

    private bool CheckCurrentTreeBalance(int leftHeight, int rightHeight)
    {
        return Math.Abs(leftHeight - rightHeight) <= 1 &&
            CheckIfBalanceInTree(leftHeight) && CheckIfBalanceInTree(rightHeight);
    }

    private bool CheckIfBalanceInTree(int height)
    {
        if (height == -1) return false;

        else return true;
    }


}