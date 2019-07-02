package meituan_423;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]  arr =new  int[n];
        int[]  res =new  int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
            res[i] =count(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }


    }

    public  static int  count(int n){
        if(n==1) {
            return 2;
        }else if((4*n)%(n+1)==0){
           return (4*n)/(n+1)+1;
        }else {
            return 4 * n + 1;
        }
    }
}
