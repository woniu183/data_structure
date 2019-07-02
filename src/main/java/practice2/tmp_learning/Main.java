package practice2.tmp_learning;

import java.util.*;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args){
        TreeNode t1 =new TreeNode(1);
        TreeNode t2 =new TreeNode(2);
        TreeNode t3 =new TreeNode(3);
        TreeNode t4 =new TreeNode(4);
        TreeNode t5 =new TreeNode(5);
        TreeNode t6 =new TreeNode(6);
        TreeNode t7 =new TreeNode(7);
        t1.left  =t2;
        t1.right =t3;
        t2.left  =t4;
        t2.right =t5;
        t3.left  =t6;
        t3.right =t7;

//        List<Integer> res =preTraversal(t1);
//        List<Integer> res =postTravelsal(t1);
        List<Integer> res =inTraversal(t1);
//        List<Integer> res =lawyerTravelsal(t1);
        for(int i:res){
            System.out.print(i+" ");
        }


    }


    /**
     * 链表翻转
     */

    //递归法
    public static ListNode reverseList(ListNode head){
        if(head ==null ||head.next ==null) return head;

        ListNode next =head.next;
        ListNode newhead =reverseList(next);

        next.next=head;
        head.next=null;

        return newhead;


    }

    //头插法
    public static ListNode reverseList2(ListNode head){
        ListNode newhead =new ListNode(-1);
        while (head !=null){
            ListNode next =head.next;
            head.next =newhead.next;
            newhead.next=head;
            head=next;
        }

        return newhead.next;
    }

    //从第K个元素开始翻转链表


    /**
     * 二叉树的非递归遍历
     */

    //前序遍历

    public static List<Integer> preTraversal(TreeNode root){
        List<Integer> res =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node =stack.pop();
            if(node ==null) continue;

            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }

        return res;
    }

    //后序遍历
    public static List<Integer> postTravelsal(TreeNode root){
        List<Integer>  res =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node =stack.pop();
            if(node ==null) continue;

            res.add(node.val);
            stack.push(node.left);
            stack.push(node.right);
        }

        Collections.reverse(res);

        return res;
    }

    //中序遍历

    public static List<Integer> inTraversal(TreeNode root){
        List<Integer> res =new ArrayList<>();
        if(root ==null) return res;
        Stack<TreeNode> stack =new Stack<>();
        TreeNode cur =root;
        while (cur !=null|| !stack.isEmpty()){
            while (cur !=null){
                stack.push(cur);
                cur=cur.left;
            }

            TreeNode node =stack.pop();
            res.add(node.val);
            cur =node.right;
        }
        return res;
    }

    //层次遍历
    public static List<Integer> lawyerTravelsal(TreeNode root){
        List<Integer> res =new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root ==null) return res;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur =queue.poll();
            res.add(cur.val);
            if(cur.left !=null){
                queue.offer(cur.left);
            }
            if(cur.right !=null){
                queue.offer(cur.right);
            }

        }
        return res;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
        next =null;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val =x;
    }
}
