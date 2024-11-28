package com.cg.circular;

import java.util.Scanner;

public class DoublyCircular {
    Node head = null;
    Node tail = null;

    public DoublyCircular() {}

    class Node {
        Node prev = null;
        int data;
        Node next;

        public void display() {
            System.out.print(" " + data);
        }
    }

    public void search(int data) {
        Node current = head;
        int count = 0;

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        do {
            if (current.data == data) {
                System.out.println("Element found: " + current.data + " at location: " + count);
                return; // Exit after finding the first occurrence
            }
            current = current.next;
            count++;
        } while (current != head);
        
        System.out.println("Element not found: " + data);
    }

    public void addItem(int data) {
        Node newnode = new Node();
        newnode.data = data;

        if (head == null) {
            head = newnode;
            tail = newnode;
            head.next = head; // Point to itself
            head.prev = head; // Point to itself
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head; // Link new node to head
            head.prev = newnode; // Link head's prev to new node
            tail = newnode; // Update tail to new node
        }
    }

    public void printList() {
        System.out.println("List (first --> last): ");
        Node current = head;

        if (head == null) {
            System.out.println("List is empty...");
            return;
        }

        do {
            current.display();
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;

        do {
            if (current.data == data) {
                if (current == head && current == tail) {
                    head = null; // List becomes empty
                    tail = null;
                } else {
                    if (current == head) {
                        head = current.next; // Update head
                    }
                    if (current == tail) {
                        tail = current.prev; // Update tail
                    }
                    current.prev.next = current.next; // Bypass current node
                    current.next.prev = current.prev; // Bypass current node
                }
                System.out.println("Deleted: " + data);
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Element not found for deletion: " + data);
    }

    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        
        if (tail == null) {
            System.out.println("List is empty...");
            return;
        }

        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);

        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircular d = new DoublyCircular();
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
                    d.deleteNode(deleteValue);
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
