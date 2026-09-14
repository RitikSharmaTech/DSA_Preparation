package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalQueue {
    private static void display(Queue<Integer> q) {
        int n = q.size();

        for(int i=1; i<=n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    private static   void AddAnyIndex(Queue<Integer> q, int idx, int val) {
      if(idx<0 || idx > q.size()) {
          System.out.println("Error");
          return;
      }
      int n = q.size();
      if(idx<n) {
          for(int i=1; i<=idx; i++) {
              q.add(q.remove());
          }
      }
      q.add(val);
      for(int i=1; i<=n-idx; i++) {
          q.add(q.remove());
      }
    }
    private static void remove(Queue<Integer> q, int idx){
        for(int i=1; i<=idx; i++){
            q.add(q.remove());
        }
        q.remove();
        int n = q.size();     //new size after remove element
        for(int i=1; i<=n-idx; i++){
            q.add(q.remove());
        }
    }
    private static int peek(Queue<Integer> q, int idx){
        int n = q.size();
        for(int i=1; i<=idx; i++){
            q.add(q.remove());
        }
        int value = q.peek();
        for(int i=1; i<=n-idx; i++){
            q.add(q.remove());
        }
        return value;
    }
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        display(q);
        AddAnyIndex(q,2,60);
        display(q);
        remove(q,2);
        display(q);
        System.out.println(peek(q,2));
        display(q);
    }
}
