package treesgraphsandDP.trees;

/*
Given the root of a binary tree, invert the tree, and return its root.
(Mirror a binary tree)
Example 3:

Input: root = []
Output: []
 Input: root = [2,1,3]
Output: [2,3,1]
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
 */
public class invertBT {

    // Same concept than isMirror
    // Idea : Take dummy root node, and invert it from another module.

    public TreeNode invertTree(TreeNode root) {
        invertAux(root);
        return root;
    }

    public TreeNode invertAux(TreeNode curr){
        if(curr == null){
            return null;
        }
        else {
            TreeNode aux = curr.right;
            curr.right = invertAux(curr.left);
            curr.left = invertAux(aux);
            return curr;
        }
    }
}
