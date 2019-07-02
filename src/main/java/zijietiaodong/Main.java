package zijietiaodong;

import java.util.*;

public class Main {
    public static void main(String[] args){

        class Point{
            int X;
            int Y;
            public  Point(int m,int n){
                this.X=m;
                this.Y=n;
            }

        }

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        List<Point> lists =new LinkedList<Point>();
        for(int i=0;i<n;i++){
            lists.add(new Point(sc.nextInt(),sc.nextInt()));
        }

        lists.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o2.X-o1.X;
            }
        });

        int maxY =lists.get(0).Y;

        List<Point> result_list =new LinkedList<Point>();

        result_list.add(lists.get(0));

        for(int j=1;j<lists.size();j++){
            if(lists.get(j).Y >maxY){
               result_list.add(lists.get(j));
               maxY=lists.get(j).Y;
            }
        }


        for(int m=result_list.size()-1;m >=0;m --){
            System.out.println(result_list.get(m).X+" "+result_list.get(m).Y);
        }

       }

}





