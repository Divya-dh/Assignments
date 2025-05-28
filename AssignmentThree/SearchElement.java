import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=1;
                System.out.println("Element found at position: "+i);
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
}
