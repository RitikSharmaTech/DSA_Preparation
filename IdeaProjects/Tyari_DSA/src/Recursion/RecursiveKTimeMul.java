package Recursion;

import java.util.Scanner;

public class RecursiveKTimeMul {

    static void kTimeMultiplication(int n, int k) {

        //base case

        if(k == 0) {
            return ;
        }

        //recursive work and self work

        kTimeMultiplication(n,k-1);
        System.out.println(n*k);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        kTimeMultiplication(n,k);
    }
}
