import java.util.*;
public class NQueens {
    static List<List<String>> solutions = new ArrayList<>();
    public static boolean solve(char[][] board, int row, int n) {
        if (row == n) {
            solutions.add(createBoard(board));
            return true; 
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(board, row + 1, n);
                board[row][col] = '.'; 
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
    public static List<String> createBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board)
            res.add(new String(row));
        return res;
    }
    public static void printSolutions() {
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        solve(board, 0, n);
        if (solutions.isEmpty()) {
            System.out.println("No solution");
        } else {
            printSolutions();
        }
    }
}
