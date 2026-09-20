package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKTime {
    private static Queue<Integer> reverseKTime(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        int n = q.size();
        for(int i=1; i<=n-k; i++){
            q.add(q.remove());
        }
        return q;
    }

    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        System.out.println(q);
        System.out.println(reverseKTime(q,3));
    }
}
