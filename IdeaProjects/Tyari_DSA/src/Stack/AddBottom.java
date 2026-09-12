package Stack;
import java.util.Stack;
public class AddBottom{
    static void pushBottom(Stack<Integer> st, int ele) {
        if(st.size()==0) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushBottom(st,ele);
        st.push(top);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

        pushBottom(st,50);
        System.out.print(st);
    }
}