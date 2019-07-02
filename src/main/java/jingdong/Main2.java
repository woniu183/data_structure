package jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m=sc.nextInt();
        int[][]  nums =new int[m][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                nums[i][j] =sc.nextInt();
            }
        }
        int[] list =new int[n];
        for(int i=0;i<n;i++){
            list[i]=i+1;
        }

        List<List<Integer>> tmpList =permute(list);
        List<List<Integer>> resList =new ArrayList<>();

        for(int i=0;i<tmpList.size();i++){
            List<Integer>  list1 =tmpList.get(i);
            int k=0;
            while (k<m){
                int mum1 =list1.get(nums[k][0]-1);
                int num2 =list1.get(nums[k][1]-1);

                if(mum1>=num2){

                    k=m+1;
                }else {
                    k++;
                }
            }

            if(k ==m){
                resList.add(list1);
            }
        }

        List<Integer>  list2 =resList.get(0);
        for(int i:list2){
            System.out.print(i+" ");
        }







    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> permutes =new ArrayList<>();
        List<Integer> permuteList =new ArrayList<>();
        boolean[] hasVisited =new boolean[nums.length];

        backtracking(permuteList,permutes,hasVisited,nums);
        return permutes;

    }

    public static void backtracking(List<Integer> permuteList,List<List<Integer>> permutes,boolean[] visited,final int[] nums){
        if(permuteList.size() == nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i] =true;

            permuteList.add(nums[i]);

            backtracking(permuteList,permutes,visited,nums);

            permuteList.remove((permuteList.size() -1));
            visited[i] =false;
        }
    }
}
