package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
public class PrintingLinkList {

    static void DisplayRecursion(Node head){

        //base case
        if(head == null) return;

        //recursive and self work
        System.out.print(head.val+" ");
        DisplayRecursion(head.next);
    }

     static void Display(Node head) {
//        Node start = head;
//
//        while(start != null) {
//            System.out.print(start.val+ " ");
//            start = start.next;
//        }

        //for loop condition

        for(Node start = head; start != null; start = start.next) {
            System.out.print(start.val+ " ");
        }

        System.out.println();
    }
    static int get(Node head, int index) {     //get the index element value

        Node temp = head;
        for(int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

     public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; b.next = c;
        c.next = d; d.next = e;

//        Display(a);
        DisplayRecursion(a);
//
//        System.out.println(get(a,2));
    }
}
