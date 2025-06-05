import java.util.Scanner;
class Node {
    int data;
    Node next, prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList1 {
    Node head;
    void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
    }
    void insertAtBegin(int data) {
        Node newnode = new Node(data);
        if (head != null) {
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
    }
    void insertAtEnd(int data) {
        add(data);
    }
    void insertAtPos3(int data) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        Node newnode = new Node(data);
        Node temp = head.next.next; 
        newnode.prev = temp.prev;
        newnode.next = temp;
        temp.prev.next = newnode;
        temp.prev = newnode;
    }
    void deleteFirst() {
        head = head.next;
        if (head != null) head.prev = null;
    }
    void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }
    void deleteAtPos3() {
        if (head == null) return;
        Node temp = head;
        int count = 1;
        while (temp != null && count < 3) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.prev == null || temp.next == null) {
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList1 list = new DoublyLinkedList1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        list.print();
        list.insertAtBegin(5);
        System.out.println("After inserting at beginning:");
        list.print();
        list.insertAtEnd(60);
        System.out.println("After inserting at end:");
        list.print();
        list.insertAtPos3(99);
        System.out.println("After inserting at 3rd position:");
        list.print();
        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.print();
        list.deleteLast();
        System.out.println("After deleting last node:");
        list.print();
        list.deleteAtPos3();
        System.out.println("After deleting 3rd node:");
        list.print();
        sc.close();
    }
}
