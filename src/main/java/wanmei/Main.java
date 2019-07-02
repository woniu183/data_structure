package wanmei;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr1=new int[n];
        int[]  arr2=new int[n];

        for(int i=0;i<n;i++){
            arr1[i] =sc.nextInt();
        }
        for(int j=0;j<n;j++){
            arr2[j] =sc.nextInt();
        }

        if(n ==0){
            System.out.println(0);
            return;
        }else if(n==1){
            if(arr1[0] >arr2[0]){
                System.out.println(100);
            }else if(arr1[0] ==arr2[0]){
                System.out.println(0);
            }else {
                System.out.println(-100);
            }
            return;

        }
        int m =n-1;
        while (m>=0 &&arr1[m] ==arr2[m]){
            m--;
        }
        if(m ==0){
            System.out.println(0);
            return;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=n-1,j=n-1;
        int cnt =0;

        for(;i>=0;i--){
            while (arr2[j] >=arr1[i] &&j>0){
                j--;
            }
            if(j>0){
                cnt++;
            }else if(j==0 &&arr1[i] >arr2[0]){
                cnt++;
                break;
            }
        }


        int point =100*(cnt-(n-cnt));
        System.out.println(point);




    }
}
