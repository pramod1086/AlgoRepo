package com.pramod.algorithm.binaryTree.problems;

import com.pramod.algorithm.binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Checkcousins{

    public static void main(String[] args) {

        // create hard coded tree
        //       1
        //     /   \
        //    2     3
        //   /       \
        //  5         4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        int a = 4, b = 3;

        System.out.println(isCousins(root, 4, 5)); // true
      //  System.out.println(isCousins(root, 2, 3)); // false


}

    private static boolean isCousins(TreeNode root, int a, int b) {

        Boolean result = false;
        Queue qs = new LinkedList();

        qs.add(root);
        while(!qs.isEmpty()){

            boolean left = false;
            boolean right = false;

            for (int i = 0; i < qs.size(); i++) {
                TreeNode ts = (TreeNode) qs.poll();
                if(ts.left!=null && ts.right!=null){

                    if(ts.left.value==a && ts.right.value==b||ts.right.value==a && ts.left.value==b){
                        return false;
                    }
                }

                if(ts.left!=null){
                    qs.add(ts.left);
                    if(ts.left.value==a){
                        left = true;
                    }
                    if(ts.left.value==b){
                        right = true;
                    }

                }
                if(ts.right!=null){
                    qs.add(ts.right);
                    if(ts.right.value==a){
                        left = true;
                    }
                    if(ts.right.value==b){
                        right = true;
                    }





                }
            }




            if (left && right) return true;

            // if only one found at this level
            if (left || right) return false;

        }
        return result;


    }
    }
