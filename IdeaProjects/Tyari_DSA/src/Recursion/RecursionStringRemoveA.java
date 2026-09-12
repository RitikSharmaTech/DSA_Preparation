package Recursion;

import java.util.Scanner;

public class RecursionStringRemoveA {

    static String removeA(String s) {

        //base case
        if(s.length() == 0) return "";

        //recursive and self work

        String smallAns = removeA(s.substring(1));
        char currentChar = s.charAt(0);

        if(currentChar != 'a') {
            return currentChar+ smallAns;
        } else {
            return smallAns;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeA(s));
    }
}
