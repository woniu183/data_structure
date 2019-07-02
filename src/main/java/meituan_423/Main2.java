package meituan_423;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        char[]  c1 =s1.toCharArray();
        char[]  c2 =s2.toCharArray();
        int len1 =c1.length;
        int len2 =c2.length;
        int i=0,j=0,cnt=0;
        while (i<len1&&j<len2){
            if(c1[i] !=c2[j]){

                if(c1[i] =='?'){
                    i++;
                    j++;
                }else {
                    if(j>0){
                        j=0;
                    }
                    i++;
                    j = 0;
                }
            }else {
                i++;
                j++;

            }
            if(j==len2){
                i--;
                cnt++;
                j=0;
            }


        }

        System.out.println(cnt);

    }
}
