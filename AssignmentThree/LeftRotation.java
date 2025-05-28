import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k%n;
        int [] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[(i+k)%n];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i] + " ");
        }
    }
}
