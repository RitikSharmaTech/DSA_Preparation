package Stack;

import java.util.Stack;

public class DisplayStack {
    static void display(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0) {
            temp.push(st.pop());
        }

        while(temp.size()>0) {
            int top = temp.pop();
            System.out.print(top+" ");
            st.push(top);
        }
    }

    static void displayArray(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];

        for(int i=n-1; i>=0; i--) {
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++) {
            int x = arr[i];
            System.out.print(x+" ");
            st.push(arr[i]);
        }
    }

    static void displayRecursion(Stack<Integer> st) {
        if(st.size()==0) return;

        int top = st.pop();
        displayRecursion(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

//        display(st);
//        displayArray(st);
        displayRecursion(st);
        System.out.println(st);
    }
}
