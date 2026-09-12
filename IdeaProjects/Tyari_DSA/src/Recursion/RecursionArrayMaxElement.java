package Recursion;

public class RecursionArrayMaxElement {

    static int printMaximum(int[] arr, int index) {

        //base work
        if(index == arr.length-1) {
            return arr[index];
        }

        //recursive and self work
        int smallAns = printMaximum(arr, index+1);

        return Math.max(arr[index] , smallAns);
    }
    public static void main(String[] args) {
        int[]  arr = {62,5,13,62,9};

       System.out.println(printMaximum(arr,0));
    }
}
