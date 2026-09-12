package Stack;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek() {
            if(head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }
        int pop() {
            if(head==null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int size() {
            return size;
        }
        boolean isEmpty() {
            if(size==0) return true;
            return false;
        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display() {
            displayRec(head);
            System.out.println();
        }
        void displayReverse() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(10);
        st.displayReverse();   //10
        st.push(20);
        st.displayReverse();   //10 20
        st.push(30);
        st.displayReverse();   //10 20 30
        st.peek();     //30
        System.out.println(st.pop());
        st.displayReverse();   //10 20
        System.out.println(st.size());
        st.push(50);
        st.push(90);
        st.display();
        System.out.println();
//        st.displayReverse();
    }
}
