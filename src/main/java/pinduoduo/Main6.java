package pinduoduo;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){


        Scanner sc =new Scanner(System.in);
        String chars =sc.nextLine();
        char[] a =chars.toCharArray();
        if(a.length>52||a.length<=0){
            return;
        }

        int min =1000;
        for(int i=0;i<a.length;i++){
            if('A'<= a[i]&&a[i] <='Z'){
                 a[i]+=32;
            }
            if(a[i]<=min){
                min=a[i];
            }

        }
        System.out.println((char)min);


    }




}
