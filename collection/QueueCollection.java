package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		//it follows the FIFO principle
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
	}
}
