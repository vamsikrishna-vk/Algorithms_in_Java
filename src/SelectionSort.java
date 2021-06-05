// Selection Sort using brute force technique
public class SelectionSort {
    public static void main(String args[]){
        int[] arr={10,12,34,11,0,8};
        int small= arr[0];
        int temp;
        for(int j=0;j<arr.length-1;j++) {
            small=arr[j];
            for (int i = j + 1; i < arr.length; i++) {
                if (small > arr[i]) {
                    small=arr[i];
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
