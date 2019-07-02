package qiye360;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]  arr =new int[10000];
        for(int i=0;i<n;i++){
            int j =sc.nextInt();
            arr[j] ++;

        }

        int res;
        res =main(arr);
        System.out.println(String.valueOf(res));


    }

    public  static int main(int[] arr){

        for(int i=0;i<arr.length;i++){
            if (arr[i]>0&&arr[i] <2){
                return 0;
            }
        }
        Arrays.sort(arr);
        int min1 =0;
        int min2 =0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                 min1 =arr[j];
                 min2 =arr[j+1];
                break;
            }
        }
        int gcd =getGCD(min1,min2);
        if(gcd ==1){
            return 0;
        }

        int cnt =0;
        for(int k=0;k<arr.length;k++){
            if(arr[k] %gcd ==0){
            cnt +=arr[k]/gcd;
            }else {
                return 0;
            }
        }

        return cnt;
    }

    public static int getGCD(int x,int y){
        int num =1;
        for(int i=1;i<=x;i++){
            if(x %i==0&& y %i ==0){
                num =i;
            }
        }
        return num;

    }
}
