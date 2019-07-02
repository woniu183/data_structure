package qiye360;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {
    private static int[][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
    private static int[][] dp;


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int longpath(int[][] matrix) {
        if(matrix.length ==0|| matrix == null){
            return 0;
        }
        int n =matrix.length;
        int m =matrix[0].length;
        dp =new int[n][m];

        int maxLen=0;
        for(int j=0;j<n;j++){
            for(int k=0;k<m;k++){
                maxLen =Math.max(dfs(matrix,dp,j,k),maxLen);
            }
        }

        return maxLen;



    }
    public  static int dfs(int[][] matrix,int[][] dp,int i,int j){
        if(dp[i][j] >0){
            return dp[i][j];
        }

        int n =matrix.length;
        int m=matrix.length;
        int max =1;
        for(int l =0;l<4;l++){
            int x =dir[l][0] +i;
            int y =dir[l][1] +j;
            if(x<0 || y<0 ||x>=n||y>=m||matrix[x][y] <=matrix[i][j]){
                continue;
            }

            int maxLen =dfs(matrix,dp,x,y)+1;
            max =Math.max(max,maxLen);
        }

        dp[i][j] =max;
        return max;

    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _matrix_rows = 0;
        int _matrix_cols = 0;
        _matrix_rows = Integer.parseInt(in.nextLine().trim());
        _matrix_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _matrix = new int[_matrix_rows][_matrix_cols];
        for(int _matrix_i=0; _matrix_i<_matrix_rows; _matrix_i++) {
            for(int _matrix_j=0; _matrix_j<_matrix_cols; _matrix_j++) {
                _matrix[_matrix_i][_matrix_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = longpath(_matrix);
        System.out.println(String.valueOf(res));

    }
}
