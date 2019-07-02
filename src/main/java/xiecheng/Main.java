package xiecheng;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        if(str.trim().length()==0){
            System.out.println(false);
        }
        String[] nodes=str.split(",");
        ListNode head =new ListNode(nodes[0]);
        ArrayList<ListNode> arr =new ArrayList<>();
        arr.add(head);
        for(int i=1;i<nodes.length;i++){
            ListNode node =new ListNode(nodes[i]);
            arr.add(node);

        }

        for(int j=0;j+1<arr.size();j++){
            arr.get(j).next=arr.get(j+1);
        }
        HashSet<ListNode> set =new HashSet<>();
        System.out.println(hasCircle(head));

    }
    public static boolean hasCircle(ListNode head){
        HashSet<String> set =new HashSet<>();
        while (head !=null){
            if(!set.add(head.val)){
                return true;
            }
            head =head.next;
        }
       return false;
    }



}

class ListNode{
    String val;
    ListNode next =null;

    ListNode(String val){
        this.val =val;
    }
}
