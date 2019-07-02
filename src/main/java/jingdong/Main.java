package jingdong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        String  line =sc.nextLine();
        char[] nums =line.toCharArray();
        if(line.trim().length()==0){
            System.out.println(0);
            return;
        }

        int cnt2=0;
        for(int k =0;k<nums.length;k++){
            if(nums[k] =='0'){
                cnt2++;
            }
        }
        if(cnt2 ==nums.length){
            System.out.println(0);
            return;
        }


        int cnt1=1;
        int maxCnt =1;
        for(int j=1;j< nums.length;j++){
            if(nums[j] ==nums[j-1]&&nums[j] =='1'){
                cnt1 ++;
                maxCnt =cnt1>maxCnt?cnt1:maxCnt;
            }else {
                cnt1 =1;
            }
        }



        int cnt =0;
        int i=0;
        while (i<nums.length){
            if(nums[i] =='1'){
                cnt++;
                i +=1;
            }else  break;
        }

        int j=nums.length-1;
        while (j>i){
            if(nums[j]=='1'){
                cnt ++;
                j -=1;
            }else break;
        }

        System.out.println(Math.max(maxCnt,cnt));

    }
}
