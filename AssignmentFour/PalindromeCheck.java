import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            reverse = str.charAt(i) + reverse ;
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
             System.out.println("Not Palindrome");
        }
    }
}
