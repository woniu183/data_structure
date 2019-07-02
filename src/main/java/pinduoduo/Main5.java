package pinduoduo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] students =new int[n];
        for(int i=0;i<n;i++){
            students[i]=sc.nextInt();
        }

        int m =sc.nextInt();
        int[] chols =new int[m];
        for(int i=0;i<m;i++){
            chols[i] = sc.nextInt();

        }

        Arrays.sort(students);
        Arrays.sort(chols);

        int stu = 0;
        int count = 0;
        for(int i =0;i<chols.length;i++){
            if(chols[i]<students[stu]){
                continue;
            }else {
                count++;
                stu++;
                if(stu == n){
                    break;
                }
            }

        }

        System.out.println(count);



    }
}

