package in.co.collectionInterface;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface  {

	public static void main(String[] args) {
		Queue q =new LinkedList();
		q.offer("abc");		
		
		q.offer("xyz");
		q.add("nnn");
		
		q.remove(0);
		q.poll();
		q.offer("kkk");
		q.element();
		q.peek();

	}

}
