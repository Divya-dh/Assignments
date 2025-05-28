import java.util.Scanner;
public class CheckCharacter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println(c+" is a Vowel");
            }
            else{
                System.out.println(c+" is a Consonant");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
