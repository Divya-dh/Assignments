import java.util.*;
public class GraphDFS {
    ArrayList<ArrayList<Integer>> adj_list;
    int num_vertices;
    GraphDFS(int num_vertices) {
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
    void dfsUtil(int current, boolean[] visited, List<Integer> dfsResult) {
        visited[current] = true;
        dfsResult.add(current);
        for (int neighbor : adj_list.get(current)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited, dfsResult);
            }
        }
    }
    List<Integer> dfsTraversal(int start) {
        List<Integer> dfsResult = new ArrayList<>();
        boolean[] visited = new boolean[num_vertices];
        dfsUtil(start, visited, dfsResult);
        return dfsResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();
        sc.nextLine(); 
        GraphDFS g = new GraphDFS(n);
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
        List<Integer> dfs = g.dfsTraversal(0);
        System.out.println(dfs);
    }
}
