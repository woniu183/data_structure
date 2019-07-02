package weizhong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();


        int i,j,k;
        for(i=1;i<1000000;i++){
            if(i*(i+1)/2>=n){
                break;
            }
        }
        int m =i*(i+1)/2 -n;

        if(i %2 ==0){
            j=m+1;
            k=i-m;
        }else {
            j=i-m;
            k=m+1;
        }
        String res =k+"/"+j;
        System.out.println(res);
    }
}
