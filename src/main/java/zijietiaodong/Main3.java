package zijietiaodong;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int m=1024-n;
        int[] arr ={64,16,4,1};
        int i=0;
        int count =0;
        while(m>0){

            if(m>=arr[i]){
                m -=arr[i];
                count +=1;
            }else {
                i +=1;
            }
        }
        System.out.println(count);

    }
}
