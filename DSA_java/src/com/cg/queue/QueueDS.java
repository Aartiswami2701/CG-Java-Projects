package com.cg.queue;

public class QueueDS {
    int front;
    int rear;
    int maxSize; 
    int nItem;
    int Qarray[];

    QueueDS(int maxSize) {
        this.maxSize = maxSize; 
        front = 0;
        rear = -1;
        nItem = 0;
        this.Qarray = new int[maxSize];
    }

    public boolean IsEmpty() {
        return (nItem == 0);
    }

    public boolean IsFull() {
        return (nItem == maxSize);
    }

    public void insert(int n) {
        if (IsFull()) {
            System.out.println("Queue is Full");
            System.out.println("Position of rear is: " + rear);
        } else {
            rear = (rear + 1) % maxSize;
            Qarray[rear] = n;
            System.out.println("Element Inserted at " + rear + " location");
            nItem++;
        }
    }

    public int remove() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int temp = Qarray[front];
            front = (front + 1) % maxSize;
            nItem--;
            System.out.println("Element Removed from " + (front - 1) + " location");
            return temp;
        }
    }

    public void display() {
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = 0; i < nItem; i++) {
                System.out.print(Qarray[(front + i) % maxSize] + " "); 
            }
            System.out.println(); 
        }
    }
    
    

    public static void main(String[] args) {
        QueueDS q = new QueueDS(5); 
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display(); 
        
        q.remove();
        q.display(); 
    }
}
