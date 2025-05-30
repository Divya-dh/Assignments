import java.util.*;
public class FirstNonRepeatingChar {
    static int firstUniqueChar(String s){
        int[] frequency = new int[26];
        for(char c: s.toCharArray()){
            frequency[Character.toLowerCase(c) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(frequency[Character.toLowerCase(s.charAt(i)) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = firstUniqueChar(s);
        System.out.println(i);
    }
}
