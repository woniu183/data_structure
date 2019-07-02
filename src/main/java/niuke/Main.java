package niuke;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] meta_arr =new int[n];
        int[] target_arr =new int[n];
        String s =sc.next();

        for(int i=0;i<meta_arr.length;i++){
            meta_arr[i] =Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        String s2=sc.next();

        for(int j=0;j<target_arr.length;j++){
            target_arr[j]=Integer.parseInt(String.valueOf(s2.charAt(j)));
        }
        int count =0;
        for(int k=0;k<target_arr.length;k++){
            if(target_arr[k]-meta_arr[k]>5){
                count += meta_arr[k]+10-target_arr[k];
            }else if(target_arr[k]-meta_arr[k]>=0&&target_arr[k]-meta_arr[k]<=5){
                count +=target_arr[k]-meta_arr[k];
            }else if(target_arr[k]<meta_arr[k]&&meta_arr[k]-target_arr[k]<=5){
                count +=meta_arr[k]-target_arr[k];
            }else if(target_arr[k]<meta_arr[k]&&meta_arr[k]-target_arr[k]>5){
                count +=10-meta_arr[k]+target_arr[k];
            }
        }

        System.out.println(count);


    }
}
