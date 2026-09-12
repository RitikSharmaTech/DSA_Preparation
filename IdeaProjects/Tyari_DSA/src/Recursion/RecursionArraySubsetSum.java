package Recursion;

public class RecursionArraySubsetSum {

    static void printSubsetSum(int[] arr, int index, int currSum) {

        //base case
        if(index >= arr.length) {
            System.out.println(currSum);
            return ;
        }
        //recursive and self work
        printSubsetSum(arr,index+1, currSum+arr[index]);

        printSubsetSum(arr,index+1,currSum);
    }
    static void main() {
        int[] arr = {2,3,4};

        printSubsetSum(arr,0,0);
     }
}
