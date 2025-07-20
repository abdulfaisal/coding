package org.example.tree;

import java.util.ArrayList;
import java.util.List;

import static org.example.tree.BSTLCA.*;

public class Main {

    public static void main(String[] args) {

        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = buildBST(values);

        TreeNode p = findNode(root, 3);
        TreeNode q = findNode(root, 5);

        BSTLCA bstlca =new BSTLCA();
        System.out.println(bstlca.lowestCommonAncestor(root, p, q).val);

    }




}
