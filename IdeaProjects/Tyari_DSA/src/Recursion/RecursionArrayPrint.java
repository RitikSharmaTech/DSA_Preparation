package Recursion;

public class RecursionArrayPrint {

    static void printArray(int[] arr, int index) {

        //base case
        if(index == arr.length) {
            return;
        }

        //recursive and self work
        System.out.print(arr[index] + " ");
        printArray(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,7};

        printArray(arr, 0);
    }
}
