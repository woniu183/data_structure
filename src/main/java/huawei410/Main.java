package huawei410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String[] strings =str.split(" ");
        int n =Integer.valueOf(strings[0]);
        ArrayList<String> lists =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(strings[i].length() <=8){
                lists.add(strings[i]);
            }else {
                int len =strings[i].length();
                int k =len/8;
                for(int j=0;j<=k;j++){
                    if(j<k){
                        lists.add(strings[i].substring(8*j,8*(j+1)));
                    }else {
                        lists.add(strings[i].substring(8*j));
                    }


                }
            }
        }

        for(int i=0;i< lists.size();i++){
            int len =lists.get(i).length();
            if(len<8){
                for(int j=len;j<8;j++){
                    StringBuffer sb = new StringBuffer(lists.get(i));
                    sb.append("0");
                    lists.set(i,sb.toString());
                }
            }
        }

        Collections.sort(lists);

        for(String s:lists){
            System.out.print(s+" ");
        }

    }
}
