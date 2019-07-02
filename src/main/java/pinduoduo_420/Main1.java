package pinduoduo_420;



import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个长度为偶数的数组arr，
 * 将数组中的元素两两配对并求和，在这些和中，
 * 选出最大和最小，求问如何配对，才能使得最大值和最小值的差值最小
 */
public class Main1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        Arrays.sort(arr);
        if(n == 2){
            System.out.println(0);
            return;
        }

        int[] res =new int[n/2];
        for(int i=0;i<res.length;i++){
            res[i] =arr[i]+arr[n-1-i];
        }
        Arrays.sort(res);
        System.out.println(res[res.length-1] - res[0]);

    }

}
