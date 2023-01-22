package collection;

import java.util.PriorityQueue;

public class PriorityQ 
{

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(34);
		pq.add(345);
		pq.add(33);
		pq.add(678);
		pq.add(444);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}
	
}
