package com.pramod.algorithm.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {
        public static void main(String [] args){

        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(8);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(11);

        System.out.println(height(root));

        }

        private static int height(TreeNode root) {
                if(root==null) return 0;

                Queue qs = new LinkedList();

                qs.add(root);
                int depth = 0;
                while(!qs.isEmpty()){
                        int levelSize = qs.size();

                        for (int i = 0; i < levelSize; i++) {
                                TreeNode current = (TreeNode) qs.poll();
                                if(current.right!=null){
                                        qs.add(current.right);
                                }
                                if(current.left!=null){
                                        qs.add(current.left);
                                }


                        }
                        depth ++;

                }
                return depth - 1;

        }
    
}
