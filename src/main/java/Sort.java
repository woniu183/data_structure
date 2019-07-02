import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.awt.event.AdjustmentEvent;
import java.lang.reflect.Array;
import java.util.*;

public class Sort {
    public static void  main(String[] args){
        int[] arr={59,38,26,0,15,1};
        //快速排序
//        quick_sort(arr,0,5);
        //堆排序
        heap_sort(arr);
        //希尔排序
//        shell_sort(arr1);
        //归并排序
//        merge_sort(arr);
        //桶排序
//        bucket_sort(arr1);
        //基数排序
//        radix_sort(arr1);
//        printArr(arr1);
        //冒泡排序
//        bubble_sort(arr1);
        //选择排序
//        select_sort(arr1);
        //插入排序
//        insert_sort(arr1);

/*        int testTime=50000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed =true;
        for(int i=0;i<testTime;i++){
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            bubble_sort(arr1);
            rightMathod(arr2);
            if(!isEqual(arr1,arr2)){
                succeed=false;
                break;
            }
        }

        System.out.println(succeed?"Nice!":"Failed!");*/
       printArr(arr);

      }
    /**
     * 基数排序
     */
    public static int getMax(int[] arr){
        int max;

        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

    /**
      * 对数组按照"某个位数"进行排序(桶排序)
      *
      * 参数说明：
      *     arr-- 数组
      *     exp -- 指数。对数组a按照该指数进行排序。
      *
      * 例如，对于数组arr={50, 3, 542, 745, 2014, 154, 63, 616}；
      *    (01) 当exp=1表示按照"个位"对数组arr进行排序
      *    (02) 当exp=10表示按照"十位"对数组arr进行排序
      *    (03) 当exp=100表示按照"百位"对数组arr进行排序
      *
      */
    public static void countSort(int[] arr,int exp){
        int[] output =new int[arr.length];  //临时数组，储备“被排序的数据”
        int[] buckets=new int [10];

        // 将数据出现的次数存储在buckets[]中
        for(int i=0;i<arr.length;i++){
            buckets[(arr[i]/exp)%10]++;
        }
        // 更改buckets[i]。目的是让更改后的buckets[i]的值，是该数据在output[]中的位置。
        for(int i=1;i<10;i++){
            buckets[i]+=buckets[i-1];
        }

        for(int i=arr.length-1;i>=0;i--){
            output[buckets[(arr[i]/exp)%10]-1]=arr[i];
            buckets[(arr[i]/exp)%10]--;
        }

        for(int i=0;i<arr.length;i++)
            arr[i]=output[i];


        output=null;
        buckets=null;

    }

    public static void radix_sort(int[] arr){
        int exp;
        int max=getMax(arr);

        for(exp=1;max/exp>0;exp *=10){
            countSort(arr,exp);
        }

    }






    /**
     * 桶排序
     */
    public static void bucket_sort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }

        int bucketNums=10;//确定桶的数量
        List<List<Integer>> buckets=new ArrayList<List<Integer>>();//桶的索引

        for(int i=0;i<10;i++){
            buckets.add(new LinkedList<Integer>());
        }

        //划分桶
        for(int i=0;i<arr.length;i++){
            buckets.get(f(arr[i])).add(arr[i]);
        }

        //对桶内元素进行排序

        for(int i=0;i<buckets.size();i++){
            if(!buckets.get(i).isEmpty()){
                Collections.sort(buckets.get(i));
            }
        }

        //还原排好序的数组
        int k=0;
        for(List<Integer>bucket:buckets){
            for(int ele:bucket){
                arr[k++]=ele;
            }
        }
    }

    public static int f(int x){
        return x/10;
    }


    /**
     * 归并排序
     *
     */
    public static void merge_sort(int[] arr){
        int[] temp=new int[arr.length];
        sort(arr,0,arr.length-1,temp);

    }
    public static void sort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid =(left+right)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[t++]=arr[i++];
        }else {
                temp[t++]=arr[j++];
            }

        }
        while (i<=mid){
            temp[t++]=arr[i++];

        }
        while (j<=right){
            temp[t++]=arr[j++];
        }
        t=0;

        //将temp数组拷贝到原数组
        while (left<=right){
            arr[left++]=temp[t++];
        }


    }






    /**
     * 希尔排序
     */
    public static void ShellInsert(int[] arr,int d){
        for(int i=d;i<arr.length;i++){
            int j=i-d;
            int temp=arr[i];
            while (j>=0&&arr[j]>temp){
                arr[j+d]=arr[j];
                j -=d;
            }
            if(j !=i-d){
                arr[j+d]=temp;
            }
        }
    }
    public static void shell_sort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        int d=arr.length/3;
        while (d>=1){
            ShellInsert(arr,d);
            d /=3;
        }
    }


    /**
     * 堆排序
     */
    public static void HeapAdjust(int[] arr ,int parent,int length){
        int temp =arr[parent];
        //先默认取左孩子
        int child=2*parent+1;

        while (child<length){
            //当存在右孩子，并且右孩子大于左孩子时，取右孩子
            if(child+1<length&&arr[child]<arr[child+1]){
                child++;
            }
            if(temp>=arr[child]){
                break;
            }
            arr[parent]=arr[child];
            parent=child;
            child=2*child+1;
        }
        //将父节点拿出来 放到排好的arr里
        arr[parent]=temp;
    }
    public static void heap_sort(int[] arr){
        //建立初始堆
        for(int i=arr.length/2;i>=0;i--){
            HeapAdjust(arr,i,arr.length);
        }
        //排序
        for(int i=arr.length-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            
            //筛选R[0]结点，得到i-1结点的堆
            HeapAdjust(arr,0,i);
        }
    }


    /**
     * 快速排序
     */
    public static int  patition(int[] arr,int left,int right){

        int pivotKey=arr[left];
        int pivotPointer=left;
        while (left<right){
            while (left<right&&arr[right]>=pivotKey){
                right--;
            }
            while (left<right&&arr[left]<=pivotKey){
                left++;
            }
            swap(arr,left,right);
        }
        swap(arr,left,pivotPointer);
        return left;
    }
    public static void quick_sort(int[] arr,int left,int right){
        if(arr==null||arr.length==0){
            return;
        }
        if(left>=right){
            return;
        }
        int pivotPos =patition(arr,left,right);
        quick_sort(arr,left,pivotPos-1);
        quick_sort(arr,pivotPos+1,right);
    }

    /**
     * 插入排序
     */
    public static void insert_sort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        printArr(arr);
    }


    /**
     * 冒泡排序
     * @param arr
     */
      public static void bubble_sort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=arr.length-1;j>i;j--){
                if (arr[j]<=arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
//        printArr(arr);
      }

    /**
     * 选择排序
     */
     public static void select_sort(int[] arr){
         if(arr==null||arr.length==0){
             return;
         }
         int minIndex=0;

         for(int i=0;i<arr.length-1;i++){
             minIndex=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[minIndex]){
                     minIndex=j;
                 }
             }

             if(minIndex!=i){
                 swap(arr,i,minIndex);
             }
         }

         printArr(arr);

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
     * 对数器
     */
    public static void rightMathod(int[] arr){
        Arrays.sort(arr);
    }

    /**
     * 随机数组发生器
     *
     */
    public static int[] generateRandomArray(int size,int value){
        int[] arr =new int[(int)((size+1)*Math.random())];

        for(int i=0;i<arr.length;i++){
            arr[i]=(int)((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }

    /**
     * 复制数组
     *
     */
    public static int[] copyArray(int[] arr){
        if(arr==null){
            return null;
        }

        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
    /**
     * 判断数组是否相等
     */
    public static boolean isEqual(int[] arr1,int[] arr2){
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}


