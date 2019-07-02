package zijietiaodong;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[]  str =new String[n];

        for(int i=0;i<n;i++){

            str[i]= sc.next();


        }
        for(int i=0;i<n;i++){
            check(str[i]);
        }



    }

    public static void check(String s){

        char[] chars =s.toCharArray();

        List<Character> lists =new LinkedList<>();
        List<Character> lists2 =new LinkedList<>();

       for(int j=0;j<chars.length;j++){
           lists.add(chars[j]);
           lists2.add(chars[j]);

       }
        int len =chars.length;
        for(int i=0;i<len-2;i++){
            if(lists.get(i) == lists.get(i+1)&&lists.get(i+1) == lists.get(i+2)){
                lists2.remove(lists.get(i));
            }

        }
        for(Character c:lists2){
            System.out.print(c);
        }
        System.out.println();

        List<Character> lists3 =new LinkedList<>();
        lists3.addAll(lists2);
        for(int k=0;k<lists3.size()-3;k++) {
            if (lists3.get(k) == lists3.get(k + 1) && lists3.get(k + 2) == lists3.get(k + 3)) {
                lists3.remove(lists3.get(k + 2));
            }
        }

        for(Character c:lists3){
            System.out.print(c);
        }
        System.out.println();


    }
}
