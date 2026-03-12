package treesgraphsandDP.trees;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/**
 Definition for a binary tree node.

 */
 /*
 A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
  Example 2:

    Input: root = [1,null,2]
    Output: 2

  */

public class mxDepth {
      // IDEA : Hay que llevar un contador
      // IDEA : Por cada capa nueva, counter++, return counter.
      // IDEA : ExploredNodes. Si se han recorrido sus dos hijos, se añade a ExploredNodes.
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else {
            return 1+Math.max(maxDepth(root.right),maxDepth(root.left));
        }
    }
}
