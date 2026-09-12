package Recursion;

import java.util.Scanner;

public class RecursionGCD {

    static int gcd(int x, int y) {

        //base case

        if(y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x,y));
    }
}
