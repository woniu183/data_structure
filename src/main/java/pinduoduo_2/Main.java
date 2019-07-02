package pinduoduo_2;



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String s1 =sc.next();
        String s2 =sc.next();
        if(s1.isEmpty() &&s2.isEmpty()){
            System.out.println(0);
        }
        if(s1.isEmpty()){
            System.out.println(s2.length());
        }else if(s2.isEmpty()){
            System.out.println(s1.length());
        }else {
            char[] s1_arr = s1.toCharArray();
            char[] s2_arr = s2.toCharArray();
            int len_1 = s1.length();
            int len_2 = s2.length();
            int[][] D = new int[len_2 + 1][len_1 + 1];
            D[0][0] = 0;
            for (int i = 1; i <= len_1; i++) {
                D[0][i] = i;
            }
            for (int i = 1; i <= len_2; i++) {
                D[i][0] = i;
            }

            for (int i = 1; i <= len_2; i++) {
                for (int j = 1; j <= len_1; j++) {
                    D[i][j] = Math.min(Math.min(D[i - 1][j] + 1, D[i][j - 1] + 1), (s1_arr[j - 1] == s2_arr[i - 1] ? D[i - 1][j - 1] : D[i - 1][j - 1] + 1));
                }
            }

            System.out.println(D[len_2][len_1]);
        }

    }
}
