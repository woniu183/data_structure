package practice2.sort;

public class Sort {
    public static void main(String[] args){
        int[] arr ={0,-1,1,-2,2};
//        merge_sort(arr);
//        quick_sort(arr,0,4);
        heap_sort(arr);
        printArr(arr);

    }


    /**
     * 堆排序
     */
    public static void heap_sort(int[] arr){
        for(int i=arr.length/2;i>=0;i--){
            HeapAdjust(arr,i,arr.length);

        }

        for(int i=arr.length-1;i>0;i--){
            int temp =arr[i];
            arr[i] =arr[0];
            arr[0] =temp;

            HeapAdjust(arr,0,i);
        }
    }

    public static void HeapAdjust(int[] arr,int parent,int length){
        int temp =arr[parent];

        int child =2*parent+1;
        while (child <length){

            if(child+1 <length && arr[child] <arr[child+1]){
                child++;
            }

            if(temp >=arr[child]){
                break;
            }

            arr[parent] =arr[child];
            parent=child;
            child =2*child+1;


        }
        arr[parent] =temp;
    }



    /**
     * 快速排序
     */

    public static void quick_sort(int[] arr,int left,int right){
        if(arr ==null || arr.length ==0){
            return;
        }

        if(left >=right){
            return;
        }

        int pivotPos =patition(arr,left,right);
        quick_sort(arr,left,pivotPos-1);
        quick_sort(arr,pivotPos+1,right);
    }
    public static int patition(int[] arr,int left,int right){
        int pivotKey =arr[left];
        int pivotPointer =left;
        while (left <right){
            while (left <right&&arr[right] >=pivotKey){
                right--;
            }
            while (left <right&&arr[left] <=pivotKey){
                left ++;
            }
            swap(arr,left,right);

        }
        swap(arr,left,pivotPointer);
        return left;
    }



    /**
     * 归并排序
     * @param arr
     */
    public static void merge_sort(int[] arr){
        int[] tmp =new int[arr.length];
        sort(arr,0,arr.length-1,tmp);

    }

    public static void sort(int[] arr,int left,int right,int[] temp){
        if(left < right){
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
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] =arr[i++];
            }else {
                temp[t++] =arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] =arr[i++];
        }
        while (j<=right){
            temp[t++] =arr[j++];
        }

        t=0;
        while (left <=right){
            arr[left++]=temp[t++];
        }
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
}
