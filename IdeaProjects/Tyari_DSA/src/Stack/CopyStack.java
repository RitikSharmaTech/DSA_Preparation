package Stack;
import java.util.Stack;
import java.util.Scanner;
public class CopyStack {
    static void printScanner(Stack<Integer> st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number! ");
        int n = sc.nextInt();
        System.out.println("Enter the elements! ");
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
    static void reverseStack(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) {
            rt.push(st.pop());
        }
        Stack<Integer> temp = new Stack<>();
        while(rt.size()>0) {
            temp.push(rt.pop());
        }
        System.out.println(temp);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
