package org.example.tree;

import java.util.ArrayList;
import java.util.List;

import static org.example.tree.BSTLCA.buildTreeFromLevelOrder;
import static org.example.tree.BSTLCA.findNode;

public class Main {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(4);
        node.left.left.right = new TreeNode(2);

        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(9);
        BSTLCA bstlca = new BSTLCA();
//        System.out.println(bstlca.printCommonAncestors(node, node.left.left, node.right.right ).val);
//        System.out.println(bstlca.printCommonAncestors(node, node.left, node.left.right).val);
//        System.out.println(bstlca.printCommonAncestors(node, node.left.left.right, node.left.right).val);
//        System.out.println(bstlca.printCommonAncestors(node, node.right.left, node.left.right).val);

        Integer[] levelOrder = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = buildTreeFromLevelOrder(levelOrder);

        TreeNode p = findNode(root, 3);
        TreeNode q = findNode(root, 5);

        System.out.println(bstlca.printCommonAncestors(root, p,q ).val);

    }




}
