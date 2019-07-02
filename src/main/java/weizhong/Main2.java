package weizhong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int[] arr =new int[6];
        for(int i=0;i<arr.length;i++){
            if(arr[i] <0){
                return;
            }
            arr[i] =sc.nextInt();
        }

        int res =trans(arr);
        System.out.println(res);



    }

    public static int trans(int[] arr){
        int cnt =0;
        cnt +=arr[5];
        if(arr[4]>= arr[0]){
            cnt +=arr[4];
            arr[0] =0;
        }else {
            cnt +=arr[4];
            arr[0] =arr[0] -arr[4];
        }

        cnt +=arr[3];
        if(arr[3] >= arr[1]){
            arr[1] =0;
            arr[0] =arr[0]-4*(arr[3] - arr[1]) <0? 0:arr[0]-4*(arr[3] - arr[1]);
        }else {
            arr[1] =arr[1] -arr[3];
        }

        cnt +=arr[2]/4;

        int j =arr[2] %4;
        if(j>0){
            cnt +=1;
            if(j ==1){
                arr[1] =arr[1] -4>0?arr[1] -4:0;
                if(arr[1]>0){
                    arr[0] =arr[0]-11>0?arr[0]-11:0;
                }else {
                    arr[0] =arr[0]-11-4*(4-arr[1])>0?arr[0]-11-4*(4-arr[1]):0;
                }
            }if(j ==2){
                arr[1] =arr[1] -3>0?arr[1] -3:0;
                if(arr[1]>0){
                    arr[0] =arr[0]-6>0?arr[0]-6:0;
                }else {
                    arr[0] =arr[0]-6-4*(3-arr[1])>0?arr[0]-6-4*(3-arr[1]):0;
                }
            }else {
                arr[1] =arr[1] -1>0?arr[1] -1:0;
                if(arr[1]>0){
                    arr[0] =arr[0]-5>0?arr[0]-5:0;
                }else {
                    arr[0] =arr[0]-5-4*(1-arr[1])>0?arr[0]-5-4*(1-arr[1]):0;
                }
            }
        }

        cnt +=arr[1]/9;
        int k =arr[1] %9;
        if(k>0){
            cnt +=1;
            arr[0] =arr[0] -(36-4*k)>0?arr[0] -(36-4*k):0;
        }

        cnt += arr[0]/36;
        int l=arr[0] %36;
        if(l>0){
            cnt +=1;
        }

        return cnt;
    }
}
