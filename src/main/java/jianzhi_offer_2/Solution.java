package jianzhi_offer_2;





import java.security.PublicKey;
import java.util.*;

/**
 * 1. 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * 2. 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 3. 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * 4. 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 *    则重建二叉树并返回。
 *
 * 5. 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 *6. 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 *
 * 7. 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 8. 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 9.我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 10. 约瑟夫环问题
 *
 * 11. 编程找出两个字符串中最大公共子字符串,如"abccade","dgcadde"的最大子串为"cad"
 *
 * 12. 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * 13. 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 14.输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 *
 * 15.输入一个链表，输出该链表中倒数第k个结点。
 *
 * 16. 输入一个链表，反转链表后，输出新链表的表头。
 *
 * 17. 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * 18.输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * 19. 操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 20. 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 21.输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 *
 * 22. 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * 23.输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 24. 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c
 * 所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */


public class Solution {
    public static void main(String[] args){

       // Josephus(10,3);
       /* String res =maxLength("abccadde","dgcadde");
        System.out.println(res);*/

//        System.out.println(Power(2,4));

        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(2);
        ListNode l3 =new ListNode(3);

        l1.next=l2;
        l2.next=l3;
        System.out.println(reverseList2(l1).val);


    }

    /**
     * 1.在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     */
    public boolean Find(int target, int [][] array) {
        int m =array.length;
        int n =array[0].length;
        int i=0,j=n-1;
        while (i<m && j>=0){
            if(array[i][j]>target){
                j--;
            }else if(array[i][j]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    /**
     * 2.请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     *   例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */


    public String replaceSpace(StringBuffer str) {

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return new String(str);
    }

    /**
     * 3. 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     */

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> res =new ArrayList<>();
        Stack<Integer> stack =new Stack<>();
        while (listNode !=null){
            stack.push(listNode.val);
            listNode =listNode.next;
        }

        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;

    }

    /**
     * 4. 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
     * 则重建二叉树并返回。
     * @param pre
     * @param in
     * @return
     */

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        TreeNode root =reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;


    }

    public TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
        if(startPre >endPre || startIn >endIn){
            return null;
        }

        TreeNode root =new TreeNode(pre[startPre]);

        for(int i=startIn;i<=endIn;i++){
            if(in[i] ==pre[startPre]){
                root.left =reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
                break;
            }
        }

        return root;

    }

    /**
     * 5. 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */

    public int minNumberInRotateArray(int [] array) {
        if(array.length ==0)
            return 0;
        int low =0,high= array.length-1;
        int mid =0;
        while (low<high){
            mid = (high + low)/2;
            if(array[mid] >array[high]){
                low =mid+1;

            }else if(array[mid] ==array[high]){
                high =high-1;
            }else {
                high =mid;
            }

        }

        return array[low];

    }

    /**
     * 6. 大家都知道斐波那契数列，现在要求输入一个整数n，
     * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     */

    public int Fibonacci(int n) {
        if (n==0)return 0;

        int prePreNum =0,preNum=1,res=1;
        for(int i=1;i<=n;i++){
            res=preNum+prePreNum;
            prePreNum =preNum;
            preNum=res;
        }
        return res;

    }

    /**
     * 7. 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    public int JumpFloor(int target) {
        if(target <=2)return target;
        int prePreNum =1,preNum=2,res =0;
        for(int i=3;i<=target;i++){
            res =prePreNum +preNum;
            prePreNum=preNum;
            preNum=res;
        }
        return res;

    }

    /**
     * 8. 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public int JumpFloorII(int target) {
        if(target <=1)return 1;
        return 2*JumpFloorII(target-1);
    }

    /**
     * 9. 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     */

    public int RectCover(int target) {

        if(target <=2)return target;

        return RectCover(target-1)+RectCover(target-2);

    }

    /**
     * 10. 约瑟夫环问题
     */
    public static  void Josephus(int totalNum,int KeyNum){
        LinkedList<Integer> list =new LinkedList<>();
        for(int i=0;i<totalNum;i++){
            list.addLast(i+1);
        }

        int index =0;
        while (list.size() >1){
            for(int i=1;i<KeyNum;i++){
                if(index ==list.size() -1){
                    index =0;
                }else {
                    index ++;
                }
            }
            list.remove(index);
        }

        System.out.println(totalNum + "个人围成一圈数数，数到" + KeyNum + "的被淘汰，最后剩下的是第" + list.get(0) + "个人。");

    }

    /**
     * 11. 编程找出两个字符串中最大公共子字符串,如"abccade","dgcadde"的最大子串为"cad"
     */
    public static String maxLength(String s1,String s2){
        String min =(s1.length() <= s2.length())?s1:s2;
        String max =(min.equals(s1))?s2:s1;

        if(max.contains(min)){
            return  min;
        }

        for(int i=0;i<min.length();i++){
            for(int start =i,end=min.length();end>start+1; end--){
                String temp =min.substring(start,end);
                if(max.contains(temp)){
                    return temp;
                }
            }
        }

        return "";

    }

    /**
     * 12. 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     */

    public int NumberOf1(int n) {

        int count =0;
        while (n !=0){
            count++;
            n= n&(n-1);
        }
        return count;

    }

    /**
     * 13. 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
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
     * 14. 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    public void reOrderArray(int [] array) {
        int i=0,j=0;
        while (i< array.length){
            while (i<array.length && array[i] %2 !=0){
                i++;
            }
            j=i+1;
            while (j<array.length && array[j] %2 ==0){
                j++;
            }

            if(j<array.length) {
                int tmp = array[j];
                for (int k = j-1; k >=i; k--) {
                    array[k + 1] = array[k];
                }

                array[i++] =tmp;

            }else {
                break;
            }

        }

    }

    /**
     * 15. 输入一个链表，输出该链表中倒数第k个结点。
     */
    public ListNode FindKthToTail(ListNode head,int k) {

        if(head ==null || k<=0){
            return null;
        }
        ListNode node =head;
        for (int i=1;i<k;i++){
            if(head.next !=null) {
                head = head.next;
            }else {
                return null;
            }
        }
        while (head.next !=null){
            head=head.next;
            node=node.next;
        }

        return node;

    }

    /**
     * 16. 输入一个链表，反转链表后，输出新链表的表头。
     */

    //头插法
    public ListNode ReverseList(ListNode head) {
        if(head ==null) return null;
        if(head.next ==null) return head;

        ListNode newhead=new ListNode(-1);
        while (head !=null){
            ListNode next =head.next;
            head.next =newhead.next;
            newhead.next =head;
            head =next;

        }

        return newhead.next;

    }

    //递归版本

    public static ListNode reverseList2(ListNode head){
        if(head ==null || head.next ==null)return head;

        ListNode next =head.next;
        head.next =null;
        ListNode newHead =reverseList2(next);
        next.next=head;
        return newHead;
    }

    /**
     * 17. 输入两个单调递增的链表，输出两个链表合成后的链表，
     * 当然我们需要合成后的链表满足单调不减规则。
     */

    //非递归版本
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 ==null)  return list2;
        if(list2 ==null)  return list1;

        ListNode newhead =null;
        ListNode current =null;
        while (list1 !=null &&list2 !=null){
            if(list1.val <=list2.val){
                if(newhead ==null){
                   newhead= current =list1;
                }else {
                    current.next =list1;
                    current =current.next;
                }
                list1 =list1.next;
            }else {
                if(newhead ==null){
                    newhead= current =list2;
                }else {
                    current.next =list2;
                    current =current.next;
                }

                list2 =list2.next;
            }
        }

        if(list1 ==null){
            current.next =list2;
        }else {
            current.next =list1;
        }

        return newhead;

    }

    //递归版本
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1 ==null)  return list2;
        if(list2 ==null)  return list1;

        if(list1.val <=list2.val){
            list1.next =Merge2(list1.next,list2);
            return list1;
        }else {
            list2.next =Merge2(list1,list2.next);
            return list2;
        }

    }

    /**
     * 18. 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     *
     */

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 ==null || root2 ==null) return false;
        return isSubtree(root1,root2) ||isSubtree(root1.left,root2) ||isSubtree(root1.right,root2);

    }

    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2 ==null) return true;
        if(root1 ==null) return false;
        if(root1.val !=root2.val) return false;
        return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);

    }

    /**
     * 19. 操作给定的二叉树，将其变换为源二叉树的镜像。
     */
    public void Mirror(TreeNode root) {
        TreeNode tmp =null;
        if(root ==null) return;
        if(root !=null){
            tmp =root.left;
            root.left =root.right;
            root.right =tmp;

        }

        if(root.left !=null) Mirror(root.left);
        if(root.right !=null) Mirror(root.right);


    }

    /**
     * 20. 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence ==null ||sequence.length ==0)return false;
        if(sequence.length ==1) return true;
        return judge_20(sequence,0,sequence.length-1);

    }
    public boolean judge_20(int[] sequence,int start,int right){
        if(start >=right) return true;
        int i=right;
        while (i>start &&sequence[i-1]>sequence[right]){
            i--;
        }

        for(int j= start;j<i-1;j++){
            if(sequence[j] >sequence[right]){
                return false;
            }
        }
        return  judge_20(sequence,start,i-1) &&judge_20(sequence,i,right-1);


    }

    /**
     * 21. 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * (注意: 在返回值的list中，数组长度大的数组靠前)
     */

    ArrayList<ArrayList<Integer>> result_21 =new ArrayList<>();
    ArrayList<Integer> lists_21 =new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root ==null) return result_21;
        lists_21.add(root.val);
        target -=root.val;
        if(target ==0 &&root.left ==null && root.right ==null){
            result_21.add(new ArrayList<Integer>(lists_21));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        lists_21.remove(lists_21.size()-1);
        return result_21;

    }


    /**
     * 22. 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
     * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
     * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     */
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead ==null) return pHead;

        RandomListNode head =pHead;
        while (head !=null ){
         RandomListNode cloneNode =new RandomListNode(head.label);
         RandomListNode next =head.next;
         head.next =cloneNode;
         cloneNode.next =next;
         head =next;
        }

        head =pHead;
        while (head !=null){
            head.next.random=head.random==null?null:head.random.next;
            head =head.next.next;
        }

        head =pHead;
        RandomListNode cloneHead =head.next;
        while (head !=null){
            RandomListNode clondNode =head.next;
            head.next =clondNode.next;
            clondNode.next=clondNode.next ==null?null:clondNode.next.next;
            head =head.next;
        }
        return cloneHead;
    }

    /**
     * 23. 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */

    TreeNode head_23 =null;
    TreeNode realHead_23 =null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return realHead_23;

    }
    public void ConvertSub(TreeNode pRootOfTree){
        if(pRootOfTree ==null){
            return;
        }
        ConvertSub(pRootOfTree.left);
        if(head_23 ==null){
            head_23 =pRootOfTree;
            realHead_23 =pRootOfTree;
        }else {
            head_23.right =pRootOfTree;
            pRootOfTree.left=head_23;
            head_23 =pRootOfTree;
        }
        ConvertSub(pRootOfTree.right);

    }

    /**
     * 24. 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c
     * 所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     */

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res =new ArrayList<>();
        List<Character> list =new ArrayList<>();
        if(str ==null ||str.length() ==0)return res;
        if(str.length()==1){
            res.add(str);
            return res;
        }
        Arrays.sort(str.toCharArray());
        boolean[] visited =new boolean[str.length()];
        backtracking(res,list,visited,str.toCharArray());
        return  res;


    }
    public void backtracking(ArrayList<String> res,List<Character> list,boolean[] visited,char[] chars){
        if(list.size() ==chars.length){
            StringBuilder sb =new StringBuilder();
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i));
            }

            res.add(sb.toString());
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(visited[i]){
                continue;
            }

            if(i !=0&&chars[i] ==chars[i-1] &&!visited[i-1]){
                continue;
            }

            visited[i] =true;
            list.add(chars[i]);
            backtracking(res,list,visited,chars);

            list.remove(list.size()-1);

            visited[i]=false;
        }

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
    TreeNode (int x){
        this.val =x;
    }
}

class RandomListNode{
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

