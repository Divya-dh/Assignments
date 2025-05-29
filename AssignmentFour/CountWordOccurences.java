import java.util.*;
public class CountWordOccurences {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String search = sc.nextLine();
        String[] words = str.split(" ");
        int count = 0;
        for(String word : words){
            if(word.equals(search)){
                count++;
            }
        }
        System.out.println(count);
    }
}
