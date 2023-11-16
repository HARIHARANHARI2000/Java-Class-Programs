package Access_Modifier.Sub_Modifier;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>queue=new LinkedList<Integer>();
		queue.offer(20);
		queue.offer(34);
		queue.offer(56);
		queue.offer(22);
		queue.offer(43);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println("peek:"+queue.peek());

	}

}
