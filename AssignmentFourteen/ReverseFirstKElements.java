import java.util.*;
public class ReverseFirstKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        if (queue == null || k <= 0 || k > queue.size()) {
            return queue; 
        }
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
        return queue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(queue);
        Queue<Integer> result = reverseKElements(queue, k);
        System.out.println(result);
    }
}

