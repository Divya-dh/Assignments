import java.util.Scanner;
public class Typeconversion{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    float f = sc.nextFloat();
    char c = sc.next().charAt(0);
    System.out.println((float)num + f);
    System.out.println((int)c + num);
    }
}
