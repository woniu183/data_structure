package huawei410;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String[] chars =str.split(" " );
        int N =Integer.valueOf(chars[0]);
        int M =Integer.valueOf(chars[1]);
        int[][] matrix =new int[N][M];
        for(int i=0;i<N;i++){
            String line =sc.nextLine();
            String[] vals =line.split(" ");

            for(int j=0;j<M;j++){
                matrix[i][j] =Integer.valueOf(vals[j]);
            }
        }

        String lastLine =sc.nextLine();
        String[]  lastVals=lastLine.split(" ");
        int x1=Integer.parseInt(lastVals[0]);
        int y1=Integer.parseInt(lastVals[1]);
        int x2=Integer.parseInt(lastVals[2]);
        int y2=Integer.parseInt(lastVals[3]);

        int[][] flag =new int[N][M];
        int high =matrix[x1][y1];
       int sum= helper(high,x1+1,y1,x2,y2,flag,matrix);

       System.out.println(sum%1000000000);


    }

    public static int helper(int high,int x1,int y1,int  x2,int y2,int[][] flag,int[][] matrix){

        if(x1<0 ||x1>x2&&y1>y2||y1<0||matrix[x1][y1] <= high||flag[x1][y1]==1 ) return 0;
        if(x1==x2&&y1==y2) return 1;
        flag[x1][y1] =1;
        high =matrix[x1][y1];
        return helper(high,x1-1,y1,x2,y2,flag,matrix)+
                helper(high,x1+1,y1,x2,y2,flag,matrix)+
                helper(high,x1,y1+1,x2,y2,flag,matrix)+
                helper(high,x1,y1-1,x2,y2,flag,matrix);
    }
}
