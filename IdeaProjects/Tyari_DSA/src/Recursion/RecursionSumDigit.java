package Recursion;

import java.util.Scanner;

public class RecursionSumDigit {

    static int sumDigit(int n) {

        //base case
        if(n >= 0 && n <= 9) {
            return n;
        }
        return sumDigit(n/10) + n % 10;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sumDigit(n));
    }
}
