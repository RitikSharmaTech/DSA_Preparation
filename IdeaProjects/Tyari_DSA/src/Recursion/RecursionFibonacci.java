package Recursion;

import java.util.Scanner;

public class RecursionFibonacci {

    static int fibonacci(int n) {

        //base condition
        if(n == 0 || n == 1) {
            return n;
        }

        //recursive and self work

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public  void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
