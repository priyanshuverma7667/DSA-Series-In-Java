package QUeue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String arg[]) {
        Queue q = new LinkedList();

        q.add(10);
        q.add(20);
        q.add(30);
        q.remove(10);

        System.out.print(q);
    }
}
