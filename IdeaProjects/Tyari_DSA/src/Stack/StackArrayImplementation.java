package Stack;

public class StackArrayImplementation {

    public static class Stack {
       private int[] arr = new int[400];
       private int idx = 0;

       void push(int val) {
           if(isFull()) {
               System.out.println("Stack is full!");
               return;
           }
           arr[idx] = val;
           idx++;
       }
       int peek() {
           if(idx==0) {
               System.out.println("Stack is empty!");
               return -1;
           }
           return arr[idx-1];
       }
       int pop() {
           if (idx==0) {
               System.out.println("Stack is empty!");
               return -1;
           }
           int top = arr[idx-1];
           arr[idx-1] = 0;
           idx--;
           return top;
       }
       void display() {
           for(int i = 0; i <= idx-1; i++) {
               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }
       int size() {
           return idx;
       }
       boolean isEmpty() {
           if(idx == 0) return true;
           return false;
       }
       boolean isFull() {
           if(idx==arr.length) {
               return true;
           }
           return false;
       }
       int capacity() {
           return arr.length;
       }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();   //10
        st.push(20);
        st.display();   //10 20
        st.push(30);
        st.display();   //10 20 30
        st.peek();     //30
        System.out.println(st.pop());
        st.display();   //10 20
        System.out.println(st.size());
        st.push(50);
        st.push(90);
        st.display();
        System.out.println(st.capacity());
    }
}
