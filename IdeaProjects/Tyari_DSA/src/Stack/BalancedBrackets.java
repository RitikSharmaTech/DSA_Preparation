package Stack;
import java.util.*;
public class BalancedBrackets {

   public  static boolean isBalance(String str) {
         Stack<Character> st = new Stack<>();   //character stack
         int n = str.length();

         for(int i=0; i<n; i++) {
             char ch = str.charAt(i);

             if(ch=='(') {
                 st.push(ch);
             }
             else {
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
                 }
             }
             if(st.size()>0) return false;
             return true;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String! ");
        String str = sc.nextLine();

        System.out.println(isBalance(str));
    }
}
