package Recursion;

import java.util.Scanner;

public class RecursionArrayTargetValue {

    static boolean targetFinding(int[] arr, int target, int index) {

        //base case
        if(index >= arr.length)  return false;

        //recursive and self work
        if(arr[index] == target)   return true;

        return targetFinding(arr, target, index+1);
    }

    static int searchTarget(int[] arr, int target, int index) {

        //base case
        if (index >= arr.length) return -1;

        //recursive and self work
        if (arr[index] == target) return index;

        return searchTarget(arr, target,index+1);
    }

    static void findIndexing(int[] arr, int target, int index) {

        //base case
        if(index >= arr.length) return;

        //recursive and self work

        if(arr[index] == target) {
            System.out.println(index);
        }

        findIndexing(arr, target,index+1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[] arr = {2,5,4,4,1,6,4,8,4,3,4,2};
//
//        if(targetFinding(arr, target, 0)) {
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

//        System.out.println(searchTarget(arr,target,0));

        findIndexing(arr,target,0);

    }
}
