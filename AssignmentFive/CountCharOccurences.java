import java.util.*;
public class CountCharOccurences {
    static int countChar(String s,char t, int i){
        if(i == s.length()){
            return 0;
        }
        if(s.charAt(i) == t){
            return 1 + countChar(s,t,i+1);
        }
        return countChar(s,t,i+1);
    }
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         char c = sc.next().charAt(0);
         System.out.println(countChar(str,c,0));
    }
}
