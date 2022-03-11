import java.util.*;

public class QueAddRemove {
	public static void main(String[] args)
		throws IllegalStateException
	{
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(423);
		Q.add(3432);
		System.out.println("queue " + Q);
		System.out.println("removed 1st no" + Q.remove());
		System.out.println("removed 2nd no" + Q.remove());
		System.out.println("Queue: " + Q);
		try {
			System.out.println("queue " + Q.element());
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
