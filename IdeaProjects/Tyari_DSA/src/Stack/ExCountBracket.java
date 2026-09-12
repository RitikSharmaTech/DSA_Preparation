package Stack;

import java.util.*;

public class ExCountBracket {
    public  static int isBalance(String str) {
        Stack<Character> st = new Stack<>();   //character stack
        int n = str.length();
        int extraBrackets = 0;

        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);

            if(ch=='(') {
                st.push(ch);
            }
            else {
                if(st.size()==0) extraBrackets++;
                else{
                    st.pop();
                }
            }
        }
        return st.size() + extraBrackets;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String! ");
        String str = sc.nextLine();

        System.out.println(isBalance(str));
    }
}
