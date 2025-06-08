import java.util.*;
public class RatInMaze {
    static int[] rowDir = {1, 0, 0, -1};  
    static int[] colDir = {0, -1, 1, 0};
    static char[] moveChar = {'D', 'L', 'R', 'U'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        if (maze[0][0] == 1 && maze[n - 1][n - 1] == 1) {
            solveMaze(maze, 0, 0, "", visited, result, n);
        }
        if (result.isEmpty()) {
            System.out.println("No paths found.");
        } else {
            Collections.sort(result);
            for (String path : result) {
                System.out.println(path);
            }
        }
        sc.close();
    }
    public static void solveMaze(int[][] maze, int x, int y, String path, boolean[][] visited, List<String> result, int n) {
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + rowDir[i];
            int newY = y + colDir[i];
            if (isValidMove(newX, newY, maze, visited, n)) {
                solveMaze(maze, newX, newY, path + moveChar[i], visited, result, n);
            }
        }
        visited[x][y] = false;
    }
    public static boolean isValidMove(int x, int y, int[][] maze, boolean[][] visited, int n) {
        return x >= 0 && y >= 0 && x < n && y < n &&
               maze[x][y] == 1 && !visited[x][y];
    }
}
