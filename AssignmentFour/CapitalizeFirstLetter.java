import java.util.*;
public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetter(String sentence){
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for(String word : words){
            if(word.length()>0){
                sb.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1))
                .append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String sb = sc.nextLine();
    System.out.println(capitalizeFirstLetter(sb));
   }
}
