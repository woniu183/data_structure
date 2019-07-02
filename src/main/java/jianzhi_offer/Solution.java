package jianzhi_offer;

import java.util.*;

public class Solution {

    public static void main(String[] args){
//        int target =10;
//        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Find(target,arr));

//        StringBuffer str =new StringBuffer("i am a king");
//        System.out.println(replaceSpace(str));
//
//        List<Integer> lists =new ArrayList<>();

//        System.out.println(Power(55.6,3));
//        List<String> res =Permutation("aa");
//        System.out.println(res.toString());
//        int[] arr={1,2,3,2,2,2,5,4,2};
////        MoreThanHalfNum_Solution(arr);
//        for(int i:GetLeastNumbers_Solution(arr,3)){
//            System.out.print(i+" ");
//        }
//
//        System.out.println(NumberOf1Between1AndN_Solution(13));
//        int[] arr={1,2,3,3,3,3,4,5};
////       System.out.println(GetNumberOfK(arr,3));
//        ArrayList<Integer> list =FindNumbersWithSum(arr,6);
//        for(int i:list){
//            System.out.println(i);
//        }
        System.out.println(ReverseSentence("I am a student!"));


    }

    /**
     * 1. 二维数组查找
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target,int[][] array){
        int m =array.length,n=array[0].length;
        int i=0,j=n-1;
        while (i<m&&j>=0){
            if(array[i][j]>target){
                j--;
            }else if(array[i][j] ==target){
                return true;
            }else {
                i ++;
            }
        }

        return false;
    }

    /**
     * 2. 字符串替换
     *
     */

    public static String replaceSpace(StringBuffer str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' '){
                str.replace(i,i+1,"%20");
            }
        }

        return new String(str);
    }

    /**
     * 3. 遍历链表放到数组中
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList lists =new ArrayList<>();
        int i =0;
        while(listNode !=null){
            lists.add(i,listNode.val);
            listNode =listNode.next;
        }

        return lists;
    }

    /**
     * 4. 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
     *
     */

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        TreeNode root =reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
        }

        private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
           if(startPre >endPre ||startIn>endIn) return null;

           TreeNode root =new TreeNode(pre[startPre]);

           for(int i=startIn;i<=endIn;i++){
               if(in[i] == pre[startPre]){
                   root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                   root.right =reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
               }
           }

           return root;
        }

    /**
     *
     * 5. 旋转数组找最小值
     */

    public int minNumberInRotateArray(int [] array) {

        Arrays.sort(array);
        return array[0];

    }

    /**
     *
     * 6. 斐波那契数列
     */

    public static int Fibonacci(int n){
        int preNum =1;
        int prepreNum =0;
        int result =0;
        if(n == 0)return 0;
        if(n == 1)return 1;
        for(int i=2;i<=n;i++){
            result =preNum+prepreNum;
            prepreNum=preNum;
            preNum =result;
        }

        return result;
    }

    /**
     * 7. 跳台阶问题
     *
     */
    public static int jump(int target){
        if(target == 1){
            return 1;
        }if (target ==2){
            return 2;
        }

        int pre =2;
       
        int prepre =1;
        int result=0;
        for(int i=3;i<=target;i++){
            result =pre +prepre;
            prepre =pre;
            pre =result;
        }
        return result;
    }

    /**
     * 8. 跳台阶（一次可以跳1-n阶）
     */

    public static int jumpN(int target){
        if(target <=0){
            return -1;
        }else if(target == 1){
            return 1;
        }else {
            return  2*jumpN(target - 1);
        }

    }
    /**
     * 9. 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */
    public static int count_1(int n){


        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;


    }

    /**
     * 10. 浮点数的整数次方
     */

    public static double Power(double base, int exponent) {


        long p =Math.abs(exponent);
        double r = 1.0;
        while(p !=0){
            if((p&1) !=0) r *= base;
            base *= base;
            p >>= 1;
        }
        return exponent < 0 ? 1/ r : r;
    }

    /**
     * 11. 调整数组元素 使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    public static void reOrderArray(int [] array) {

        if(array ==null || array.length ==0){
            return;
        }

        int i=0,j;
        while (i<array.length){
            while (i<array.length&&array[i]%2 !=0) {
                i++;
            }
            j=i+1;
            while (j< array.length&&array[j]%2 ==0 ){
                j++;
            }

            if(j<array.length){
                int tmp =array[j];
                for(int k=j-1;k>=i;k--){
                    array[k+1] =array[k];
                }

                array[i++] =tmp;
            }else {
                break;
            }
        }
    }

    /**
     * 12. 输出链表的倒数第K个结点
     */

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null ||k<=0){
            return null;
        }

        ListNode pre =head;
        ListNode last =head;
        for(int i=1;i<k;i++){
            if(pre.next !=null){
                pre=pre.next;
            }else {
                return null;
            }
        }

        while (pre.next !=null){
            pre =pre.next;
            last =last.next;
        }
        return last;
    }

    /**13. 翻转链表
     *
     */
    //递归
    public ListNode ReverseList(ListNode head) {

        if(head ==null||head.next ==null){
            return head;
        }
        ListNode next =head.next;
        ListNode newhead =ReverseList(next);
        next.next =head;
        head.next=null;
        return newhead;

    }

    //头插法

    public ListNode ReverseList2(ListNode head){
        ListNode newhead =new ListNode(-1);
        while (head !=null){
            ListNode next =head.next;
            head.next=newhead.next;
            newhead.next =head;
            head=next;
        }
        return newhead.next;
    }
    /**
     * 14. 输入两个单调递增的链表，输出两个链表合成后的链表
     */

    //递归版本
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <=list2.val){
            list1.next =Merge(list1.next,list2);
            return list1;
        }else {
            list2.next =Merge(list1,list2.next);
            return  list2;
        }

    }

    //非递归版
    public ListNode Merge_2(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        if(list2 ==null)  return list1;
        ListNode mergeHead =null;
        ListNode current =null;
        while (list1 !=null &&list2 !=null){
            if(list1.val <=list2.val){
                if(mergeHead ==null){
                    mergeHead =current=list1;
                }else {
                    current.next=list1;
                    current =current.next;
                }
                list1 =list1.next;
            }else {
                if(mergeHead ==null){
                    mergeHead =current=list2;
                }else {
                    current.next=list2;
                    current =current.next;
                }
                list2 =list2.next;
            }
        }

        if(list1 ==null){
            current.next=list2;
        }else {
            current.next =list1;
        }

        return mergeHead;

    }

    /**
     * 15. 输入两棵二叉树A，B，判断B是不是A的子结构。
     */

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 ==null || root2 ==null) return false;
        return isSubtreeWithRoot(root1,root2)||isSubtreeWithRoot(root1.left,root2)||isSubtreeWithRoot(root1.right,root2);


    }

    public boolean isSubtreeWithRoot(TreeNode s, TreeNode t){
        if(t==null ) return true;
        if(s ==null) return false;
        if(t.val !=s.val) return false;
        return isSubtreeWithRoot(s.left,t.left)&&isSubtreeWithRoot(s.right,t.right);

    }

    /**
     * 16. 操作给定的二叉树，将其变换为源二叉树的镜像。
     */
    public void Mirror(TreeNode root) {
        TreeNode tmp =null;
        if(root !=null){
            tmp =root.left;
            root.left =root.right;
            root.right =tmp;

            if(root.left !=null){
                Mirror(root.left);
            }
            if(root.right !=null){
                Mirror(root.right);
            }
        }
    }

    /**
     * 17. 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
     */
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> result =new ArrayList<>();
        if(matrix.length ==0||matrix[0].length ==0)return result;
        int n=matrix.length;
        int m=matrix[0].length;
        int layers =(Math.min(n,m)-1)/2+1; //得到循环的层数
        for(int i=0;i<layers;i++){
            for(int k=i;k<m-i;k++) result.add(matrix[i][k]);
            for(int j=i+1;j<n-i;j++) result.add(matrix[j][m-i-1]);
            for(int k=m-i-2;(k>=i)&&(n-i-1 !=i);k--) result.add(matrix[n-i-1][k]);
            for(int j=n-i-2;(j>i)&&(m-i-1 !=i);j--) result.add(matrix[j][i]);
        }

        return result;


    }

    /**
     *18.  输入两个整数序列，第一个序列表示栈的压入顺序，
     * 请判断第二个序列是否可能为该栈的弹出顺序
     */
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length ==0 ||popA.length==0) return false;
        Stack<Integer> s= new Stack<>();
        int popindex =0;
        for(int i=0;i<pushA.length;i++){
            s.push(pushA[i]);
            while (!s.isEmpty()&&s.peek()==popA[popindex]){
                s.pop();
                popindex++;
            }

        }
        return s.isEmpty();


    }

    /**
     * 19. 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result =new ArrayList<>();
        if(root ==null){
            return result;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode cur =queue.poll();
            result.add(cur.val);
            if(cur.left !=null){
                queue.add(cur.left);
            }
            if(cur.right !=null){
                queue.add(cur.right);
            }
        }
        return result;
    }

    /**
     * 20. 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==1) return true;
        if(sequence.length==0) return false;
        return judge(sequence,0,sequence.length-1);


    }
    public boolean judge(int[] a,int start,int root){
        if(start >=root) return true;
        int i =root;
        while (i>start&&a[i-1]>a[root]){
            i--;
        }
        for(int j=start;j<i-1;j++) {
            if (a[j] > a[root]) {
                return false;
            }
        }
            return judge(a,start,i-1)&&judge(a,i,root-1);

    }

    /**
     * 21. 输入一颗二叉树的跟节点和一个整数
     * 打印出二叉树中结点值的和为输入整数的所有路径
     */
    private ArrayList<ArrayList<Integer>> result =new ArrayList<>();
    private ArrayList<Integer> lists =new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

        if(root ==null) {return result;}
        lists.add(root.val);
        target -=root.val;
        if(target ==0 && root.left ==null && root.right ==null){
            result.add(new ArrayList<>(lists));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);

        lists.remove(lists.size() -1);
        return result;
    }

    /**
     * 22. 输入一个复杂链表（每个节点中有节点值，
     * 以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
     * 返回结果为复制后复杂链表的head。
     */



    /**
     *解题思路：
     *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
     *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
     *3、拆分链表，将链表拆分为原链表和复制后的链表
     */

    public RandomListNode Clone(RandomListNode pHead){
        if(pHead ==null) return null;
        RandomListNode currentNode =pHead;
        //1. 复制每个结点

        while (currentNode !=null){
            RandomListNode cloneNode =new RandomListNode(currentNode.label);
            RandomListNode nextNode =currentNode.next;
            currentNode.next =cloneNode;
            cloneNode.next =nextNode;
            currentNode =nextNode;
        }

        currentNode =pHead;

        //2.再遍历一次链表，复制老结点的随机指针给新结点
        while (currentNode !=null){
            currentNode.next.random =currentNode.random ==null?null:currentNode.random.next;
            currentNode =currentNode.next.next;
        }

        //3. 拆分链表为新链表和老链表
        currentNode =pHead;
        RandomListNode pCloneHead =pHead.next;
        while (currentNode !=null){
            RandomListNode cloneNode =currentNode.next;
            currentNode.next =cloneNode.next;
            cloneNode.next=cloneNode.next ==null?null:cloneNode.next.next;
            currentNode =currentNode.next;
        }

        return pCloneHead;

    }

    /**
     * 23. 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */
    private TreeNode head=null;
    private TreeNode realHead=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConverSub(pRootOfTree);
        return realHead;
    }
    public void ConverSub(TreeNode pRootOfTree){
        if(pRootOfTree ==null)return;
        ConverSub(pRootOfTree.left);

        if(head ==null){
            head =pRootOfTree;
            realHead =pRootOfTree;
        }else {
            head.right =pRootOfTree;
            pRootOfTree.left=head;
            head =pRootOfTree;
        }

        ConverSub(pRootOfTree.right);
    }

    /**
     * 24. 字符串全排列
     */

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res =new ArrayList<>();
        List<Character> chars =new ArrayList<>();
        Arrays.sort(str.toCharArray());
        if(str.length()==0) return res;
        if(str.length()==1) {
            res.add(str);
            return res;
        }
        boolean[]  hasVisited =new boolean[str.length()];
        uniquebacktracking(str.toCharArray(),chars,hasVisited,res);
        return res;
    }
    public  static void uniquebacktracking(final char[] str,List<Character> chars,boolean[] visited,ArrayList<String> res){
        if(chars.size() ==str.length){

            StringBuffer sb =new StringBuffer();
            for(char i:chars){
                sb.append(i);
            }
            res.add(sb.toString());
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(i != 0 && str[i] ==str[i-1]&&!visited[i -1 ] ){
                continue;
            }
            if(visited[i]){
                continue;
            }

            visited[i] =true;
            chars.add(str[i]);
            uniquebacktracking(str,chars,visited,res);
            chars.remove((chars.size() -1));

            visited[i]  =false;


        }

    }

    /**
     * 25. 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
     */

    public static int MoreThanHalfNum_Solution(int [] array) {
        int[] buckets =new int[1000];
        for(int i:array){
            buckets[i]++;
        }
        for(int j=0;j<buckets.length;j++){
            if(buckets[j] >array.length/2){
                return j;
            }
        }
        return 0;



    }

    /**
     * 26. 输入n个整数，找出其中最小的K个数
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length){
            return new ArrayList<>();
        }

        PriorityQueue<Integer>  pq =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int val:input){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }

        ArrayList<Integer> res =new ArrayList<>();
        while (!pq.isEmpty()){
            res.add(pq.poll());
        }
        Collections.reverse(res);



        return res;

    }

    /**
     * 27. 给一个数组，返回它的最大连续子序列的和
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        int res=array[0];
        int max =array[0];
        for(int i=1;i<array.length;i++){
            max = Math.max(max +array[i],array[i]);
            res =Math.max(max,res);
        }
        return res;
    }

    /**
     * 28.求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
     */
    public static int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0){
            return 0;
        }
        int count =0;
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=n;i++){
            sb.append(i);
        }

        for(char j:sb.toString().toCharArray()){
            if(j=='1'){
                count++;
            }
        }

        return count;

    }

    /**
     * 29. 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
     * 打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，
     * 则打印出这三个数字能排成的最小数字为321323。
     */
    public String PrintMinNumber(int [] numbers) {
        if(numbers ==null ||numbers.length==0)return "";
        int len =numbers.length;
        String[] str =new String[len];
        StringBuilder sb =new StringBuilder();
        for(int i =0;i<len;i++){
            str[i]=String.valueOf(numbers[i]);
        }


        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1=o1+o2;
                String c2=o2+o1;
                return c1.compareTo(c2);
            }
        });

        for(int i=0;i<len;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }

    /**
     * 30. 把只包含质因子2、3和5的数称作丑数（Ugly Number）
     * 求按从小到大的顺序的第N个丑数。
     */
    public int GetUglyNumber_Solution(int index) {
        if(index <=0) return 0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int i2=0,i3=0,i5=0;
        while (list.size()<index){
            int m2=list.get(i2)*2;
            int m3=list.get(i3)*3;
            int m5=list.get(i5)*5;
            int min =Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if(min ==m2) i2++;
            if(min ==m3) i3++;
            if(min ==m5) i5++;
        }

        return list.get(list.size()-1);

    }

    /**
     * 31. 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
     * 如果没有则返回 -1（需要区分大小写）.
     */
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time =map.get(str.charAt(i));
                map.put(str.charAt(i),++time);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        for(int j=0;j<str.length();j++){
            char c=str.charAt(j);
            if(map.get(c) ==1){
                return j;
            }
        }


        return -1;
    }

    /**
     * 32. 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P
     * 并将P对1000000007取模的结果输出。 即输出P%1000000007
     */
   private int cnt;
    public int InversePairs(int [] array) {
        cnt =0;
        if(array !=null){
            mergerSortUp2Down(array,0,array.length-1);
        }

        return cnt;


    }
    public void mergerSortUp2Down(int[] arr,int start,int end){
        if(start >=end)return;
        int mid =(start+end)/2;
        mergerSortUp2Down(arr,start,mid);
        mergerSortUp2Down(arr,mid+1,end);
        merge_32(arr,start,mid,end);
    }
    public void merge_32 (int[] arr,int start,int mid,int end){
        int[] tmp =new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while (i <=mid && j<=end){
            if(arr[i] <=arr[j]){
                tmp[k++] = arr[i++];
            }else {
                tmp[k++] =arr[j++];
//                cnt +=mid-i+1;
                cnt=(cnt+mid-i+1)%1000000007;
            }
        }
        while ( i<=mid){
            tmp[k++] =arr[i++];
        }
        while (j<=end){
            tmp[k++] =arr[j++];
        }

        for(k=0;k<tmp.length;k++){
            arr[start+k] =tmp[k];
        }
    }

    /**
     * 33. 输入两个链表，找出它们的第一个公共结点。
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 ==null ||pHead2 ==null)return null;
        int l1 =FindLength(pHead1);
        int l2=FindLength(pHead2);
        if(l1-l2>0){
              int step =l1-l2;
              while (step -->0){
                 pHead1= pHead1.next;
              }
        }else {
            int step =l2-l1;
            while (step -->0){
                pHead2= pHead2.next;
            }
        }
        while (pHead1 !=null ){
            if(pHead1 == pHead2) return pHead1;
            pHead1 =pHead1.next;
            pHead2 =pHead2.next;
        }
        return null;

    }
    public int FindLength(ListNode head){
        int length =0;
        while (head !=null){
            length +=1;
            head =head.next;
        }

        return length;

    }

    /**
     * 34. 统计一个数字在排序数组中出现的次数。
     */
    public static int GetNumberOfK(int [] array , int k) {
        if(array.length ==0)return 0;
        return biSearch(array,k+0.5)-biSearch(array,k-0.5);


    }
    public static int biSearch(int[] array,double num){
        int start =0;
        int end =array.length-1;
        while (start<=end){
            int mid =(start+end)/2;
            if(array[mid]<num){
                start =mid+1;
            }else {
                end =mid -1;
            }
        }

        return start;

    }

    /**
     * 35. 输入一棵二叉树，求该树的深度。
     */
    public int TreeDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(1+TreeDepth(root.left),1+TreeDepth(root.right));


    }
    /**
     * 36.一个整型数组里除了两个数字之外，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。
     */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int diff =0;
        for(int num:array){
            diff ^=num;
        }
        diff &=-diff;
        for(int num:array){
            if((num &diff) ==0){
                num1[0] ^=num;
            }else {
                num2[0] ^=num;
            }
        }


    }
    /**
     * 37. 输出所有和为S的连续正数序列。
     * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
     */
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > result =new ArrayList<>();
        int plow =1;
        int phigh=2;
        while (phigh>plow){
            int cur =(phigh+plow)*(phigh-plow+1)/2;
            if(cur ==sum){
                ArrayList<Integer> list =new ArrayList<>();
                for(int i=plow;i<=phigh;i++){
                    list.add(i);
                }

                result.add(list);
                plow++;
            }else if(cur <sum){
                phigh ++;
            }else {
                plow++;
            }
        }

        return result;

    }

    /**
     * 38. 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
     * 如果有多对数字的和等于S，输出两个数的乘积最小的。
     */

    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
           ArrayList<Integer> result =new ArrayList<>();
           int i =0,j=array.length-1;
           while (i<j){
               int cur =array[i]+array[j];
               if(cur == sum){
                   result.add(array[i]);
                   result.add(array[j]);
                   break;
               }else if(cur <sum){
                   i++;
               }else {
                   j--;
               }
           }
           return result;
    }

    /**
     * 39. 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,
     * 要求输出循环左移3位后的结果，即“XYZdefabc”
     */
    public String LeftRotateString(String str,int n) {
        StringBuilder sb =new StringBuilder();
        if(n<=str.length()){
            String str2=str;
            String str3 =str+str2;

            for(int i=n;i<str.toCharArray().length-1+n;i++){
                sb.append(str3.toCharArray()[i]);
            }
        }

        return sb.toString();

    }

    /**
     * 40. 翻转这些单词顺序
     */
    public static String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }


        String[] strs =str.split(" ");
        StringBuilder sb =new StringBuilder();
        for(int i=strs.length-1;i>=0;i--){
            sb.append(strs[i]);
            if(i !=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    /**
     * 41. LL今天心情特别好,因为他去买了一副扑克牌,
     * 发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
     * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
     * 如果抽到的话,他决定去买体育彩票,嘿嘿！！
     * “红心A,黑桃3,小王,大王,方片5”,
     * “Oh My God!”不是顺子.....LL不高兴了,
     * 他想了想,决定大\小 王可以看成任何数字,
     * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”
     * (大小王分别看作2和4),“So Lucky!”。
     * LL决定去买体育彩票啦。
     * 现在,要求你使用这幅牌模拟上面的过程,
     * 然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，
     * 否则就输出false。为了方便起见,你可以认为大小王是0。
     */
    public boolean isContinuous(int [] numbers) {
       if(numbers.length ==0)return false;
       int[] d =new int[14];
       int len=numbers.length;
       int max =-1;
       int min =14;
       for(int i=0;i<len;i++){
           d[numbers[i]]++;
           if(numbers[i] ==0) {
               continue;
           }
           if(d[numbers[i]]>1){
               return false;
           }
           if(numbers[i] >max){
               max =numbers[i];
           }
           if(numbers[i] <min){
               min =numbers[i];
           }
       }

       return (max -min )<5;
    }
    /**
     * 42. 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,
     * 让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
     * 然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
     * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....
     * 直到剩下最后一个小朋友,可以不用表演,
     * 并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
     * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n<1 || m<1)return -1;
        int[] array =new int[n];
        int i =-1,step=0,count=n;
        while (count>0){
            i++;
            if(i>=n) i=0;
            if(array[i] ==-1)continue;
            step ++;
            if(step ==m){
                array[i] =-1;
                step =0;
                count--;
            }
        }
        return i;

    }


    /**
     * 43. 求1+2+3+...+n，要求不能使用乘除法、
     * for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     */
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;

    }

    /**
     * 44. 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     */
    public int Add(int num1,int num2) {
        while (num2 !=0){
            int  tmp =num1^num2;
            num2 =(num1&num2)<<1;
            num1 =tmp;
        }
        return  num1;


    }

    /**
     * 45. 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
     * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0。
     */
    public int StrToInt(String str) {
        boolean flag=false;
        if(str ==null||str.trim().equals("")){
            flag =true;
            return 0;
        }

        int symbol =0;
        int start =0;
        char[] chars =str.trim().toCharArray();
        if(chars[0] =='+'){
            start =1;
        }else if(chars[0] =='-'){
            start =1;
            symbol=1;
        }
        int result =0;
        for(int i =start;i<chars.length;i++){
            if(chars[i] >'9'||chars[i]<'0'){
                flag =true;
                return 0;

            }
            int sum =result*10+(int)(chars[i]-'0');
            if((sum-(int)(chars[i]-'0'))/10!=result){
                flag=true;
                return 0;
            }

            result =result*10+(int)(chars[i]-'0');

        }
        result =(int)Math.pow(-1,symbol)*result;
        return result;


    }

    /**
     * 46. 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     */
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        boolean[] k = new boolean[length];
        for (int i = 0; i < k.length; i++) {
            if (k[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            }
            k[numbers[i]] = true;
        }
        return false;

    }

    /**
     * 47. 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
     * 不能使用除法。
     */
    public int[] multiply(int[] A) {
        int len =A.length;
        if(len ==0)return new int[0];

        int[] B =new int[len];
        B[0] =1;

        for(int i=1;i<len;i++){
            B[i] =B[i-1]*A[i-1];
        }
        int tmp =1;
        for(int j=len-2;j>=0;j--){
            tmp *=A[j+1];
            B[j] *=tmp;
        }
        return B;

    }

    /**
     * 48. 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
     * 模式中的字符'.'表示任意一个字符，
     * 而'*'表示它前面的字符可以出现任意次（包含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。
     * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
     * 但是与"aa.a"和"ab*a"均不匹配
     */
    public boolean match(char[] str, char[] pattern){
        if(str ==null ||pattern ==null){
            return false;
        }

        int strIndex =0;
        int pattrenIndex =0;
        return matchCord(str,strIndex,pattern,pattrenIndex);
    }
    public boolean matchCord(char[] str,int strIndex,char[] pattern,int patternIndex){
        if(strIndex ==str.length &&patternIndex ==pattern.length){
            return true;

        }

        if(strIndex !=str.length &&patternIndex ==pattern.length){
            return false;
        }

        if(patternIndex +1<pattern.length &&pattern[patternIndex +1]=='*'){
            if((strIndex !=str.length &&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&strIndex !=str.length)){
                return matchCord(str,strIndex,pattern,patternIndex+2)
                        || matchCord(str,strIndex+1,pattern,patternIndex+2)
                        || matchCord(str,strIndex+1,pattern,patternIndex);
            }else {
                return  matchCord(str,strIndex,pattern,patternIndex+2);
            }
        }

        if((strIndex !=str.length &&pattern[patternIndex] ==str[strIndex]) ||(pattern[patternIndex] =='.'&&strIndex !=str.length)){
            return matchCord(str,strIndex+1,pattern,patternIndex+1);
        }

        return false;
    }

    /**
     * 49.给一个链表，若其中包含环，请找出该链表的环的入口结点，
     * 否则，输出null。
     */
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead ==null ||pHead.next==null) return null;
        ListNode p1 =pHead;
        ListNode p2 =pHead;
        while ((p2 != null && p1 != null)) {

            p1 =p1.next;
            p2 =p2.next.next;
            if(p1 ==p2){
                p2=pHead;
                while (p1 !=p2){
                    p1 =p1.next;
                    p2 =p2.next;
                }

                if(p1==p2) return p1;
            }
        }
        return null;
    }

    /**
     * 50.在一个排序的链表中，存在重复的结点，请
     * 删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     */

    public ListNode deleteDuplication(ListNode pHead){
        ListNode first =new ListNode(-1);
        first.next =pHead;
        ListNode p=pHead;
        ListNode last =first;
        while (p!=null &&p.next !=null){
            if(p.val ==p.next.val){
                int val =p.val;
                while (p!=null&&p.val ==val){
                    p=p.next;

                }

                last.next =p;
            }else {
                last =p;
                p=p.next;
            }
        }

        return first.next;
    }

    /**
     * 51. 请实现一个函数，用来判断一颗二叉树是不是对称的。
     */
    public boolean isSymmetrical(TreeNode pRoot){
        if(pRoot ==null) return  true;

        return comRoot(pRoot.left,pRoot.right);

    }public boolean comRoot(TreeNode left,TreeNode right){
        if(left ==null) return right ==null;
        if(right ==null) return false;
        if(left.val !=right.val) return false;
        return  comRoot(left.right,right.left) &&comRoot(left.left,right.right);

    }

    /**
     * 52. 请实现一个函数按照之字形打印二叉树，
     * 即第一行按照从左到右的顺序打印，
     * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
     * 其他行以此类推。
     */
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> >  res =new ArrayList<>();
        if(pRoot ==null) return res;
        int layer =1;
        Stack<TreeNode> stack1 =new Stack<>();
        Stack<TreeNode> stack2 =new Stack<>();
        stack1.push(pRoot);
        while (!stack1.isEmpty() ||!stack2.isEmpty()){
            if(layer %2==1){
                ArrayList<Integer>  list =new ArrayList<>();
                while (!stack1.isEmpty()){
                    TreeNode node =stack1.pop();
                    if(node !=null){
                        list.add(node.val);
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }

                if(!list.isEmpty()){
                    res.add(list);
                    layer++;

                }

            }else {
                ArrayList<Integer>  list =new ArrayList<>();
                while (!stack2.isEmpty()){
                    TreeNode node =stack2.pop();
                    if(node !=null){
                        list.add(node.val);
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }

                if(!list.isEmpty()){
                    res.add(list);
                    layer ++;
                }

            }

        }

        return res;

    }

    /**
     * 53. 请实现两个函数，分别用来序列化和反序列化二叉树
     */

    //二叉树的序列化
    public String Serialize(TreeNode root) {
        StringBuilder sb =new StringBuilder();
        if(root ==null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));

        return sb.toString();


    }


    //二叉树的反序列化
    private  int index =-1;
    public TreeNode Deserialize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode node =null;
        if( !strings[index].equals("#")){
            node =new TreeNode(Integer.valueOf(strings[index]));
            node.left=Deserialize(str);
            node.right=Deserialize(str);
        }

        return node;

    }

    /**
     * 54. 给定一棵二叉搜索树，请找出其中的第k小的结点
     * 例如， （5，3，7，2，4，6，8）
     * 中，按结点数值大小顺序第三小结点的值为4。
     */
    public TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot ==null) return null;
        Stack<TreeNode>  stack =new Stack<>();
        int count =0;
        TreeNode node =pRoot;
        while (node !=null ||!stack.isEmpty()){
            if(node !=null){
                stack.push(node);
                node=node.left;
            }else {
                node =stack.pop();
                count ++;
                if(count ==k)return node;

                node =node.right;
            }
        }
        return null;
    }

    /**
     * 55. 如果从数据流中读出奇数个数值，
     * 那么中位数就是所有数值排序之后位于中间的数值。
     * 如果从数据流中读出偶数个数值，那么
     * 中位数就是所有数值排序之后中间两个数的平均值。
     * 我们使用Insert()方法读取数据流，
     * 使用GetMedian()方法获取当前读取数据的中位数。
     */
    private  int cnt_55 =0;
    private PriorityQueue<Integer> minHeap =new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap =new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    public void Insert(Integer num) {
        if(cnt_55 %2==0){
            maxHeap.offer(num);
            int MaxNum =maxHeap.poll();
            minHeap.offer(MaxNum);
        }else {
            minHeap.offer(num);
            int MinNum =minHeap.poll();
            maxHeap.offer(MinNum);
        }
        cnt_55++;

    }

    public Double GetMedian() {
        if(cnt_55 %2==0){
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }else {
            return new Double(minHeap.peek());
        }

    }

    /**
     * 56. 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
     * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
     * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
     * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
     * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
     * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {
     * 2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
     */

    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> res =new ArrayList<>();
        if(size ==0)return res;
        int begin;

        //双端队列
        ArrayDeque<Integer> q =new ArrayDeque<>();
        for(int i=0;i<num.length;i++){
            begin =i-size+1;
            if(q.isEmpty()){
                q.add(i);
            }
            else if(begin >q.peekFirst()){
                q.pollFirst();
            }

            while ((!q.isEmpty())&&num[q.peekLast()] <=num[i]){
                q.pollLast();
            }
            q.add(i);
            if(begin >=0){
                res.add(num[q.peekFirst()]);
            }
        }

        return res;
    }

    /**
     * 57. 请设计一个函数，
     * 用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，
     * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
     * 如果一条路径经过了矩阵中的某一个格子，
     * 则之后不能再次进入这个格子。
     * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中
     * 包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
     * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
     * 路径不能再次进入该格子。
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] flag =new boolean[matrix.length];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(judge(matrix,i,j,rows,cols,flag,str,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean judge(char[] matrix,int i,int j,int rows,int cols,boolean[] flag,char[] str,int k){
        int index =i*cols+j;

        if(i<0||j<0||i>=rows||j>=cols ||matrix[index] !=str[k] ||flag[index] ==true){
            return false;
        }
        if(k ==str.length-1) return true;
        flag[index] =true;

        if(judge(matrix,i-1,j,rows,cols,flag,str,k+1)
                ||judge(matrix,i+1,j,rows,cols,flag,str,k+1)
                ||judge(matrix,i,j+1,rows,cols,flag,str,k+1)
                ||judge(matrix,i,j-1,rows,cols,flag,str,k+1)){
            return true;
        }
        flag[index] =false;
        return false;
    }

    /**
     * 58. 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
     * 每一次只能向左，右，上，下四个方向移动一格，
     * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格（35,37），
     * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
     * 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */

    public int movingCount(int threshold, int rows, int cols){
        int[][] flag =new int[rows][cols];
        return helper(0,0,rows,cols,flag,threshold);
    }
    public int helper(int i,int j,int  rows,int cols,int[][] flag,int threshold){
        if(i<0 ||i>=rows ||j<0||j>=cols||numSum(i)+numSum(j) >threshold ||flag[i][j]==1) return 0;
        flag[i][j] =1;
        return helper(i-1,j,rows,cols,flag,threshold)+
                helper(i+1,j,rows,cols,flag,threshold)+
                helper(i,j+1,rows,cols,flag,threshold)+
                helper(i,j-1,rows,cols,flag,threshold)+1;

    }

    public int numSum(int i){
        int sum =0;
        while ( i>0){
            sum +=i%10;
            i=i/10;
        }
        return sum;

    }












































































}
 class ListNode{
    int val;
    ListNode next =null;

    ListNode(int val){
        this.val =val;
    }
 }

 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val =x;
    }
 }
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}