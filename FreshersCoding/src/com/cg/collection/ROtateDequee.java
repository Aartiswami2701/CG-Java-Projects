package com.cg.collection;
//Rotate a Deque
//Given a Deque of integers, rotate it K times to the right.
import java.util.*;
public class ROtateDequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter kth location : ");
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int last = deque.removeLast();
            deque.addFirst(last);
        }

        System.out.println(deque);

	}

}
