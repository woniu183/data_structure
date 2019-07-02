import java.util.Stack;

public class MaxTree {
    public static  int[] buildMaxTree(int[] A, int n) {
       // write code here
        int result[] = new int[n];
          Stack<Integer> s = new Stack<>();
             for(int i = 0;i<n;i++)
               {
                  int max = -1;
                           
                     while( !s.empty() && A[s.peek()] < A[i] ) 
                     {
                         int t = s.peek();
                         s.pop();
                   
                           if( result[t] == -1 || A[result[t]] > A[i] )
                             result[t] = i;
                          } 
                       
                    if(!s.empty())
                    max = s.peek();

                   s.push(i);
                   result[i] = max;
         }

            return result;
    }

    public static void main(String[] args){
        int[] arr={3,1,5,2,4};
       int[] res= buildMaxTree(arr,5);
        for(int n:res){
            System.out.print(n+" ");
        }

    }
}

