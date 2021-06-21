// sort integer array using quick sort
public class QuickSort {
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5,6};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void QuickSort(int[] arr, int low,int high){
        if(high>low){
            int newPivot=Partition(arr,low,high);
            QuickSort(arr,low,newPivot-1);
            QuickSort(arr,newPivot+1,high);
        }
    }
    static int Partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){

                i++;}
            while(arr[j]>pivot && j>low){

                j--;
            }
            if(i<j){

                Swap(arr,i,j);
            }
        }

        Swap(arr,low,j);
        return j;
    }
    static void Swap(int[] arr,int x ,int y){
        int temp;
        temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
