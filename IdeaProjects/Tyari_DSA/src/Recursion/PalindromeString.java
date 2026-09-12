package Recursion;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String s, int start, int end) {

        //base case
        if(start >= end) return true;

        return (s.charAt(start) == s.charAt(end) && isPalindrome(s,start+1, end-1));
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
