package org.example.tree;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class BSTLCA {


    List<TreeNode> traversal(TreeNode root, TreeNode target, List<TreeNode> ancestors) {

        ancestors.add(root);
        if(root.val == target.val)  return ancestors;

        if(root.left !=null && root.val > target.val ) traversal(root.left, target, ancestors);
        if(root.right != null && root.val < target.val ) traversal(root.right, target, ancestors);

        return ancestors;

    }

    TreeNode printCommonAncestors(TreeNode node ,  TreeNode p, TreeNode q) {
        List<TreeNode> ancesA =  traversal(node, p, new ArrayList<TreeNode>());
        List<TreeNode> ancestorB = traversal(node, q, new ArrayList<TreeNode>());

        TreeNode min = null;
        for(TreeNode item : ancesA) {
            if(ancestorB.contains(item)) {
                if(Objects.isNull(min)) min = item;
                else if(min.val > item.val) min = item;
            }
        }
        return min;
    }

    public static TreeNode buildTreeFromLevelOrder(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < values.length) {
            TreeNode current = queue.poll();

            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }


    // Find a TreeNode with given target value in BST
    public static TreeNode findNode(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) return root;
        else if (target < root.val) return findNode(root.left, target);
        else return findNode(root.right, target);
    }
}






