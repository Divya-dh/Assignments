import java.util.*;
public class MaxSubarraySum {
    static int maxSubarraySum(int[] nums){
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = maxSubarraySum(arr);
        System.out.println(maxSum);
    }
}
