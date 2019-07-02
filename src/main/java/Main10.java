import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> li =new ArrayList<>();
        ArrayList<Integer> di =new ArrayList<>();
        int[] a =new int[1000000];
        for(int i=0;i<n;i++){
            int tmp =sc.nextInt();
            li.add(tmp);
            a[tmp] +=1;
        }

        int Count =0;
        for(int j=0;j<n;j++){
            int tmp =sc.nextInt();
            di.add(tmp);
            Count +=tmp;
        }

        for(int k=999999;k>0;k--){
            int cost =0;
            ArrayList<Integer> cut =new ArrayList<>();

            if(a[k]>0){
                if(a[k]*2 <=n){
                    int cutNum =li.size()-a[k];
                    for(int j=k+1;j<1000000;j++){
                        cutNum -=a[j];
                    }
                    cutNum -=(a[k] -1);

                    for(int m =0; m<li.size();m++){
                        if(li.get(m)<k){
                            cut.add(di.get(m));
                        }
                        if(li.get(m)>k){
                            cost +=di.get(m);

                        }
                    }

                    if(cut.size()>0){
                        if(cutNum <=0){
                            cutNum =0;
                        }

                        Collections.sort(cut);

                        for(int l =0;l<cutNum;l++){
                            cost +=cut.get(l);
                        }
                        if(cost <Count){
                            Count =cost;
                        }
                    }
                }else {
                    for(int t=0;t<li.size();t++){
                        if(li.get(t)>k){
                            cost +=di.get(t);
                        }
                    }
                }

                if(cost<Count){
                    Count =cost;
                }
            }

        }
        System.out.println(Count);

    }
}
