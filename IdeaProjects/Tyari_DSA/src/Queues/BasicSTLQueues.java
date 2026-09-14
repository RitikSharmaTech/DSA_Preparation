package Queues;

import java.util.LinkedList;
import java.util.Queue;
public class BasicSTLQueues {
    static void main() {
        Queue<Integer> q = new LinkedList<>();

        q.add(10); q.add(20); q.add(30);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}
