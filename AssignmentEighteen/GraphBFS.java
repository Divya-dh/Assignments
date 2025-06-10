import java.util.*;
public class GraphBFS {
    ArrayList<ArrayList<Integer>> adj_list;
    int num_vertices;
    GraphBFS(int num_vertices) {
        this.num_vertices = num_vertices;
        adj_list = new ArrayList<>();
        for (int i = 0; i < num_vertices; i++) {
            adj_list.add(new ArrayList<>());
        }
    }
    void addedge(int source, int dest) {
        adj_list.get(source).add(dest);
    }
    void printGraph() {
        for (int i = 0; i < num_vertices; i++) {
            System.out.print(i + "-->");
            for (int n : adj_list.get(i)) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    List<Integer> bfsTraversal(int start) {
        List<Integer> bfsResult = new ArrayList<>();
        boolean[] visited = new boolean[num_vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            bfsResult.add(current);
            for (int neighbor : adj_list.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return bfsResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();
        sc.nextLine(); 
        GraphBFS g = new GraphBFS(n);
        System.out.println("Enter adjacency list row-wise:");
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            for (String s : parts) {
                if (!s.isEmpty()) {
                    int neighbor = Integer.parseInt(s);
                    g.addedge(i, neighbor); 
                }
            }
        }
        g.printGraph();
        List<Integer> bfs = g.bfsTraversal(0);
        System.out.println(bfs);
    }
}
