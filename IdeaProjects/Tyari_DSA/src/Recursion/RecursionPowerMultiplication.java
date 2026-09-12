package Recursion;

import java.util.Scanner;

public class RecursionPowerMultiplication {

    static int powerMultiplication(int n , int p) {

        //base case
        if(p == 0) {
            return 1;
        }

        //Recursive work and self work

        int smallPow = powerMultiplication(n,p/2);

        if(p % 2 == 0) {
            return smallPow * smallPow;
        }

            return n * smallPow * smallPow;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

      System.out.println(powerMultiplication(n,p));
    }
}
