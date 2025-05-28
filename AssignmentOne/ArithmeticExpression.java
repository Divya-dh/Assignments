import java.util.Scanner;
public class ArithmeticExpression {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double d = sc.nextDouble();
        int add = num1 + num2;
        System.out.println("Addition: "+(add));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println(((double)add) * d);
    }
}
