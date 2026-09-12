package LinkedList;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class Linklist {
    Node head;
    Node tail;
    int size;

    void addTail(int val){
        Node temp = new Node(val);
        if(tail == null) {
            head = tail = temp;
            return;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addHead(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = tail = null;
            return;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void displayList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {

        Node temp = head;
        for(int i = 0; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    int search(int val){
        if(head == null) return -1;

       Node temp = head;
       int idx = 0;
        while(temp != null) {
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void insert(int val, int idx) {
        if(idx < 0 || idx > size) {
            System.out.println("Invalid !");
            return;
        }
      else if(idx == 0) addHead(val);
       else if(idx == size) addTail(val);
       else {
           Node temp = head;
           for(int i = 0; i<=idx-1; i++) {
               temp = temp.next;
           }
           Node t = new Node(val);
           t.next = temp.next;
           temp.next = t;
           size++;
       }
    }
}

public class Display {
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addTail(10);
        ll.addTail(20);
        ll.addTail(30);
        ll.addTail(40);
        ll.addTail(50); ll.displayList();
        ll.addHead(60); ll.displayList();
        System.out.println(ll.get(4));
        System.out.println(ll.search(30));
        ll.insert(100,3); ll.displayList();
    }
}
