import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        int[] arr={1,9,3,2,4,1,55};
        int j,temp;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
