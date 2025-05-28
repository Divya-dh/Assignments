import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if(sb.length()>=1 && sb.length()<=1000){
              System.out.println(sb.reverse());
        }
    }
}
