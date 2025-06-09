import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class LevelOrderTraversal {
    public static Node buildTreeFromArray(int[] arr){
        if(arr.length == 0 || arr[0] == -1)
        return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while(!q.isEmpty() && i < arr.length){
            Node curr = q.poll();
            if(i < arr.length && arr[i] != -1){
                curr.left = new Node(arr[i]);
                q.offer(curr.left);
            }
            i++;
            if(i < arr.length && arr[i] != -1){
                curr.right = new Node(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    static void levelOrder(Node root){
        if(root == null)
        return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null)
            q.offer(curr.left);
            if(curr.right != null)
            q.offer(curr.right);
        }
    }
   public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Node root  = buildTreeFromArray(arr);
    levelOrder(root);
   } 
}
