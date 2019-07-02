package jianzhi_offer;

import java.util.Stack;

public class minStack {

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public void push(int node){
        s1.push(node);
        if(s2.isEmpty()){
            s2.push(node);
        }else {
           if(node<=s2.peek()){
               s2.push(node);
           }
        }

    }
    public void pop(){
       if(s1.peek() == s2.peek()){
           s2.pop();
       }
       s1.pop();

    }

    public int top(){
      return s1.peek();

    }
    public int min(){
        return s2.peek();
    }

}
