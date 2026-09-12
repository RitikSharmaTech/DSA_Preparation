package Recursion;

public class RecursionArraySumElement {

    static int sumElement(int[] arr, int index) {

        //base case
        if(index == arr.length-1) {
            return arr[index];
        }

        //recursive and self work
        return sumElement(arr,index+1) + arr[index];
    }
    static void main() {
        int[] arr = {1,4,6,2,1};

        System.out.println(sumElement(arr,0));
    }
}
