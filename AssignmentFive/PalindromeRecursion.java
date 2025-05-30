import java.util.*;
public class PalindromeRecursion {
    static boolean checkPalindrome(String s,int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return checkPalindrome(s,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkPalindrome(str,0,str.length()-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
