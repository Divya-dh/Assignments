import java.util.*;
public class LetterCombinations {
    private static final Map<Character, String> digitToChar = Map.of(
        '2', "abc", '3', "def",
        '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs",
        '8', "tuv", '9', "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }
    private void backtrack(int index, String digits, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = digitToChar.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(index + 1, digits, current, result);
            current.deleteCharAt(current.length() - 1); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        LetterCombinations solver = new LetterCombinations();
        List<String> combinations = solver.letterCombinations(input);
        if (!input.matches("[2-9]+")) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(combinations);
    }
}
