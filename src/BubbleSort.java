// program to sort n elements using bubble sort brute force technique
public class BubbleSort {
    public static void main(String args[]){
        int[] arr={10,2,3,32,33,32};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
