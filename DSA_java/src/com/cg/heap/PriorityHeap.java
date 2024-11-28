package com.cg.heap;
//priority queue implementation
public class PriorityHeap {
	int Arrayheap[];
	int size;
	int capacity;
	

	public PriorityHeap(int capacity) {
		super();
		this.capacity=capacity;
		this.size=0;
		Arrayheap= new int[capacity];
	}
	
	public int parent(int index) {
		return (index-1)/2;
	}
	public int left(int index) {
		return (2*index+1);
	}
	public int right(int index) {
		return (2*index+2);
	}
	public void Swap(int index1,int index2) {
		int temp=Arrayheap[index1];
		Arrayheap[index1]=Arrayheap[index2];
		Arrayheap[index2]=temp;
	}
	
	public void insert(int value) {
		if(size==capacity) {
			System.out.println("heap is full");
			//throw new IllegalStateException();
			
		}
		Arrayheap[size]=value;
		size++;
		heapifyup(size-1);
	}
	
	public void heapifyup(int index) {
		while((index!=0) && Arrayheap[parent(index)]<Arrayheap[index]) {
			Swap(parent(index),index);
			index=parent(index);
		}
	}
	
	public boolean IsEmpty() {
		return (size==0);
	}
	
	public int getMax() {
		if(size==0) {
			throw new IllegalStateException();
		}
		return Arrayheap[0];
	}
	
	
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(Arrayheap[i]);
		}
	}
	
	
	public int removeMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int maxValue = Arrayheap[0];
        Arrayheap[0] = Arrayheap[size - 1];
        size--;
        heapifyDown(0);
        return maxValue;
    }
	
	  
	
	  private void heapifyDown(int current) {
	        int maxIndex = current;
	        int left = left(current);
	        int right = right(current);
	 
	        if (left < size && Arrayheap[left] > Arrayheap[maxIndex]) {
	        	maxIndex = left;
	        }
	        if (right < size && Arrayheap[right] > Arrayheap[maxIndex]) {
	        	maxIndex = right;
	        }
	        if (maxIndex != current) {
	            Swap(current, maxIndex);
	            heapifyDown(maxIndex);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityHeap ph= new PriorityHeap(5);
		ph.insert(15);
		ph.insert(20);
		//System.out.println("MAx Heap :"+ph.getMax());
		ph.insert(7);
		ph.insert(9);
		//System.out.println("MAx Heap :"+ph.getMax());
		ph.insert(30);
		System.out.println("MAx Heap :"+ph.getMax());
		ph.display();
		
		/*  System.out.println("Removed maximum: " + ph.removeMax()); // 30
	      System.out.println("Next maximum: " + ph.getMax()); // 20
	      ph.display();
	      
	      System.out.println("Removed maximum: " + ph.removeMax());//20
	      System.out.println("Next maximum: " + ph.getMax());//15
	      ph.display();
	        
	      System.out.println("Removed maximum: " + ph.removeMax());//15
	      System.out.println("Next maximum: " + ph.getMax());//9
	      ph.display();
	        
	      System.out.println("Removed maximum: " + ph.removeMax());//9
	      System.out.println("Next maximum: " + ph.getMax());//7 */
		System.out.println("Min Heap :"+ph.getMax());
		ph.display();
	        
	}

}
