package com.pramod.algorithm.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBuilder {
    public TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        return root;
    }


    public void dfs(TreeNode treeNode){

        if(treeNode == null){
            return;
        }

        Queue dfsQueue = new LinkedList();
        dfsQueue.offer(treeNode);

        while(!dfsQueue.isEmpty()){
            TreeNode treeNode1 = (TreeNode) dfsQueue.poll();
            System.out.println(treeNode1.value);
            if(treeNode1.left!=null){
                dfsQueue.offer(treeNode1.left);
            }
            if(treeNode1.right!=null){
                dfsQueue.offer(treeNode1.right);
            }


        }
    }
}
