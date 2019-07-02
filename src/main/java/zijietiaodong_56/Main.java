package zijietiaodong_56;

public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,4,5};
        System.out.println(findNumCount(arr,5));
    }

    public static int findNumCount(int[] arr,int num) {
        int len = arr.length;
        if (arr == null || len == 0) return 0;

        int mid = (len - 1) / 2;
        int index = binarySearch(arr, 0, len - 1, num);
        if (index == -1) {
            return 0;
        }
        int count = 0;
        int index2 = index-1;
        while (index <= len - 1 &&arr[index] ==num ) {
            count++;
            index++;

        }
        while (index2 >= 0 &&arr[index2] ==num ) {
            count++;
            index2--;
        }
        return count;
    }

    public static int binarySearch(int[] arr,int left,int right,int num){
        int mid =(left+right)/2;
        int index=-1;
        if(arr[mid] ==num){
            return mid;
    }
        if(left<=mid &&mid<=right){
        if(arr[mid] <num){

             index=binarySearch(arr,mid+1,right,num);
        }else{

             index=binarySearch(arr,left,mid-1,num);
        }
    }else{
        return -1;
    }

    return index;


   }
}
