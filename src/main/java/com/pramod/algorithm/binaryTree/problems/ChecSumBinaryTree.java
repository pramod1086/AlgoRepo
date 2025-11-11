package com.pramod.algorithm.binaryTree.problems;

import com.pramod.algorithm.binaryTree.TreeNode;

public class ChecSumBinaryTree {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//

        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);
        if (new ChecSumBinaryTree().isSumTree(root))
            System.out.println("The tree is a Sum Tree");
        else
            System.out.println("The tree is NOT a Sum Tree");

        int l = new ChecSumBinaryTree().isSumTreeUsingPostOrderTraversal(root);
            System.out.println("The tree is a Sum Tree using PostOrderTraversal"+l);
    }

    private boolean isSumTree(TreeNode root) {

        if(root==null || root.left==null && root.right==null){
            return true;
            
        }
        int left = getSum(root.left);
        int  right = getSum(root.right);

        return root.value == left+right && isSumTree(root.left) && isSumTree(root.right);
        
    }

    private int getSum(TreeNode root) {

        if(root == null){
            return 0;
        }
        return root.value +getSum(root.right)+getSum(root.left);
    }


    /// Using PostOrderTraversal
    private int isSumTreeUsingPostOrderTraversal(TreeNode root) {


        if(root == null){
            return 0;

        }

        // If node is leaf node, return its value.
        if (root.left == null && root.right == null)
            return root.value;


        int left = isSumTreeUsingPostOrderTraversal(root.left);

        int data = root.value;

        int right = isSumTreeUsingPostOrderTraversal(root.right);

        if(data== left+right){
            return left+data+right;

        }
        return -1;

    }

}

