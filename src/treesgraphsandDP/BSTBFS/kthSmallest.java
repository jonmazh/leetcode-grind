package treesgraphsandDP.BSTBFS;

import java.util.Deque;
import java.util.ArrayDeque;

public class kthSmallest {
    /*
    Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
    Input: root = [3,1,4,null,2], k = 1
    Output: 1

    Input: root = [5,3,6,2,4,null,null,1], k = 3
    Output: 3
     */
    int count = 0;
    TreeNode result = null;
    public int kthSmallest(TreeNode root, int k) {

        helper(root, k);
        return result.val;
    }

    public void helper(TreeNode aux, int k){

        if (aux == null){return;}

        helper(aux.left, k);
        count++;

        if(count==k){
            result = aux;
            return;
        }

        helper(aux.right, k);
    }
}
