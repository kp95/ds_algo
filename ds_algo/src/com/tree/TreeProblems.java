package com.tree;

import java.util.ArrayDeque;
import java.util.Queue;

import com.queue.QueueUser;

public class TreeProblems {
	
	static int maxLevel = 0;
	public static void main(String[] args) {
		TreeNode<Integer> root=new TreeNode(10);
    	root.left=new TreeNode(20);
    	root.right=new TreeNode(30);
    	root.right.left=new TreeNode(40);
    	root.right.left.right=new TreeNode(60);
    	
    	root.right.right=new TreeNode(50);
    	
    	
    	//inorder(root);
    	//postorder(root);
    	//preorder(root);
    	
    	//System.err.println(heightOfTree(root));
    	//printNodesAtKDistance(root, 2);
    	levelOrderTraversal(root);
    	//levelOrderTraversalLineByLine(root);
    	System.err.println();
    	//System.err.println(sizeOfTree(root));
    	//System.err.println(maxOfTree(root));
    	//leftViewOfTree(root, 1);
    	rightViewOfTree(root);
	}
	public static void inorder(TreeNode<Integer> root) {
		if(root != null) {
			inorder(root.left);
			System.err.print(root.data + "  ");
			inorder(root.right);
		}
	}
	
	public static void postorder(TreeNode<Integer> root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.err.print( root.data + " ");
			
		}
	}
	public static void preorder(TreeNode<Integer> root) {
		if(root != null) {
			System.err.print( root.data + " ");
			postorder(root.left);
			postorder(root.right);
		}
	}
	
	public static int heightOfTree(TreeNode<Integer> root) {
		if(root != null) {
			return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
		}
		else {
			return 0;
		}
	}
	public static void printNodesAtKDistance(TreeNode<Integer> root,int k) {
		if(root != null) {
			if( k == 0) {
				System.err.print(root.data + " ");
			}
			else {
				printNodesAtKDistance(root.left, k - 1);
				printNodesAtKDistance(root.right, k - 1);
			}
			
		}
	}
	public static void levelOrderTraversal(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new ArrayDeque<TreeNode<Integer>>();
		TreeNode<Integer> temp = root;
		System.err.print(temp.data);
		if(temp.left != null) {
			queue.add(temp.left);
		}
		if(temp.right != null) {
			queue.add(temp.right);
		}
		while(queue.isEmpty() == false) {
			TreeNode<Integer> temp1 = queue.poll();
			System.err.print("  "+ temp1.data);
			if(temp1.left != null) {
				queue.add(temp1.left);
			}
			if(temp1.right != null) {
				queue.add(temp1.right);
			}	
		}
	}
	public static void levelOrderTraversalLineByLine(TreeNode<Integer> root) {
		ArrayDeque<TreeNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		System.err.println();
		while(queue.isEmpty() == false) {
			int count = queue.size();
			for(int i = 0; i<count; i++) {
				TreeNode<Integer> temp = queue.poll();
				System.err.print(temp.data + " ");
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}	
			}
			System.err.println();
		}
		
	}
	public static int sizeOfTree(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		else {
			return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
		}
	}
	public static int maxOfTree(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		else {
			return Math.max(root.data, Math.max(maxOfTree(root.left), maxOfTree(root.right)));
		}
	}
	public static void leftViewOfTree(TreeNode<Integer> root, int level) {
		
		if(root == null) {
			return;
		}
		else {
			if(maxLevel < level) {
				System.err.println(root.data);
				maxLevel = level;
			}
			leftViewOfTree(root.left, level + 1);
			leftViewOfTree(root.right, level + 1);
		}
	}
	public static void leftViewOfTree(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new ArrayDeque<TreeNode<Integer>>();
		queue.add(root);
		while(queue.isEmpty() == false) {
			int count = queue.size();
			for(int i = 0; i< count; i++) {
				TreeNode<Integer> temp = queue.poll();
				if(i == 0) {
					System.err.println(temp.data);
				}
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}	
			}
		}
	}
	public static void rightViewOfTree(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new ArrayDeque<TreeNode<Integer>>();
		queue.add(root);
		while(queue.isEmpty() == false) {
			int count = queue.size();
			for(int i = 0; i< count; i++) {
				TreeNode<Integer> temp = queue.poll();
				if(i == count - 1) {
					System.err.println(temp.data);
				}
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}	
			}
		}
	}
	
	
	
}
