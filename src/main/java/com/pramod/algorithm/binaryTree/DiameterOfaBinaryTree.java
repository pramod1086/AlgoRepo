package com.pramod.algorithm.binaryTree;

public class DiameterOfaBinaryTree {

    static  int maxDiameter = 0;

    public static void main(String[] args) {

        // Constructed binary tree is
        //          5
        //        /   \
        //       8     6
        //      / \   /
        //     3   7 9
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);

        System.out.println(getDiameterOfTree(root));
    }

    private static int getDiameterOfTree(TreeNode root ) {


        if(root==null){return 0;}

        int left = getDiameterOfTree(root.left);
        int right = getDiameterOfTree(root.right);

        maxDiameter = Math.max(maxDiameter, left + right);



        return 1+ Math.max(left, right);


    }
}
