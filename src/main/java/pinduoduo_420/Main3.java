package pinduoduo_420;


import java.util.Scanner;

/**
 * 给出两个单词word1和word2,
 * 计算出将word1转换为word2的最少操作数
 * (一次操作是指:删除一个字符,或者添加一个字符,或替换一个字符)
 */
public class Main3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str1 =sc.nextLine();
        String str2 =sc.nextLine();
         if(str1.trim().isEmpty() && str2.trim().isEmpty()){
             System.out.println(0);
         }else if(str1.trim().isEmpty()){
             System.out.println(str2.length());
         }else if(str2.trim().isEmpty()){
             System.out.println(str1.length());
         }else {
             int len1 =str1.length();
             int len2 =str2.length();

             int[][] D =new int[len1+1][len2+1];
             D[0][0] =0;
             for(int i=0;i<=len1;i++){
                 D[i][0] =i;
             }
             for(int j=0;j<=len2;j++){
                 D[0][j] =j;
             }

             char[]  str1_arr =str1.toCharArray();
             char[]  str2_arr =str2.toCharArray();
             for(int i =1;i<=len1;i++){
                 for(int j=1;j<=len2;j++){
                     D[i][j] =Math.min(Math.min(D[i-1][j]+1,D[i][j-1]+1),(str1_arr[i-1] == str2_arr[j-1]?D[i-1][j-1]:D[i-1][j-1]+1));
                 }
             }

             System.out.println(D[len1][len2]);


         }


    }
}
