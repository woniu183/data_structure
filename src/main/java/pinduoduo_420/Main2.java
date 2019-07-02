package pinduoduo_420;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * 现有数字0-9 已知每个数字的可用次数
 * 另外有两个整数A和B A和B由这些数字组成，
 * 并且已知A和B各自的位数
 * 两个数可以有一个或者多个先导0，
 * 求 A和B的最小乘积
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        Queue<Integer> queue =new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            while (arr[i] >0){
              queue.offer(i);
               arr[i]--;
            }
        }
        if(A>B){
            int tmp =A;
            A=B;
            B=tmp;
        }
        int left =0,right=0;
        while (A>0){
            int tmp =queue.poll();
            if((left*10 +tmp) <=(right*10+tmp)) {
                left =left*10+tmp;
                A -=1;
            }else {
                right =right*10 +tmp;
                B -=1;
            }
        }

        while (B>0){
            right =right*10+queue.poll();
            B -=1;
        }
        System.out.println(left+" "+right);
        System.out.println(left*right);




    }
}
