package pinduoduo_2;


import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       if(n==2){
           System.out.println(0);
       }
       int[] res =new int[n];
       for(int i=0;i<n;i++){
           res[i] =arr[i]+arr[arr.length-i-1];
       }
        Arrays.sort(res);
       System.out.println(res[res.length-1]-res[0]);

    }
}
