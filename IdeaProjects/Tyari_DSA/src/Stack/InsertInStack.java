package Stack;
import java.util.Stack;
public class InsertInStack{
    static void insert(Stack<Integer> st, int idx, int element) {
        Stack<Integer> temp = new Stack<>();

        while(st.size()>idx) {
            temp.push(st.pop());
        }
        st.push(element);  //adding the element:

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

        insert(st,0,100);
        System.out.println(st);
    }
}
