package leetcode;

import com.sun.org.apache.regexp.internal.RE;
import javafx.util.Pair;
import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import java.util.*;
import java.util.logging.Level;

/**
 * 没想通的点
 * 1.快排查找第K大的数
 */

/**
 * 1.在有序数组中找出两个数，使它们的和为 target。
 * 2.判断一个数是否为两个数的平方和
 * 3.翻转字符串中的元音字符
 * 4.可以删除一个字符，判断是否能构成回文字符串
 * 5.把归并结果存到第一个数组上。
 * 6.判断链表是否有环
 * 7.删除 s 中的一些字符，使得它构成字符串列表 d 中的一个字符串，找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序的最小字符串。
 * 8.找到第 k 大的元素
 * 9.利用桶排序查找出现频率最高的K个数
 * 10.荷兰国旗问题
 * 11.饼干分配
 *      * 每个孩子都有一个满足度，每个饼干都有一个大小，只有饼干的大小大于等于一个孩子的满足度，该孩子才会获得满足。
 *      * 求解最多可以获得满足的孩子数量。
 * 12.计算让一组区间不重叠所需要移除的区间个数
 * 13.种花问题
 *      * 花朵之间至少需要一个单位的间隔，求解是否能种下 n 朵花。
 * 14.判断是否为子序列
 * 15.判断一个数组能不能只修改一个数就成为非递减数组
 * 16.求子数组最大和
 * 17.求最大收益
 * 18.求一个数的开方
 * 19.爬楼梯问题
 * 20.矩阵从左上到右下最短路径和问题
 * 21.01背包问题
 * 22.找到第一个单独存在的数
 * 23.寻找目标区间
 * 24.求解最短路径长度
 * 25.组成整数的最少平方数数量
 * 26.广度优先搜索最大连通面积
 * 27. 全排列问题
 * 28. 有重复元素的全排列问题
 * 29. 组合问题
 * 30. 含有相同元素时求所有子集
 * 31. N皇后问题
 * 32. 最长公共子序列
 * 33. 字符串加减法
 * 34. 寻找两条链表的交点
 * 35. 翻转链表
 * 36. 判断是否为回文链表
 * 37. 一棵树每层节点的平均数
 * 38. 二叉树的非递归遍历
 * 39. 寻找二叉查找树中第K个元素
 * 40. 用栈实现队列
 * 41. 用栈实现队列
 * 41. 用队列实现栈
 * 42. 数组中元素与下一个比它大的元素之间的距离
 * 43. 循环数组中比当前元素大的下一个元素
 * 44. 最长连续序列
 * 45. 两个字符串包含的字符是否完全相同
 * 46. 回文子字符串个数
 * 47. 数组中唯一一个不重复的元素
 *
 */


public class test {

    private final static HashSet<Character> vowels=new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    public static void main(String[] args){
//        int[] arr={1,2,3,4,5};
//        int target=7;
//        int[] res;
//        res=twoSum(arr,target);
//        for(int i=0;i<res.length;i++){
//            System.out.println("index"+(i+1)+"="+res[i]);
//        }
//        boolean square =judgeSquareSum(37);
//        System.out.println(square);
//        System.out.println(reverseVowels("hello world!"));
//        System.out.println(valindPalindrome("abca"));
//        int[] nums1={1,2,3,5,0,0,0};
//        int m=4;
//        int[] nums2={2,5,6};
//        int n=3;
//        merge(nums1,m,nums2,n);
//        for(int i=0;i<nums1.length;i++){
//            System.out.print(nums1[i]+" ");
//        }
//        String s="abpcplea";
//        List<String> d=Arrays.asList("ale","apple","monkey","plea");
//        System.out.println(findLongestWord(s,d));
//        int[] nums={1,1,1,2,2,3};
////        System.out.println(findKthLargest(nums,3));
//        List<Integer> list=topKFrequent(nums,4);
//        for(int num:list){
//            System.out.print(num + " ");
//        }

//        int[] arr = {2,0,2,1,1,0};
//        sortColors(arr);
//        printArr(arr);
//        int[] g={1,5};
//        int[] s={1,2,3};
//       System.out.println(findContentChildren(g,s));
//        Interval l1=new Interval(1,2);
//        Interval l2=new Interval(1,2);
//        Interval l3=new Interval(1,2);
//        Interval[] intervals={l1,l2,l3};
//        System.out.println(eraseOverlapIntervals(intervals));

//        int[] arr ={0,0,0,0,1};
//        int n = 2;
//        System.out.println(canPlaceFlowers(arr,n));

//        String s = "abc";
//        String t ="ahbfgdefv";
//        System.out.println(isSubsqquence(s,t));

//        int[] arr ={5,6,3};
//        System.out.println(checkPossibility(arr));

//        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

//        System.out.println(maxProfit(arr));
//        System.out.println(mysqrt(8));

//        System.out.println(climbStairs(10));

//        int[] arr ={5,7,7,8,8,10};
////        System.out.println(singleNum(arr));
////        System.out.println(searchRange(arr,2));
//        int[]  arr2 =searchRange(arr,8);
//        for(int i:arr2){
//            System.out.println(i);
//        }

//        int[][] arr ={{1,1,0,1},{1,0,1,0},{1,1,1,1},{1,0,1,1}};
//
//        System.out.println(minPathLength(arr,3,3));
//        System.out.println(numSquares(12));
//          int[][]  arr ={{1,0,1,0},{1,0,1,0},{0,1,0,1},{1,1,1,1}};

//        int[] arr={1,1,2};

//        List<List<Integer>> lists =permute(arr);
//        List<List<Integer>> list2 =permuteUnique(arr);
//        List<List<Integer>> list3 =combine(4,2);
//        int[]  arr ={1,2,2};
//        List<List<String>> list3 =solveNQueens(5);
//
//        for(List<String> list:list3){
//            for(String i:list){
//                System.out.println(i+" ");
//            }
//            System.out.println();
//        }

//        int[] arr1 ={1,2,3};
//        int[] arr2 ={1,2,3};
//        System.out.println(lengthOfLCS(arr1,arr2));
//        String s1 ="12345";
//        String s2 ="56789";
//        System.out.println(addString(s1,s2));
//        ListNode l1 =new ListNode(1);
//        ListNode l2=l1.next =new ListNode(2);
//        ListNode l3=l2.next =new ListNode(3);
//        ListNode l4=l3.next =new ListNode(2);
//        ListNode l5=l4.next =new ListNode(1);
//        System.out.println(isPalindrome(l1));

//        int[]  arr={73,74,75,71,69,72,76,73};
//        int[] res =nextGreaterElements(arr);
//        for(int i:res){
//            System.out.print(i+" ");
//        }
//         int[] arr ={100,4,200,1,3,2,300,5};
//         System.out.println(longestConsecutive(arr));

//        String s ="adsdasdsdsdsd";
//        String t ="sdaasdsdsdsdd";
//        System.out.println(countSubstrings(s));

        int[] arr ={1,1,2,3};
        List<List<Integer>> lists=permuteUnique(arr);
        for(List<Integer> list:lists){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }





    }


    /**
     *1.在有序数组中找出两个数，使它们的和为 target。
     */
    public static int[] twoSum(int[] numbers,int target){
        int i=0,j=numbers.length-1;
        while (i<j){
            int sum =numbers[i]+numbers[j];
            if(sum==target){
                return  new int[] {i+1,j+1};
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
        }
        return  null;
    }

    /**
     * 2.判断一个数是否为两个数的平方和
     * @param c
     * @return
     */
    public static boolean judgeSquareSum(int c){
        int i=0;
        int j=(int)Math.sqrt(c);
        while (i<=j){
            int powsum=i*i+j*j;
            if(powsum==c){
                return true;

            }else if(powsum>c){
                j--;

            }else {
                i++;
            }

        }
        return false;
    }

    /**
     * 3.翻转字符串中的元音字符
     */
    public static String reverseVowels(String s){
        int i=0,j=s.length()-1;
        char[] result=new char[s.length()];
        while (i<=j){
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(!vowels.contains(ci)){
                result[i++]=ci;
            }else if(!vowels.contains(cj)){
                result[j--]=cj;
            }else {
                result[i++]=cj;
                result[j--]=ci;
            }
        }

        return new String(result);
    }

    /**
     * 4.可以删除一个字符，判断是否能构成回文字符串
     */

    public static boolean valindPalindrome(String s){
        int i=-1;
        int j=s.length();
        while (++i<--j){
            if(s.charAt(i)!=s.charAt(j)){
                return ispalindrome(s,i,j-1)||ispalindrome(s,i+1,j);
            }
        }
        return true;
    }

    public static boolean ispalindrome(String s,int i,int j){
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    /**
     * 5.把归并结果存到第一个数组上。
     */
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int index1=m-1;
        int index2=n-1;
        int indexMerge=m+n-1;
        while (index1 >=0||index2 >=0){
            if(index1 < 0){
                nums1[indexMerge--]=nums2[index2--];
            }else if(index2 <0){
                nums1[indexMerge--]=nums1[index1--];
            }else if(nums1[index1]>nums2[index2]){
                nums1[indexMerge--]=nums1[index1 --];
            }else {
                nums1[indexMerge--]=nums2[index2 --];
            }
        }
    }

    /**
     * 6.判断链表是否有环
     *
     */
    public boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode l1=head;
        ListNode l2=head.next;
        while (l1 != null&&l2 != null&&l2.next != null){
            if(l1==l2){
                return true;
            }
            l1=l1.next;
            l2=l2.next.next;
        }
        return false;
    }

    /**
     * 7.删除 s 中的一些字符，使得它构成字符串列表 d 中的一个字符串，找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序的最小字符串。
     */
    public static String findLongestWord(String s, List<String> d){
        String longestWord="";
        for(String target:d){
            int l1=longestWord.length();
            int l2=target.length();
            if(l1 > l2 || (l1==l2&&longestWord.compareTo(target)<0)){
                continue;
            }
            if(isValid(s,target)){
                longestWord = target;
            }

        }

        return longestWord;
    }

    public static boolean isValid(String s,String target){
        int i = 0,j = 0;
        while (i<s.length()&&j < target.length()){
            if(s.charAt(i)==target.charAt(j)){
                j++;
            }
            i++;
        }
        return j==target.length();

    }

    /**
     * 8.找到第 k 大的元素
     */
    //堆排序
    public static int  findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int val:nums){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }

        return pq.poll();
    }

    /**
     *9.利用桶排序查找出现频率最高的K个数
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : frequencyForNum.keySet()) {
            int frequency = frequencyForNum.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
            if(buckets[i]==null){
                continue;
            }
            if (buckets[i].size() <= (k - topK.size())) {
                topK.addAll(buckets[i]);
            } else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }

    /**
     * 10.荷兰国旗问题
     */
    public static void sortColors(int[] nums){
        int zero=-1,one = 0,two = nums.length;
        while(one < two){
            if(nums[one]==0){
                swap(nums,++zero,one++);
            }else if(nums[one]==2){
                swap(nums,--two,one);
            }else {
                ++one;
            }
        }
    }

    /**
     * 11.饼干分配
     * 每个孩子都有一个满足度，每个饼干都有一个大小，只有饼干的大小大于等于一个孩子的满足度，该孩子才会获得满足。
     * 求解最多可以获得满足的孩子数量。
     */
    public static int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0;
        int si=0;
        while (gi<g.length && si<s.length){
            if(g[gi]<=s[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }







    /**
     * 交换两个位置的顺序
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i ,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }

    /**
     * 遍历打印数组
     * @param arr
     */
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 12.计算让一组区间不重叠所需要移除的区间个数
     */
    public static int eraseOverlapIntervals(Interval[] intervals){
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });

        int cnt =1;
        int end=intervals[0].end;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<end){
                continue;
            }
            end=intervals[i].end;
            cnt++;
        }

        return intervals.length - cnt;

    }

    /**
     * 13.种花问题
     * 花朵之间至少需要一个单位的间隔，求解是否能种下 n 朵花。
     */
    public static boolean canPlaceFlowers(int[] flowerbed,int n){
        int len = flowerbed.length;
        int cnt = 0;
        for(int i =0;i < len&&cnt < n;i++ ){
            if(flowerbed[i] == 1){
                continue;
            }

            int pre = i==0? 0:flowerbed[i-1];
            int next = i == len - 1 ? 0:flowerbed[i+1];
             if(pre ==0 && next ==0){
                 cnt++;
                 flowerbed[i] = 1;
             }
        }

        return cnt >= n;
    }

    /**
     * 14.判断是否为子序列
     */
    public static boolean isSubsqquence(String s,String t){
        int index = -1;
        for(char c : s.toCharArray()){
            index = t.indexOf(c,index + 1);
            if(index == -1){
                return false;
            }
        }
        return  true;
    }

    /**
     * 15.判断一个数组能不能只修改一个数就成为非递减数组
     */
    public static boolean checkPossibility(int[] nums){
        int cnt =0;
        for(int i = 1; i <nums.length && cnt < 2; i++){
            if(nums[i]>=nums[i-1]){
                continue;
            }
            cnt++;

            if(i-2>=0&&nums[i-2]>nums[i]){
                nums[i]=nums[i-1];
            }else {
                nums[i-1]=nums[i];
            }

        }

        return cnt <= 1;
    }

    /**
     * 16.求子数组最大和
     */
    public static  int maxSubArray(int[] nums){
        if(nums ==null || nums.length == 0){
            return 0;
        }
        int preSum = nums[0];
        int maxSum=preSum;

        for(int i =1; i<nums.length;i++){
            preSum = preSum>0?preSum + nums[i] :nums[i];
            maxSum =Math.max(maxSum,preSum);
        }
        return maxSum;
    }


    /**
     * 17.求最大收益
     */

    public static int maxProfit(int[] prices){
        int n = prices.length;
        if(n==0){
            return 0;
        }
        int soFarMin = prices[0];
        int max = 0;
        for(int i=1;i<n;i++){
            if(soFarMin > prices[i]){
                soFarMin=prices[i];
            }else {
                max =Math.max(max,prices[i] - soFarMin);
            }
        }
        return  max;


    }

    /**
     * 18.求一个数的开方
     */
    public  static int mysqrt(int x){
        if(x <=1){
            return x;
        }
        int l =1;
        int h =x;
        while (l<=h){
            int mid =l+(h-l)/2;
            int sqrt =x/mid;
            if(sqrt ==mid){
                return mid;
            }else if(mid > sqrt){
                h=mid -1;
            }else {
                l =mid + 1;
            }
        }

        return h;

    }

    /**
     * 19.爬楼梯问题
     */

    public static int climbStairs(int n){
        if(n <=2){
            return n;
        }

        int pre2 = 1;
        int pre1 = 2;
        for(int i =2;i<n;i++){
            int cur =pre1+pre2;
            pre2 = pre1;
            pre1 = cur;
        }

        return pre1;

    }

    /**
     * 20.矩阵从左上到右下最短路径和问题
     */

    public static int minPathSum(int[][] grid){
        if(grid.length==0||grid[0].length==0){
            return 0;
        }

        int m=grid.length,n=grid[0].length;
        int[] dp =new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    dp[j]=dp[j];
                }else if(i ==0){
                    dp[j]=dp[j -1];
                }else {
                    dp[j]=Math.min(dp[j-1],dp[j]);
                }

                dp[j] +=grid[i][j];
            }
        }

        return dp[n-1];
    }

    /**
     * 21.01背包问题
     */

    public static int knapsack(int W,int N,int[] weight,int[] values){

        int[] dp =new int[W+1];
        for(int i=1;i<=N;i++){
            int w=weight[i-1],v=values[i-1];
            for(int j =W;j>=1;j--){
                if(j >=w){
                    dp[j]=Math.max(dp[j],dp[j-w]+v);
                }
            }
        }
        return dp[W];

    }

    /**
     * 22.找到第一个单独存在的数
     */
    public static int singleNum(int[] nums){
        int l=0,h=nums.length -1 ;
        while (l<h){
            int m =l+(h - 1)/2;
            if(m % 2 ==1){
                m--;
            }

            if(nums[m] == nums[m+1]){
                l = m +2;
            }else {
                h=m;
            }
        }

        return nums[l];
    }

    /**
     * 23.寻找目标区间
     */

    public static int binarySearch(int[] nums,int target){
        int l=0,h=nums.length;
        while (l<h){
            int m=l+(h-1)/2;
            if(nums[m] >= target){
                h = m -1  ;
            }else {
                l=m+1;
            }

        }
        return l;
    }

    public static int[] searchRange(int[] nums,int target){
        int first = binarySearch(nums,target);
        int last =binarySearch(nums,target+1)-1;
        if(first == nums.length || nums[first] !=target){
            return new int[]{-1,-1};
        }else {
            return new int[]{first,Math.max(first,last)};
        }
    }

    /**
     * 24.求解最短路径长度
     */

    public static int minPathLength(int[][] grids,int tr,int tc){
        final int[][] direction ={{1,0},{-1,0},{0,1},{0,-1}};
        final int m =grids.length;
        final int n =grids[0].length;
        Queue<Pair<Integer,Integer>> queue =new LinkedList<>();

        queue.add(new Pair<>(0,0));

        int pathLength =0;
        while (!queue.isEmpty()){
            int size = queue.size();
            pathLength ++;
            while (size-- >0){
                Pair<Integer,Integer> cur =queue.poll();
                int cr =cur.getKey();
                int cc =cur.getValue();
                grids[cr][cc]=0;

                for(int[] d:direction){
                    int nr =cr+d[0],nc =cc+d[1];
                    if(nr < 0||nr>=m ||nc <0||nc>=n||grids[nr][nc]==0){
                        continue;
                    }

                    if(nr==tr &&nc==tc){
                        return pathLength;
                    }

                    queue.add(new Pair<>(nr,nc));
                }


            }
        }

        return -1;
    }

    /**
     * 25.组成整数的最少平方数数量
     */

    public static int numSquares(int n){
        List<Integer> squares =generateSquares(n);
        Queue<Integer> queue =new LinkedList<>();

        boolean[] marked =new  boolean[n+1];

        queue.add(n);

        marked[n] =true;
        int level =0;
        while (!queue.isEmpty()){
            int size =queue.size();
            level ++;
            while (size-- >0){
                int cur =queue.poll();

                for(int s:squares){
                    int next =cur -s;
                    if(next < 0){
                        break;
                    }
                    if(next ==0){
                        return level;
                    }

                    if(marked[next]){
                        continue;
                    }

                    marked[next] =true;
                    queue.add(next);

                }
            }
        }

        return n;
    }


    /**
     * 获取所有小于n的平方数
     * @param n
     * @return
     */
    public static List<Integer> generateSquares(int n){
        List<Integer> squares =new ArrayList<>();
        int square =1;
        int diff =3;
        while (square <=n){
            squares.add(square);
            square +=diff;
            diff +=2;
        }

        return squares;



    }

    /**
     * 26.最大连通面积
     */

    private static int m,n;

    private static int[][] dic ={{0,1},{0,-1},{1,0},{-1,0}};
    public static int maxArea(int[][] grid){
        if(grid == null || grid.length ==0){
            return 0;
        }

        m=grid.length;
        n=grid[0].length;
        int maxArea = 0;

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                maxArea =Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return  maxArea;

    }
    public  static int dfs(int[][] grid,int r,int c ){
        if(r<0||r>=m||c<0||c>=n||grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        int area =1;
        for(int[] d:dic){
            area +=dfs(grid,r+d[0],c+d[1]);
        }

        return area;

    }

    /**
     * 27 全排列问题
     */
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> permutes =new ArrayList<>();
        List<Integer> permuteList =new ArrayList<>();
        boolean[] hasVisited =new boolean[nums.length];

        backtracking(permuteList,permutes,hasVisited,nums);
        return permutes;

    }

    public static void backtracking(List<Integer> permuteList,List<List<Integer>> permutes,boolean[] visited,final int[] nums){
        if(permuteList.size() == nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i] =true;

            permuteList.add(nums[i]);

            backtracking(permuteList,permutes,visited,nums);

            permuteList.remove((permuteList.size() -1));
            visited[i] =false;
        }
    }

    /**
     * 28 有重复元素的全排列问题
     */

    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> permutes =new ArrayList<>();
        List<Integer> permuteList =new ArrayList<>();
        Arrays.sort(nums);

        boolean[]  hasVisited =new boolean[nums.length];
        uniquebacktracking(permuteList,permutes,hasVisited,nums);
        return permutes;
    }

    public static void uniquebacktracking(List<Integer> permuteList,List<List<Integer>> permutes,boolean[] visited,final int[] nums){
        if(permuteList.size() ==nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }

        for(int i=0;i<visited.length;i++){
            if(i != 0 && nums[i] ==nums[i-1]&&!visited[i -1 ] ){
                continue;
            }
            if(visited[i]){
                continue;
            }

            visited[i] =true;
            permuteList.add(nums[i]);
            uniquebacktracking(permuteList,permutes,visited,nums);
            permuteList.remove((permuteList.size() -1));

            visited[i]  =false;


        }


    }

    /**
     * 29. 组合问题
     */

    public static List<List<Integer>>  combine(int n,int k){
        List<List<Integer>>  combinations =new ArrayList<>();
        List<Integer>  combineList =new ArrayList<>();
        combinebacktracking(combineList,combinations,1,k,n);
        return combinations;
    }

    public  static void combinebacktracking(List<Integer> combinelist,List<List<Integer>> combination,int start,int k,final int n){

        if(k ==0){
            combination.add(new ArrayList<>(combinelist));
            return;
        }

        for(int i=start;i<=n-k+1;i++){
            combinelist.add(i);
            combinebacktracking(combinelist,combination,i+1,k-1,n);
            combinelist.remove(combinelist.size() -1);
        }

    }

    /**
     * 30. 含有相同元素时求所有子集
     */

    public static List<List<Integer>> subsets(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> subsets =new ArrayList<>();
        List<Integer> tempSubset =new ArrayList<>();
        boolean[] hasVisited =new boolean[nums.length];
        for(int size =0;size<= nums.length;size++){
            subsetsbacktracking(0,tempSubset,subsets,hasVisited,size,nums);

        }
        return subsets;
    }

    public static void  subsetsbacktracking(int start,List<Integer> tempSubset,List<List<Integer>> subsets,boolean[] hasVisited,final int size,final int[] nums){
        if(tempSubset.size() == size){
            subsets.add(new ArrayList<>(tempSubset));
            return;

        }

        for(int i=start;i<nums.length;i++){
            if(i != 0&&nums[i] ==nums[i-1]&&!hasVisited[i-1]){
                continue;
            }

            tempSubset.add(nums[i]);
            hasVisited[i]=true;

            subsetsbacktracking(i+1,tempSubset,subsets,hasVisited,size,nums);
            hasVisited[i] =false;
            tempSubset.remove(tempSubset.size() -1);

        }

    }

    /**
     * 31 N皇后
     */
    private static   List<List<String>> solutions;
    private static char[][] nQueens;
    private static boolean[] colUsed;
    private static boolean[] diagonals45Used;
    private static boolean[] diagonals135Used;


    public static List<List<String>> solveNQueens(int k){
        solutions =new ArrayList<>();
        nQueens =new char[k][k];
        for(int i=0;i<k;i++){
            Arrays.fill(nQueens[i],'.');
        }
        colUsed =new boolean[k];
        diagonals45Used =new boolean[2*k -1];
        diagonals135Used =new boolean[2*k -1];
        nqueensbacktracking(0,k);
        return solutions;
    }

    public static void nqueensbacktracking(int row,int k){
        if(row ==k){
            List<String> list =new ArrayList<>();
            for(char[] chars:nQueens){
                list.add(new String(chars));
            }

            solutions.add(list);
            return;
        }


        for(int col =0;col<k;col++){
            int diagonals45Idx =row+col;
            int diagonals135Idx =k-1-(row -col);

            if(colUsed[col] || diagonals135Used[diagonals135Idx]||diagonals45Used[diagonals45Idx]){
                continue;
            }

            nQueens[row][col] ='Q';
            colUsed[col]=diagonals45Used[diagonals45Idx]=diagonals135Used[diagonals135Idx] =true;
            nqueensbacktracking(row +1,k);
            colUsed[col]=diagonals45Used[diagonals45Idx]=diagonals135Used[diagonals135Idx] =false;
            nQueens[row][col] ='.';


        }


    }

    /**
     * 32 最长公共子序列
     */

    public static int lengthOfLCS (int[] nums1,int[] nums2){
        int n1 =nums1.length,n2=nums2.length;

        int[][] dp =new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(nums1[i-1] == nums2[j - 1]){
                    dp[i][j] =dp[i-1][j-1] +1;
                }else {
                    dp[i][j] =Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }

    /**
     * 33. 字符串加法
     */
    public static String addString(String s1,String s2){
        StringBuffer str =new StringBuffer();

        int carry = 0;
        int i = s1.length() -1;
        int j = s2.length() -1;

        while (carry ==1||i>=0||j>=0){
            int x =i<0 ? 0:s1.charAt(i--) -'0';
            int y =j<0 ? 0:s2.charAt(j--) -'0';
            str.append((x+y+carry) %10);
            carry =(x+y+carry)/10;
        }
        return  str.reverse().toString();


    }

    /**
     * 34.寻找链表的交点
     *
     *
     */

    public static ListNode getIntersectionNode(ListNode head1,ListNode head2){
        ListNode l1=head1,l2=head2;
        while (l1 !=l2){
            l1 =(l1 ==null)?head2 : l1.next;
            l2 =(l2 ==null)?head1 : l2.next;

        }

        return l1;

    }
    /**
     * 35. 翻转链表（递归）
     */

    public static ListNode reverseList(ListNode head){
        if(head ==null || head.next ==null){
            return head;
        }
        ListNode next =head.next;
        ListNode newhead =reverseList(next);

        next.next=head;
        head.next =null;

        return newhead;
    }

    /**
     * 翻转链表(头插法)
     */

    public static ListNode reverseList2(ListNode head){
        ListNode newhead =new ListNode(-1);
        while (head != null){
            ListNode next =head.next;
            head.next =newhead.next;
            newhead.next =head;
            head =next;
        }

        return newhead.next;
    }

    /**
     * 36. 判断是不是回文链表
     */


    public  static boolean isPalindrome(ListNode head){
        if(head == null || head.next ==null) return true;

        ListNode slow =head,fast =head.next;
        while (fast !=null && fast.next !=null){
            slow =slow.next;
            fast=fast.next.next;

        }

        if(fast !=null) slow =slow.next;
        cut(head,slow);
        return isEqual(head,reverseList(slow));
    }

    public static void cut(ListNode head,ListNode cutNode){
        while (head.next != cutNode){
            head=head.next;
        }
        head.next =null;
    }

    public static boolean isEqual(ListNode l1,ListNode l2){
        while (l1 != null && l2 !=null){
            if(l1.val !=l2.val)return false;

            l1=l1.next;
            l2=l2.next;
        }

        return true;


    }

    /**
     * 37. 一棵树每层节点的平均数
     */

    public static List<Double> average(TreeNode root){
        List<Double> ret =new ArrayList<>();
        if(root ==null) return ret;
        Queue<TreeNode>  queue =new LinkedList<>();
        queue.add(root);
        while ((!queue.isEmpty())){
            int cnt =queue.size();
            double sum =0;
            for(int i =0;i<cnt;i++){
                TreeNode node =queue.poll();
                sum +=node.root;
                if(node.left !=null){
                    queue.add(node.left);
                }
                if(node.right !=null){
                    queue.add(node.right);
                }
                ret.add(sum/cnt);

            }
        }

        return  ret;


    }

    /**
     * 38. 二叉树的非递归遍历
     */
    //前序遍历
    public static List<Integer> preTraversal(TreeNode root){
        List<Integer> ret =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();

        stack.push(root);
        while ((!stack.isEmpty())){
            TreeNode node =stack.pop();
            if(node ==null) continue;

            ret.add(node.root);
            stack.push(node.right);
            stack.push(node.left);
        }

        return ret;

    }

    //后序遍历
    public static List<Integer> postTravelsal(TreeNode root){
        List<Integer> ret =new ArrayList<>();
        Stack<TreeNode>  stack =new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node =stack.pop();
            if(node ==null) continue;
            ret.add(node.root);
            stack.push(node.left);
            stack.push(node.right);


        }

        Collections.reverse(ret);
        return ret;


    }

    //中序遍历
    public static List<Integer> inTraversal(TreeNode root){
        List<Integer> ret =new ArrayList<>();
        if(root ==null) return ret;
        Stack<TreeNode> stack =new Stack<>();
        TreeNode cur =root;

        while (cur !=null ||!stack.isEmpty()){
            while ((cur !=null)){
                stack.push(cur);
                cur =cur.left;
            }

            TreeNode node =stack.pop();
            ret.add(node.root);
            cur = node.right;
        }

        return ret;

    }

    /**
     * 39. 寻找二叉查找树中第K个元素
     */

    private int cnt =0;
    private int val;
    public int kthSmallest(TreeNode root,int k){
        inOrder(root,k);
        return val;
    }
    public void inOrder(TreeNode node,int k){
        if(node == null) return;
        inOrder(node.left,k);
        cnt ++;
        if(cnt ==k){
            val =node.root;
            return;
        }
        inOrder(node.right,k);
    }

    /**
     * 40. 用栈实现一个队列
     */

    class Myqueue{
        private Stack<Integer> in =new Stack<>();
        private Stack<Integer> out =new Stack<>();


        public void push(int x){
            in.push(x);
        }

        public void in2out(){
            if(out.isEmpty()){
                while (!in.isEmpty()){
                    out.push(in.pop());
                }
            }
        }

        public int pop(){
            in2out();
            return out.pop();
        }

        public int peek(){
            in2out();

            return out.peek();
        }

        public boolean empty(){
            return in.isEmpty()&&out.isEmpty();

        }

    }

    /**
     * 41. 用队列实现栈
     */

    class Mystack{
        private Queue<Integer> queue;

        public Mystack(){
            queue =new LinkedList<>();
        }

        public void push(int x ){
            queue.add(x);
            int cnt =queue.size();
            while (cnt -->1){
                queue.add(queue.poll());
            }
        }

        public int pop(){
            return queue.remove();

        }
        public int top(){
            return queue.peek();
        }

        public boolean empty(){
            return queue.isEmpty();
        }

    }
    /**
     * 42. 数组中元素与下一个比它大的元素之间的距离
     */

    public static int[] dailyTemperature(int[] tempetature){
        int n=tempetature.length;
        int[] dist=new int[n];
        Stack<Integer> indexs =new Stack<>();

        for(int curIndex =0;curIndex < n;curIndex ++){
            while (!indexs.isEmpty()&&tempetature[curIndex]  > tempetature[indexs.peek()]){
                int preIndex =indexs.pop();
                dist[preIndex] =curIndex - preIndex;
            }
            indexs.add(curIndex);
        }

        return dist;
    }

    /**
     * 43. 循环数组中比当前元素大的下一个元素
     */

    public static int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        int[] next=new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> pre =new Stack<>();
        for(int i=0;i<2*n;i++){
            int num =nums[i %n];
            while (!pre.isEmpty()&&nums[pre.peek()]<num){
                next[pre.pop()] =num;
            }

            if(i<n){
                pre.push(i);
            }
        }

        return next;
    }

    /**
     * 44. 最长连续序列
     */

    public static int longestConsecutive(int[] nums){
        Map<Integer,Integer> countForNum =new HashMap<>();
        for(int num:nums){
            countForNum.put(num,1);
        }

        for(int num:nums){
            forward(countForNum,num);
        }
        return maxCount(countForNum);


    }

    public static int forward(Map<Integer,Integer> countForNum,int num){
        if(!countForNum.containsKey(num)){
            return 0;
        }

        int cnt =countForNum.get(num);
        if(cnt > 1){
            return cnt;
        }

        cnt =forward(countForNum,num+1) +1;
        countForNum.put(num,cnt);
        return cnt;
    }

    public static int maxCount(Map<Integer,Integer> countForNum){
        int max =0;
        for (int num :countForNum.keySet()){
            max =Math.max(max,countForNum.get(num));
        }

        return max;
    }

    /**
     * 45. 两个字符串包含的字符是否完全相同
     */

    public static boolean isAnagram(String s,String t){
        int[] cnts =new int[26];
        for(char c:s.toCharArray()){
            cnts[c - 'a']++;
        }

        for(char c:t.toCharArray()){
            cnts[c - 'a']--;
        }

        for(int cnt:cnts){
            if(cnt != 0){
                return false;
            }
        }

        return true;
    }

    /**
     * 46. 回文子字符串个数
     */
    private static int cnt_46 =0;

    public static int countSubstrings(String s){
        for(int i=0;i<s.length();i++){
            extendSubstring(s,i,i);
            extendSubstring(s,i,i+1);
        }

        return cnt_46;


    }

    public static void extendSubstring(String s,int start,int end){
        while (start>=0&&end<s.length()&&s.charAt(start) == s.charAt(end)){
            start --;
            end ++;
            cnt_46 ++;
        }
    }

    /**
     * 47. 数组中唯一不重复的数
     */

    public static int singleNumber(int[] nums){
        int res =0;
        for(int n:nums) res =res ^n;

        return res;
    }







































}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
class TreeNode{
    int root;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        root =val;
    }
}

