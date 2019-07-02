import java.util.Scanner;

public class zhaoshangyinhang {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int  min1 =sc.nextInt();
        int  max1 =sc.nextInt();
        int  min2 =sc.nextInt();
        int  max2 =sc.nextInt();
        int  min3 =sc.nextInt();
        int  max3 =sc.nextInt();
        int num1,num2,num3;
        if(n ==min1+min2+min3){
            System.out.println(min1+" "+min2+" "+min3);
        }else if((n-min2-min3)<=max1&&n>min1+min2+min3){
            num1=n-min2-min3;
            System.out.println(num1+" "+min2+" "+min3);
        }else if((n-min2-min3)>max1&&(n-min2-min3)<=(max1+max2)){
            num1 =max1;
            num2 =n-num1-min3;
            System.out.println(num1+" "+num2+" "+min3);
        }else {
            num1 =max1;
            num2 =max2;
            num3 =n-max1-max2;
            System.out.println(num1+" "+num2+" "+num3);
        }


    }
}
