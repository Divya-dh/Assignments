import java.util.*;
public class MajorityElement {
    static int findMajorityElement(int[] arr){
        int count = 0;
        int element = 0;
        for(int num : arr){
            if(count == 0){
                element = num;
            }
            count += (num == element) ? 1 : -1;
        }
        return element;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int majority = findMajorityElement(arr);
        System.out.println(majority);
    }
}
