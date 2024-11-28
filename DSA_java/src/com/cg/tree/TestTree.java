package com.cg.tree;

import java.util.Scanner;

public class TestTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			super();
			this.data = data;	
			left=right=null;
		}
	}
	public TestTree(Node root) {
		root =null;
	}
	
	void insert(int data) {
		root=insertRec(root,data);
		
	}
	
	public Node insertRec(Node current ,int data) {
		if(current==null) {
			//System.out.println("root : " + data);
			return new Node(data);
		}
		if(data<current.data) {
			current.left=insertRec(current.left,data);
			
			//System.out.println("left node : "+current.left.data);
			
		}else if(data>current.data) {
			current.right=insertRec(current.right,data);
		
			//System.out.println("right node : "+current.right.data);
			
		}
		return current;
	}
	
	void inOrder() {
		System.out.println("in order traversal : ");
		
		InOrderTraversal(root);
	}
	
	void preorder() {
		System.out.println("pre order traversal : ");
		PreOrderTraversal(root);
	}
	
	void postorder() {
		System.out.println("post order traversal : ");
		PostOrderTraversal(root);
	}
	
	

	

	public void InOrderTraversal(Node current) {
		// TODO Auto-generated method stub
			if(current!=null) {
			InOrderTraversal(current.left);
			System.out.println(current.data);
			InOrderTraversal(current.right);
		}
		
	}
	
	public void PreOrderTraversal(Node current) {
		// TODO Auto-generated method stub
		
		if(current!=null) {
			System.out.println(current.data);
			PreOrderTraversal(current.left);
			PreOrderTraversal(current.right);
		}
		
	}
	
	public void PostOrderTraversal(Node current) {
		// TODO Auto-generated method stub
		
		if(current!=null) {
			PostOrderTraversal(current.left);
			PostOrderTraversal(current.right);
			System.out.println(current.data);	
		}
		
	}
	
	void delete(int item) {
        root = deleteRec(root, item);
    }
	Node deleteRec(Node root, int item) {
        if (root == null) {
            System.out.println("Node not found: " + item);
            return root; // Node not found
        }
        //case 1 leaf node
        if (item < root.data) {
            root.left = deleteRec(root.left, item);
        } else if (item > root.data) {
            root.right = deleteRec(root.right, item);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
 
            // Node with two children:
            //Get the inorder successor (smallest in the right subtree)
            Node succ = findMinimum(root.right);
            root.data = succ.data; // Copy the inorder successor's content to this node
            root.right = deleteRec(root.right, succ.data); // Delete the inorder successor
        }
        return root;
    }
	Node findMinimum(Node cur) {
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
	
	Node search(Node cur, int item, Node parent) {
        while (cur != null && cur.data != item) {
            parent = cur;
            if (item < cur.data) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur; // Will return null if not found
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		TestTree t=new TestTree(root);
		Scanner sc= new Scanner(System.in);
		while(true) {
			
			System.out.println("enter your choice for traversing a tree : ");
			System.out.println("1. Insert element ");
			System.out.println("2. InOrder Traversal ");
			System.out.println("3. PreOrder Traversal ");
			System.out.println("4. PostOrder Traversal ");
			System.out.println("5. Delete leaf node ");
			int ch=sc.nextInt();
			
		switch(ch) {
			case 1:	
				System.out.println("Enter an element to insert : ");
				int n=sc.nextInt();
				t.insert(n);
				break;
				
			case 2:	
				t.inOrder();
				break;
			
			case 3:	
				t.preorder();
				break;
				
			case 4:	
				t.postorder();
				break;
				
			case 5:	
				System.out.println("Enter an element to delete : ");
				int m=sc.nextInt();
				t.delete(m);
				break;
			
			
			default:
				System.out.println("Enter a valid choice: ");
			
		
		}
		}
		

	}

}
