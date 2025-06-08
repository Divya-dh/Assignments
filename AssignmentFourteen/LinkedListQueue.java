class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListQueue {
    Node front = null;
    Node rear = null;
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }

        return result;
    }
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
    }
}



