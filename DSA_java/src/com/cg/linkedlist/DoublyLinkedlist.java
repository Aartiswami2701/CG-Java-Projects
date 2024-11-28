package com.cg.linkedlist;

import java.util.Scanner;

public class DoublyLinkedlist {
    Node head = null;
    Node tail = null;

    public DoublyLinkedlist() {}

    class Node {
        Node prev = null;
        int data;
        Node next;

        public void display() {
            System.out.println(" " + data);
        }
    }

    public void search(int data) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Element found: " + current.data + " at location: " + count);
                return; // Exit after finding the first occurrence
            }
            current = current.next;
            count++;
        }
        System.out.println("Element not found: " + data);
    }

    public void addItem(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void printDoubl() {
        System.out.println("List (first --> last): ");
        Node current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    public void deletenode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Update head if deleting the first node
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // Update tail if deleting the last node
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found for deletion: " + data);
    }

    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedlist d = new DoublyLinkedlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice for Doubly Linked List: ");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Display Forward");
            System.out.println("4. Display Backward");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    d.addItem(insertValue);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    d.deletenode(deleteValue);
                    break;
                case 3:
                    d.displayForward();
                    break;
                case 4:
                    d.displayBackward();
                    break;
                case 5:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    d.search(searchValue);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Enter a valid choice...");
            }
        }
    }
}
