package Recursion;

import java.util.Scanner;

public class RecursionStringReverse {

    static String reverse(String s, int index) {

        //base case
        if(index == s.length()) return "";

        //recursive and self work
        return  reverse(s,index+1) + s.charAt(index);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

        System.out.println(reverse(s,0));

         //palindrome code
//
//        String rev = reverse(s,0);
//
//        if(rev.equals(s)) {
//            System.out.println("palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }
    }
}
