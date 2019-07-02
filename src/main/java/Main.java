import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =sc.nextInt();
            }
        }

       System.out.println(minPathLength(arr,m-1,n-1));


    }
    public static int minPathLength(int[][] grids,int tr,int tc){
        final int[][] direction ={{1,0},{-1,0},{0,1},{0,-1}};
        final int m =grids.length;
        final int n =grids[0].length;
        Queue<Pair<Integer,Integer>> queue =new LinkedList<>();

        queue.add(new Pair<>(0,0));

        int pathLength =0;
        while (!queue.isEmpty()){
            int size = queue.size();
            pathLength ++;
            while (size-- >0){
                Pair<Integer,Integer> cur =queue.poll();
                int cr =cur.getKey();
                int cc =cur.getValue();
                grids[cr][cc]=0;

                for(int[] d:direction){
                    int nr =cr+d[0],nc =cc+d[1];
                    if(nr < 0||nr>=m ||nc <0||nc>=n||grids[nr][nc]==0){
                        continue;
                    }

                    if(nr==tr &&nc==tc){
                        return pathLength;
                    }

                    queue.add(new Pair<>(nr,nc));
                }


            }
        }

        return -1;
    }

}
