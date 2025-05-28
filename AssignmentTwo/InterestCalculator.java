import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        System.out.println("Enter principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter time taken: ");
        double t = sc.nextDouble();
        double si;
        double ci;
        switch(choice){
            case 1 : 
            si = p*r*t/100;
            System.out.println("Simple interest: "+si);
            break;
            case 2 :
            System.out.println("Enter number of times interest is compounded");
            int n = sc.nextInt();
            ci = p * Math.pow((1 + r / n), n * t) - p;
            System.out.println("Compound interest: "+ci);
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
