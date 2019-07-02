package xiecheng2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int k =sc.nextInt();
        String str2=str.substring(1,str.length()-1);

        String[] nodes=str2.split(",");
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

        reverse(head,k);
        System.out.print("[");
        while (head!=null){
            System.out.print(head.val+",");
            head=head.next;
        }
        System.out.print("]");








    }
    public static ListNode reverse(ListNode head ,int k){
        if(head ==null){
            return head;
        }
        ListNode cur =head;
        ListNode pre =null;
        int count =0;
        if(getLen(cur) >=k){
            while (count <k&&cur !=null){
                ListNode recur =cur;
                recur.next =pre;
                pre =recur;
                cur=cur.next;
                count++;
            }

            if(cur !=null) head.next=reverse(cur,k);
            return pre;

        }
        return cur;


    }

    public static int getLen(ListNode head){
        ListNode node =head;
        int cnt =0;
        while (node !=null){
            cnt ++;
            node =node.next;
        }
        return cnt;
    }

}
class ListNode{
    String val;
    ListNode next =null;

    ListNode(String val){
        this.val =val;
    }
}
