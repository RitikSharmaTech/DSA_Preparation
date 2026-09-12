package Stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Rohan");
        st.push("Raghav");
        st.push("Deepak");
        st.push("Roshan");
        st.push("Anuj");

        System.out.println(st.size());  //size printing
        System.out.println(st);    //puri string print karna ka liy hai
        System.out.println(st.peek());   //last element print karna ka liya hai
//        System.out.println(st.pop());    //last element print karna ka liya hai
        st.pop();

    }
}
