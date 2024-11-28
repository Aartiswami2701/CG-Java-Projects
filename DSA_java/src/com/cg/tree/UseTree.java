package com.cg.tree;
import java.util.Scanner;
 
public class UseTree {
	public static void main(String[] args) {
	        BinaryTree1 tree = new BinaryTree1();
	        Scanner scanner = new Scanner(System.in);
	        int choice, value;
 
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Insert a node");
	            System.out.println("2. Delete a node");
	            System.out.println("3. Display in-order traversal");
	            System.out.println("4. Display pre-order traversal");
	            System.out.println("5. Display post-order traversal");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
 
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    value = scanner.nextInt();
	                    tree.insert(value);
	                    System.out.println("Inserted: " + value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to delete: ");
	                    value = scanner.nextInt();
	                    tree.delete(value);
	                    System.out.println("Deleted: " + value);
	                    break;
	                case 3:
	                    System.out.println("In-order traversal:");
	                    tree.inorder();
	                    break;
	                case 4:
	                    System.out.println("Pre-order traversal:");
	                    tree.preorder();
	                    break;
	                case 5:
	                    System.out.println("Post-order traversal:");
	                    tree.postorder();
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);
 
	        scanner.close();
	    }
	}
 
//36 26 46 21 31 11 24 41 56 51 66
//In-order: 11 21 24 26 31 36 41 46 51 56 66
//Pre-order: 36 26 21 11 24 31 46 41 56 51 66
//Post-order: 11 24 21 31 26 41 51 66 56 46 36
/*
      36
    /    \
  26      46
/  \    /  \
21   31 41   56
/  \         /  \
11  24      51   66
 
 
*/
/*
     40
    /    \
  20      60
/  \    /  \
10  30  50   70
      \
      35
 
* -----------------------------------
* Case 1: Delete a Leaf Node
* -----------------------------------
Example: Delete 10
 
Locate the Node: Start at the root (40), go left to 20, then left to 10.
Identify the Case: 10 is a leaf node (no children).
Delete:
Set 20's left reference to null.
      40
    /    \
  20      60
    \    /  \
    30  50   70
      \
      35
 
//----------------------------------------------
* Case 2: Delete a Node with One Child
* ---------------------------------
* Example: Delete 30
 
Locate the Node: Start at the root (40), go left to 20, then right to 30.
Identify the Case: 30 has one child (35).
Delete:
Set 20's right reference to point to 35 (the child of 30).
* Result:         
	40
    /    \
  20      60
/      /  \
10    50   70
      /
    35
 
*
* ----------------------------------------
* Case 3: Delete a Node with Two Children
* --------------------------------------------
* Example: Delete 20
 
Locate the Node: Start at the root (40), go left to 20.
Identify the Case: 20 has two children (10 and 30).
Find In-Order Successor: The in-order successor of 20 is 30 (the smallest node in the right subtree).
Replace: Replace 20 with 30.
Delete the Successor: Now we need to delete 30 (which we previously identified):
30 has one child (35), so we set 20's right reference to 35.
      40
    /    \
  30      60
/  \    /  \
10   35  50   70
 
* */
/*
*
* Summary
*
*
* Leaf Node: Simple removal; just set the parent's reference to null.
One Child: Connect the parent directly to the node's child.
Two Children:
Find the in-order successor (or predecessor).
Replace the value of the node to be deleted with the successor's (or predecessor's) value.
Delete the successor (or predecessor), which will fall into the first two cases.
 
*Intial BST
*         50
    /    \
  30      70
/  \    /  \
20  40  60   80
 
Case 1: Delete 20
Locate 20: It's a leaf node.
Resulting tree:
      50
    /    \
  30      70
    \    /  \
    40  60   80
Case 2: Delete 30
Locate 30: It has two children.
In-order successor is 40.
Replace 30 with 40 and delete 40.
Resulting tree:
      50
    /    \
  40      70
/      /  \
20     60   80
Case 3: Delete 70
Locate 70: It has two children.
In-order successor is 80.
Replace 70 with 80 and delete 80.
Resulting tree:
      50
    /    \
  30      80
/  \    /
20  40  60
 
*
*/
 
 
 