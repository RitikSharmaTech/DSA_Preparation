package Recursion;

public class RecursionStringOccurence {

    static void printSSQ(String s, String currAns) {

        //base case
        if(s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char currChar = s.charAt(0);
        printSSQ(s.substring(1), currAns + currChar);

        printSSQ(s.substring(1), currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
}
}
