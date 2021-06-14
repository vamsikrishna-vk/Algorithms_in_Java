//sort integer array using Merge Sort

import java.util.*;
public class MergeSort {
    public static void main(String args[]){
        int[] arr= {8,33,2,49,7,1,5,4,63,25};
        Mergesort(arr); // merge sort function
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    static void Mergesort(int[] arr){
       int n= arr.length;
        if(n>1){
            int[] Larray=new int[n/2];
            System.arraycopy(arr,0,Larray,0,(n/2)); // copy left half to Larray
            int[] Rarray=new int[n-(n/2)];
            System.arraycopy(arr,(n/2),Rarray,0,n-(n/2)); // copy right half to Rarray
            Mergesort(Larray);
            Mergesort(Rarray);
            Merge(arr,Larray,Rarray);
        }
    }
    static void Merge(int[] arr,int[] L,int[] R ){
        int i=0,j=0,k=0;
        int p=L.length;
        int q=R.length;
        while(i<p && j<q){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        if(i == p){
            System.arraycopy(R,j,arr,k,q-j);
        }
        else{
            System.arraycopy(L,i,arr,k,p-i);
        }
    }
}
