package pinduoduo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {

            int offset = sc.nextInt();
            int n = sc.nextInt();
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            int start1, end1, start2, end2;

            // System.out.println(offset+" "+n+" "+ l1+" "+l2 );

            if (offset >= l1) {
                start1 = end1 = l1;
                offset -= l1;
            } else {
                start1 = offset;
                end1 = l1 - offset >= n ? offset + n : l1;
                offset = 0;
                n -= end1 - start1;
            }
            if (offset >= l2) {
                start2 = end2 = l2;
            } else {
                start2 = offset;
                end2 = l2 - offset >= n ? offset + n : l2;
            }

            System.out.println(start1 + " " + end1 + " " + start2 + " " + end2);
        }
    }
}