import java.util.*;
public class StackUsingArray {
    public static void main(String args[]) {
        stack s = new stack(10);
        int i=0;
        while(i!=10){
            s.push(10);
            i++;
        }
        i=0;
        while(i!=10){
            s.peek();
            s.pop();
            i++;
        }

    }
}
    class stack{
        int size,top,arr[];

        stack(int maxSize) {
            size=maxSize;
            arr= new int[size];
            top=-1;
        }
         void push(int ele){
            if(top==size-1){
                System.out.println("Stack overflow");
            }
            else{
                top++;
                arr[top]=ele;
            }
        }
        void pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
            }
            else{
                top--;
                arr[top+1]=0;
            }

        }
        void peek(){
            if(top==-1){
                System.out.println("stack is empty");
            }
            else{
                System.out.println(arr[top]);
            }
        }
    }

