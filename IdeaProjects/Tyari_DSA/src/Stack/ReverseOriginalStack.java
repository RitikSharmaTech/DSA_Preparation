package Stack;

import java.util.Stack;

public class ReverseOriginalStack {
    static void reverse(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0) {
            st2.push(st.pop());
        }
        Stack<Integer> temp = new Stack<>();
        while(st2.size()>0) {
            temp.push(st2.pop());
        }
        while(temp.size()>0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
