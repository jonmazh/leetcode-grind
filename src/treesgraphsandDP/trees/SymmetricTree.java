package treesgraphsandDP.trees;
/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Input: root = [1,2,2,null,3,null,3]
Output: false

 */
public class SymmetricTree {
    //Idea : Aplicar el mismo concepto que para same tree pero con el nodo derecho y el izquierdo

    public boolean isSymmetric(TreeNode root) {
        return sameTree(root.right, root.left);
    }

    public boolean sameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p != null && q != null && p.val == q.val){
            return sameTree(p.right, q.left) && sameTree(p.left, q.right);
        }
        return false;
    }
}
