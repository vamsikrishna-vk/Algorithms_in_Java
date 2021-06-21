//binary search using recursion
public class BinarySearch {
    public static void main(String args[]){
        int[] arr={10,25,152,896,4445,20005,};
        System.out.println(BinarySearch(896,0,arr.length-1,arr));
    }
    static int BinarySearch(int key,int low,int high,int[] arr) {

        if (high >= low) {
            int mid = (high + low )/ 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return BinarySearch(key, low, mid-1, arr);
            } else {
                return BinarySearch(key, mid+1, high, arr);
            }
        }
        return -1;

    }
}
