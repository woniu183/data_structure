package pinduoduo;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[j][0]-arr[i][0]>=d){
                    if(arr[i][1]+arr[j][1]>max){
                        max =arr[i][1]+arr[j][1];
                    }

                }

            }
        }

        System.out.println(max);
    }
}
