import java.util.*;
public class StringRotationCheck {
    static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s2;
        return concatenated.contains(s2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isRotation(s1,s2));
    }
}
