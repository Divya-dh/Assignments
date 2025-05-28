import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1^num2);
        System.out.println(num1<<2);
        System.out.println(num2<<2);
        System.out.println(num1>>2);
        System.out.println(num2>>2);
    }
}
