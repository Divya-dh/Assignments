import java.util.*;
public class NumberOfDigits {
    static int noOfDigits(int n){
        n = Math.abs(n);
        if(n<10){
            return 1;
        }
        return 1 + noOfDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number of digits in " +num+ " is " + noOfDigits(num));
    }
}
