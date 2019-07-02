package pinduoduo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
     class Bear {
         int power;int hunger;
         Bear(int p,int h){
             power =p;
             hunger = h;
         }
     }

        Scanner sc =new Scanner(System.in);
     int n =sc.nextInt();
     int m =sc.nextInt();
        LinkedList<Integer> sugers =new LinkedList<>();

        for(int i= 0 ;i<m; i++){
            sugers.add(sc.nextInt());
        }
        sugers.sort((Integer i1,Integer i2) -> i2 -i1);
        LinkedList<Bear> bears =new LinkedList<>();

        for(int i = 0;i <n; i++){
            bears.add(new Bear(sc.nextInt(),sc.nextInt()));
        }

        LinkedList<Bear> back_bears =new LinkedList<>();
        back_bears.addAll(bears);

        bears.sort((Bear b1,Bear b2) -> b2.power - b1.power);

        for(Bear bear :bears){
            Iterator<Integer> it =sugers.iterator();

            while (it.hasNext()){
                int tmp =it.next();

                if(bear.hunger >= tmp){
                    bear.hunger -= tmp;
                    it.remove();
                }
            }
        }

        for(Bear bear :back_bears){
            System.out.println(bear.hunger);
        }

    }

}
