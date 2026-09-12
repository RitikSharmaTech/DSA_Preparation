package LinkedList;

class LinkList {
    Node head;
    Node tail;
    int size;

    int searchElement(int val) {

        if (head == null) return -1;
        Node temp = head;

        int index = 0;
        while (temp != null) {
            if (temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void AddAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;

        }
        size++;
    }

    void AddAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void Display() {

        if (head == null) return;
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void DeleteHead() {

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size) System.out.println("Invalid index!");
        else if (idx == 0) AddAtHead(val);
        else if (idx == size) AddAtTail(val);
        else {
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;

        }
    }

    int getElement(int index) {
        Node temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void DeleteElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (index == 0) {
            DeleteHead();
            return;
        }

        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if (index == size - 1) tail = temp;
        size--;
    }

    
}
public class AddElementLinklist {
      void main() {

        LinkList ll = new LinkList();

        ll.AddAtTail(10);
        ll.AddAtTail(20);
        ll.AddAtTail(30);
        ll.AddAtTail(40); ll.Display();
        ll.AddAtHead(50);
        ll.AddAtHead(60); ll.Display();
        ll.DeleteHead(); ll.Display();
        System.out.println(ll.size);

       ll.insert(40,2);
       ll.Display();

       System.out.println(ll.getElement(4));

       ll.DeleteElement(2);  ll.Display();

    }
}
