# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def __init__(self):
        self.check_if_lsa = False
        self.ancestor = None

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        self.set_ancestor(root)
        self.traverse_tree(p.val, q.val)
        return self.ancestor

    def set_ancestor(self, node: 'TreeNode'):
        self.ancestor = node

    def traverse_tree(self, p_val: int, q_val: int):
        while not self.check_if_lsa:
            self.find_ancestor(p_val, q_val)


    def find_ancestor(self, p_val: int, q_val: int):
        if self.check_nodes_in_right_subtree(p_val, q_val):
            self.set_right_subtree()
        elif self.check_nodes_in_left_subtree(p_val, q_val):
            self.set_left_subtree()
        else:
            self.flagged_lsa()

    def check_nodes_in_right_subtree(self, p_val, q_val) -> bool:
        return p_val > self.ancestor.val and q_val > self.ancestor.val

    def set_right_subtree(self):
        self.ancestor = self.ancestor.right

    def check_nodes_in_left_subtree(self, p_val, q_val) -> bool:
        return p_val < self.ancestor.val and q_val < self.ancestor.val

    def set_left_subtree(self):
        self.ancestor = self.ancestor.left

    def flagged_lsa(self):
        self.check_if_lsa = True
