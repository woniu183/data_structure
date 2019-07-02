package pinduoduo_2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(arr[0]>0&&A ==1){
            System.out.println(0);
        }
        if(arr[0]>0&&B ==1){
            System.out.println(0);
        }



    }
}
