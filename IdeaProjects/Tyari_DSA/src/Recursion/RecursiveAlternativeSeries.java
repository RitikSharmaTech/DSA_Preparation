package Recursion;

import java.util.Scanner;

public class RecursiveAlternativeSeries {

    static int alternativeSeries(int n) {

        //bases case

        if(n == 0) {
            return 0;
        }

        //recursive work and self work

        if(n % 2 == 0) {
            return alternativeSeries(n-1) - n;
        }
        else {
            return alternativeSeries(n-1) + n;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(alternativeSeries(n));
    }
}
