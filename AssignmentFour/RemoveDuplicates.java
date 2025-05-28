import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String result = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
               if(result.indexOf(c) == -1){
                result = result + c;
            }
        }
        System.out.println(result);
    }
}
