package zijietiaodong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] meta_arr =new int[n];


        for(int i=0;i<meta_arr.length;i++){
            meta_arr[i] =sc.nextInt();


        }
        for(int i=0;i<meta_arr.length;i++){
            System.out.println(meta_arr[i]);
        }

    }
}
