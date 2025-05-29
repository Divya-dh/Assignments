import java.util.*;
public class ToggleCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
                if(c>='a' && c<='z'){
                    sb.append(Character.toUpperCase(c));
                }
                else if(c>='A' && c<='Z'){
                    sb.append(Character.toLowerCase(c));
                }
        }
        System.out.println(sb.toString());
    }
}
