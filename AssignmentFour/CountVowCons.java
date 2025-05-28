import java.util.*;
public class CountVowCons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
